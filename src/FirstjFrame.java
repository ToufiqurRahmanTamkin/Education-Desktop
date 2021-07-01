import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.PreparedStatement;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FirstjFrame extends JFrame {

	private JPanel contentPane;

	Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;

	private JTextField usernameField;
	private JPasswordField passField;

	private JLabel clockLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstjFrame frame = new FirstjFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstjFrame() {
		setBackground(new Color(240, 240, 240));
		setIconImage(Toolkit.getDefaultToolkit().getImage(FirstjFrame.class.getResource("/Background/b1.jpg")));
		design();
		centerize();
		conn = SQLConnection.connecrDb();
		clock();

	}

	public void centerize() {
		Dimension screenSize, frameSize;
		int x, y;
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frameSize = getSize();
		x = (screenSize.width - frameSize.width) / 2;
		y = (screenSize.height - frameSize.height) / 2;
		setLocation(x, y);
	}

	private void login() {
		try {
			String query = "SELECT * FROM EMPLOYEE WHERE E_username = ? AND E_passward = ?";

			pst = conn.prepareStatement(query);
			pst.setString(1, usernameField.getText());
			pst.setString(2, passField.getText());

			rs = pst.executeQuery();
			// int count = 0;

			if (rs.next()) {
				JOptionPane.showMessageDialog(null, "Login Successful");
				Learning1st m = new Learning1st();
				m.setVisible(true);
				dispose();

			} else {
				JOptionPane.showMessageDialog(null, "Login Faild");
			}
			pst.close();
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void clock() {
		Thread clock = new Thread() {
			public void run() {
				try {
					for (;;) {
						Calendar cal = new GregorianCalendar();
						SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy   hh:mm a");
						Date date = cal.getTime();
						String timeString = formatter.format(date);
						clockLabel.setText(timeString);
						sleep(1000);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		clock.start();
	}

	private void design() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnLogin = new JButton("Login");
		btnLogin.setIcon(new ImageIcon(FirstjFrame.class.getResource("/design/in.png")));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setForeground(Color.GREEN);
		btnLogin.setBackground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (usernameField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Enter Username");
				} else if (passField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Enter passward to continue");
				} else {
					login();
				}
			}
		});
		btnLogin.setBounds(238, 171, 133, 49);
		contentPane.add(btnLogin);

		JButton btnSignupHere = new JButton("Signup Here");
		btnSignupHere.setIcon(new ImageIcon(FirstjFrame.class.getResource("/design/signup-icon.png")));
		btnSignupHere.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignupHere.setForeground(Color.BLUE);
		btnSignupHere.setBackground(Color.WHITE);
		btnSignupHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignupFrame frame = new SignupFrame();
				frame.setVisible(true);

			}
		});
		btnSignupHere.setBounds(208, 231, 191, 49);
		contentPane.add(btnSignupHere);

		usernameField = new JTextField();
		usernameField.setHorizontalAlignment(SwingConstants.CENTER);
		usernameField.setBounds(138, 105, 141, 30);
		contentPane.add(usernameField);
		usernameField.setColumns(10);

		passField = new JPasswordField();
		passField.setHorizontalAlignment(SwingConstants.CENTER);
		passField.setBounds(350, 105, 141, 30);
		contentPane.add(passField);

		clockLabel = new JLabel("Clock");
		clockLabel.setForeground(Color.WHITE);
		clockLabel.setBackground(Color.WHITE);
		clockLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
		clockLabel.setBounds(10, 11, 574, 49);
		contentPane.add(clockLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(107, 161, 60, 39);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(107, 211, 60, 39);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setIcon(new ImageIcon(FirstjFrame.class.getResource("/Icon/Users-icon.png")));
		label_3.setBounds(95, 101, 41, 39);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setIcon(new ImageIcon(FirstjFrame.class.getResource("/Icon/Generate-keys-icon.png")));
		label_4.setBounds(308, 105, 41, 30);
		contentPane.add(label_4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FirstjFrame.class.getResource("/Background/b1.jpg")));
		label.setBounds(0, 0, 584, 307);
		contentPane.add(label);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class secondary extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondary frame = new secondary();
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
	public secondary() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(secondary.class.getResource("/Image/Wallpaper-1.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(45, 244, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(388, 244, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setBounds(209, 244, 89, 23);
		contentPane.add(btnEnter);
		
		JLabel lblSecondaryEducation = new JLabel("SECONDARY EDUCATION");
		lblSecondaryEducation.setForeground(Color.BLACK);
		lblSecondaryEducation.setBackground(Color.WHITE);
		lblSecondaryEducation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSecondaryEducation.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondaryEducation.setBounds(0, 46, 525, 64);
		contentPane.add(lblSecondaryEducation);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(secondary.class.getResource("/Image/Wallpaper-1.jpg")));
		label.setBounds(0, 0, 525, 292);
		contentPane.add(label);
	}
}

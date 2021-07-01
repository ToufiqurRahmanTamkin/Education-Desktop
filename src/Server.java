import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField name1;
	private JTextField name2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name1 = new JTextField();
		name1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createroom();
			}
		});
		name1.setBounds(89, 70, 259, 32);
		contentPane.add(name1);
		name1.setColumns(10);
		
		name2 = new JTextField();
		name2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createroom();
			}
		});
		name2.setColumns(10);
		name2.setBounds(89, 163, 259, 32);
		contentPane.add(name2);
		
		JButton btnNewButton = new JButton("Join Chat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createroom();
			}
		});
		btnNewButton.setBounds(169, 206, 105, 32);
		contentPane.add(btnNewButton);
		
		JLabel lblstUsername = new JLabel("1st Username");
		lblstUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblstUsername.setBounds(89, 37, 259, 32);
		contentPane.add(lblstUsername);
		
		JLabel lblndUsername = new JLabel("2nd Username");
		lblndUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblndUsername.setBounds(89, 130, 259, 32);
		contentPane.add(lblndUsername);
	}

	public void createroom() {
		String p1,p2;
		p1 = name1.getText();
		p2 = name2.getText();
		if(p1.equals("") || p2.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Enter a Valid Username");
			return;
		}
		Window_1.username1 = name1.getText();
		Window_2.username2 = name2.getText();
		ChatRoom.createRoom();
		
	}
}


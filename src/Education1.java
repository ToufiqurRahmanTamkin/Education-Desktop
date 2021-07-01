import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class Education1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtContent;
	private JTextField txtKidsEducation;
	private JTextField txtSecondaryEducation;
	private JTextField txtHigherSecondaryEducation;
	private JTextField txtUndergraduateEducation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Education1 frame = new Education1();
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
	public Education1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Education1.class.getResource("/Background/b5.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtContent = new JTextField();
		txtContent.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtContent.setEditable(false);
		txtContent.setForeground(Color.BLACK);
		txtContent.setBackground(Color.WHITE);
		txtContent.setHorizontalAlignment(SwingConstants.CENTER);
		txtContent.setText("CONTENT");
		txtContent.setBounds(10, 21, 595, 47);
		contentPane.add(txtContent);
		txtContent.setColumns(10);
		
		txtKidsEducation = new JTextField();
		txtKidsEducation.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtKidsEducation.setForeground(Color.BLACK);
		txtKidsEducation.setBackground(Color.WHITE);
		txtKidsEducation.setEditable(false);
		txtKidsEducation.setHorizontalAlignment(SwingConstants.CENTER);
		txtKidsEducation.setText("Kids Education");
		txtKidsEducation.setBounds(10, 94, 279, 38);
		contentPane.add(txtKidsEducation);
		txtKidsEducation.setColumns(10);
		
		txtSecondaryEducation = new JTextField();
		txtSecondaryEducation.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtSecondaryEducation.setForeground(Color.BLACK);
		txtSecondaryEducation.setBackground(Color.WHITE);
		txtSecondaryEducation.setEditable(false);
		txtSecondaryEducation.setText("Secondary Education");
		txtSecondaryEducation.setHorizontalAlignment(SwingConstants.CENTER);
		txtSecondaryEducation.setColumns(10);
		txtSecondaryEducation.setBounds(10, 143, 279, 38);
		contentPane.add(txtSecondaryEducation);
		
		txtHigherSecondaryEducation = new JTextField();
		txtHigherSecondaryEducation.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtHigherSecondaryEducation.setForeground(Color.BLACK);
		txtHigherSecondaryEducation.setBackground(Color.WHITE);
		txtHigherSecondaryEducation.setEditable(false);
		txtHigherSecondaryEducation.setText("Higher Secondary Education");
		txtHigherSecondaryEducation.setHorizontalAlignment(SwingConstants.CENTER);
		txtHigherSecondaryEducation.setColumns(10);
		txtHigherSecondaryEducation.setBounds(10, 192, 279, 38);
		contentPane.add(txtHigherSecondaryEducation);
		
		txtUndergraduateEducation = new JTextField();
		txtUndergraduateEducation.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtUndergraduateEducation.setForeground(Color.BLACK);
		txtUndergraduateEducation.setBackground(Color.WHITE);
		txtUndergraduateEducation.setEditable(false);
		txtUndergraduateEducation.setText("Undergraduate Education");
		txtUndergraduateEducation.setHorizontalAlignment(SwingConstants.CENTER);
		txtUndergraduateEducation.setColumns(10);
		txtUndergraduateEducation.setBounds(10, 241, 279, 38);
		contentPane.add(txtUndergraduateEducation);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEnter.setIcon(new ImageIcon(Education1.class.getResource("/Icon/ok.png")));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KidsEducation ke = new KidsEducation();
				ke.setVisible(true);
				dispose();
			}
		});
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(324, 94, 130, 38);
		contentPane.add(btnEnter);
		
		JButton button = new JButton("ENTER");
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setIcon(new ImageIcon(Education1.class.getResource("/Icon/ok.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecondaryEducation se = new SecondaryEducation();
				se.setVisible(true);
				dispose();
			}
		});
		button.setForeground(Color.BLACK);
		button.setBackground(Color.WHITE);
		button.setBounds(324, 143, 130, 38);
		contentPane.add(button);
		
		JButton button_1 = new JButton("ENTER");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setIcon(new ImageIcon(Education1.class.getResource("/Icon/ok.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HigherSecondary hc=new HigherSecondary();
				hc.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(324, 192, 130, 38);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("ENTER");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.setIcon(new ImageIcon(Education1.class.getResource("/Icon/ok.png")));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Undergraduate ug=new Undergraduate();
				ug.setVisible(true);
				dispose();
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(324, 241, 130, 38);
		contentPane.add(button_2);
		
		JButton btnChatBox = new JButton("CHAT BOX");
		btnChatBox.setIcon(new ImageIcon(Education1.class.getResource("/Icon/Text-Edit-icon.png")));
		btnChatBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnChatBox.setForeground(Color.BLACK);
		btnChatBox.setBackground(Color.WHITE);
		btnChatBox.setBounds(475, 143, 130, 38);
		contentPane.add(btnChatBox);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setIcon(new ImageIcon(Education1.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(475, 241, 130, 38);
		contentPane.add(btnExit);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setIcon(new ImageIcon(Education1.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Learning1st l1 = new Learning1st();
				l1.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(475, 192, 130, 38);
		contentPane.add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Education1.class.getResource("/Background/b5.jpg")));
		label.setBounds(0, 0, 617, 315);
		contentPane.add(label);
	}

}

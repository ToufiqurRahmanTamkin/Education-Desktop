import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class HigherSecondary extends JFrame {

	private JPanel contentPane;
	private JTextField txtHigherMathematics;
	private JTextField txtPhysics;
	private JTextField txtChemistry;
	private JTextField txtBiology;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HigherSecondary frame = new HigherSecondary();
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
	public HigherSecondary() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HigherSecondary.class.getResource("/Background/b3.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setIcon(new ImageIcon(HigherSecondary.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Education1 e1 = new Education1();
				e1.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(10, 258, 110, 34);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setIcon(new ImageIcon(HigherSecondary.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(465, 258, 110, 34);
		contentPane.add(btnExit);
		
		txtHigherMathematics = new JTextField();
		txtHigherMathematics.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtHigherMathematics.setForeground(Color.BLACK);
		txtHigherMathematics.setBackground(Color.WHITE);
		txtHigherMathematics.setEditable(false);
		txtHigherMathematics.setHorizontalAlignment(SwingConstants.CENTER);
		txtHigherMathematics.setText("ICT");
		txtHigherMathematics.setBounds(74, 30, 295, 34);
		contentPane.add(txtHigherMathematics);
		txtHigherMathematics.setColumns(10);
		
		txtPhysics = new JTextField();
		txtPhysics.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPhysics.setForeground(Color.BLACK);
		txtPhysics.setBackground(Color.WHITE);
		txtPhysics.setEditable(false);
		txtPhysics.setText("Physics");
		txtPhysics.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhysics.setColumns(10);
		txtPhysics.setBounds(74, 75, 295, 34);
		contentPane.add(txtPhysics);
		
		txtChemistry = new JTextField();
		txtChemistry.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtChemistry.setForeground(Color.BLACK);
		txtChemistry.setBackground(Color.WHITE);
		txtChemistry.setEditable(false);
		txtChemistry.setText("Chemistry");
		txtChemistry.setHorizontalAlignment(SwingConstants.CENTER);
		txtChemistry.setColumns(10);
		txtChemistry.setBounds(74, 120, 295, 34);
		contentPane.add(txtChemistry);
		
		txtBiology = new JTextField();
		txtBiology.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtBiology.setForeground(Color.BLACK);
		txtBiology.setBackground(Color.WHITE);
		txtBiology.setEditable(false);
		txtBiology.setText("Biology");
		txtBiology.setHorizontalAlignment(SwingConstants.CENTER);
		txtBiology.setColumns(10);
		txtBiology.setBounds(74, 165, 295, 34);
		contentPane.add(txtBiology);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_3.setForeground(Color.BLACK);
		textField_3.setBackground(Color.WHITE);
		textField_3.setEditable(false);
		textField_3.setText("Higher Mathematics");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(74, 210, 295, 34);
		contentPane.add(textField_3);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnter.setIcon(new ImageIcon(HigherSecondary.class.getResource("/Icon/Check-icon.png")));
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(391, 30, 115, 34);
		contentPane.add(btnEnter);
		
		JButton button = new JButton("ENTER");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setIcon(new ImageIcon(HigherSecondary.class.getResource("/Icon/Check-icon.png")));
		button.setBackground(Color.WHITE);
		button.setBounds(391, 75, 115, 34);
		contentPane.add(button);
		
		JButton button_1 = new JButton("ENTER");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setIcon(new ImageIcon(HigherSecondary.class.getResource("/Icon/Check-icon.png")));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(391, 120, 115, 34);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("ENTER");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setIcon(new ImageIcon(HigherSecondary.class.getResource("/Icon/Check-icon.png")));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(391, 165, 115, 34);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("ENTER");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setIcon(new ImageIcon(HigherSecondary.class.getResource("/Icon/Check-icon.png")));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(391, 210, 115, 34);
		contentPane.add(button_3);
		
		JButton btnChatBox = new JButton("CHAT BOX");
		btnChatBox.setIcon(new ImageIcon(HigherSecondary.class.getResource("/Icon/Text-Edit-icon.png")));
		btnChatBox.setForeground(Color.BLACK);
		btnChatBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnChatBox.setBackground(Color.WHITE);
		btnChatBox.setBounds(218, 258, 144, 34);
		contentPane.add(btnChatBox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(HigherSecondary.class.getResource("/Background/b3.jpg")));
		label.setBounds(0, 0, 585, 303);
		contentPane.add(label);
	}

}

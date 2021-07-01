import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class SecondaryEducation extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnglish;
	private JTextField txtMathematics;
	private JTextField txtPhysics;
	private JTextField txtChemistry;
	private JTextField txtBoilogy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondaryEducation frame = new SecondaryEducation();
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
	public SecondaryEducation() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SecondaryEducation.class.getResource("/Background/b11.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setIcon(new ImageIcon(SecondaryEducation.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Education1 e1=new Education1();
				e1.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(10, 275, 113, 34);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setIcon(new ImageIcon(SecondaryEducation.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(453, 275, 113, 34);
		contentPane.add(btnExit);
		
		txtEnglish = new JTextField();
		txtEnglish.setForeground(Color.BLACK);
		txtEnglish.setBackground(Color.WHITE);
		txtEnglish.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtEnglish.setEditable(false);
		txtEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnglish.setText("English");
		txtEnglish.setBounds(58, 28, 323, 34);
		contentPane.add(txtEnglish);
		txtEnglish.setColumns(10);
		
		txtMathematics = new JTextField();
		txtMathematics.setForeground(Color.BLACK);
		txtMathematics.setBackground(Color.WHITE);
		txtMathematics.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMathematics.setEditable(false);
		txtMathematics.setText("Mathematics");
		txtMathematics.setHorizontalAlignment(SwingConstants.CENTER);
		txtMathematics.setColumns(10);
		txtMathematics.setBounds(58, 76, 323, 34);
		contentPane.add(txtMathematics);
		
		txtPhysics = new JTextField();
		txtPhysics.setForeground(Color.BLACK);
		txtPhysics.setBackground(Color.WHITE);
		txtPhysics.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPhysics.setEditable(false);
		txtPhysics.setText("Physics");
		txtPhysics.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhysics.setColumns(10);
		txtPhysics.setBounds(58, 121, 323, 34);
		contentPane.add(txtPhysics);
		
		txtChemistry = new JTextField();
		txtChemistry.setForeground(Color.BLACK);
		txtChemistry.setBackground(Color.WHITE);
		txtChemistry.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtChemistry.setEditable(false);
		txtChemistry.setText("Chemistry");
		txtChemistry.setHorizontalAlignment(SwingConstants.CENTER);
		txtChemistry.setColumns(10);
		txtChemistry.setBounds(58, 166, 323, 34);
		contentPane.add(txtChemistry);
		
		txtBoilogy = new JTextField();
		txtBoilogy.setForeground(Color.BLACK);
		txtBoilogy.setBackground(Color.WHITE);
		txtBoilogy.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtBoilogy.setEditable(false);
		txtBoilogy.setText("Biology");
		txtBoilogy.setHorizontalAlignment(SwingConstants.CENTER);
		txtBoilogy.setColumns(10);
		txtBoilogy.setBounds(58, 211, 323, 34);
		contentPane.add(txtBoilogy);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setIcon(new ImageIcon(SecondaryEducation.class.getResource("/Icon/check-1-icon.png")));
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(400, 28, 113, 34);
		contentPane.add(btnEnter);
		
		JButton button = new JButton("ENTER");
		button.setIcon(new ImageIcon(SecondaryEducation.class.getResource("/Icon/check-1-icon.png")));
		button.setForeground(Color.BLACK);
		button.setBackground(Color.WHITE);
		button.setBounds(400, 76, 113, 34);
		contentPane.add(button);
		
		JButton button_1 = new JButton("ENTER");
		button_1.setIcon(new ImageIcon(SecondaryEducation.class.getResource("/Icon/check-1-icon.png")));
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(400, 121, 113, 34);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("ENTER");
		button_2.setIcon(new ImageIcon(SecondaryEducation.class.getResource("/Icon/check-1-icon.png")));
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(400, 166, 113, 34);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("ENTER");
		button_3.setIcon(new ImageIcon(SecondaryEducation.class.getResource("/Icon/check-1-icon.png")));
		button_3.setForeground(Color.BLACK);
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(400, 211, 113, 34);
		contentPane.add(button_3);
		
		JButton btnChatBox = new JButton("CHAT BOX");
		btnChatBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnChatBox.setIcon(new ImageIcon(SecondaryEducation.class.getResource("/Icon/Text-Edit-icon.png")));
		btnChatBox.setForeground(Color.BLACK);
		btnChatBox.setBackground(Color.WHITE);
		btnChatBox.setBounds(217, 275, 152, 34);
		contentPane.add(btnChatBox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(SecondaryEducation.class.getResource("/Background/b11.jpg")));
		label.setBounds(0, 0, 576, 320);
		contentPane.add(label);
	}

}

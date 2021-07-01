import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class Undergraduate extends JFrame {

	private JPanel contentPane;
	private JTextField txtProgramming;
	private JTextField txtAppliedMath;
	private JTextField txtAppliedPhysics;
	private JTextField txtAppliedChemistry;
	private JTextField txtGeneralKnowledge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Undergraduate frame = new Undergraduate();
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
	public Undergraduate() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Undergraduate.class.getResource("/Background/b2.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setIcon(new ImageIcon(Undergraduate.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Education1 e1 = new Education1();
				e1.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(10, 273, 123, 34);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setIcon(new ImageIcon(Undergraduate.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(487, 273, 123, 34);
		contentPane.add(btnExit);
		
		txtProgramming = new JTextField();
		txtProgramming.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtProgramming.setForeground(Color.BLACK);
		txtProgramming.setBackground(Color.WHITE);
		txtProgramming.setEditable(false);
		txtProgramming.setHorizontalAlignment(SwingConstants.CENTER);
		txtProgramming.setText("Programming Language");
		txtProgramming.setBounds(91, 27, 286, 34);
		contentPane.add(txtProgramming);
		txtProgramming.setColumns(10);
		
		txtAppliedMath = new JTextField();
		txtAppliedMath.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtAppliedMath.setForeground(Color.BLACK);
		txtAppliedMath.setBackground(Color.WHITE);
		txtAppliedMath.setEditable(false);
		txtAppliedMath.setText("Applied Mathematics");
		txtAppliedMath.setHorizontalAlignment(SwingConstants.CENTER);
		txtAppliedMath.setColumns(10);
		txtAppliedMath.setBounds(91, 75, 286, 34);
		contentPane.add(txtAppliedMath);
		
		txtAppliedPhysics = new JTextField();
		txtAppliedPhysics.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtAppliedPhysics.setForeground(Color.BLACK);
		txtAppliedPhysics.setBackground(Color.WHITE);
		txtAppliedPhysics.setEditable(false);
		txtAppliedPhysics.setText("Applied Physics");
		txtAppliedPhysics.setHorizontalAlignment(SwingConstants.CENTER);
		txtAppliedPhysics.setColumns(10);
		txtAppliedPhysics.setBounds(91, 120, 286, 34);
		contentPane.add(txtAppliedPhysics);
		
		txtAppliedChemistry = new JTextField();
		txtAppliedChemistry.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtAppliedChemistry.setForeground(Color.BLACK);
		txtAppliedChemistry.setBackground(Color.WHITE);
		txtAppliedChemistry.setEditable(false);
		txtAppliedChemistry.setText("Applied Chemistry\r\n");
		txtAppliedChemistry.setHorizontalAlignment(SwingConstants.CENTER);
		txtAppliedChemistry.setColumns(10);
		txtAppliedChemistry.setBounds(91, 165, 286, 34);
		contentPane.add(txtAppliedChemistry);
		
		txtGeneralKnowledge = new JTextField();
		txtGeneralKnowledge.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtGeneralKnowledge.setForeground(Color.BLACK);
		txtGeneralKnowledge.setBackground(Color.WHITE);
		txtGeneralKnowledge.setEditable(false);
		txtGeneralKnowledge.setText("General Knowledge");
		txtGeneralKnowledge.setHorizontalAlignment(SwingConstants.CENTER);
		txtGeneralKnowledge.setColumns(10);
		txtGeneralKnowledge.setBounds(91, 213, 286, 34);
		contentPane.add(txtGeneralKnowledge);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnter.setIcon(new ImageIcon(Undergraduate.class.getResource("/Icon/Ok-icon.png")));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				programming pg = new programming();
				pg.setVisible(true);
				dispose();
			}
		});
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(387, 27, 113, 34);
		contentPane.add(btnEnter);
		
		JButton button = new JButton("ENTER");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setIcon(new ImageIcon(Undergraduate.class.getResource("/Icon/Ok-icon.png")));
		button.setForeground(Color.BLACK);
		button.setBackground(Color.WHITE);
		button.setBounds(387, 75, 113, 34);
		contentPane.add(button);
		
		JButton button_1 = new JButton("ENTER");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setIcon(new ImageIcon(Undergraduate.class.getResource("/Icon/Ok-icon.png")));
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(387, 120, 113, 34);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("ENTER");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setIcon(new ImageIcon(Undergraduate.class.getResource("/Icon/Ok-icon.png")));
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(387, 165, 113, 34);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("ENTER");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setIcon(new ImageIcon(Undergraduate.class.getResource("/Icon/Ok-icon.png")));
		button_3.setForeground(Color.BLACK);
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(387, 213, 113, 34);
		contentPane.add(button_3);
		
		JButton btnChatbox = new JButton("CHAT BOX");
		btnChatbox.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnChatbox.setIcon(new ImageIcon(Undergraduate.class.getResource("/Icon/Text-Edit-icon.png")));
		btnChatbox.setForeground(Color.BLACK);
		btnChatbox.setBackground(Color.WHITE);
		btnChatbox.setBounds(234, 273, 143, 34);
		contentPane.add(btnChatbox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Undergraduate.class.getResource("/Background/b2.jpg")));
		label.setBounds(0, 0, 620, 318);
		contentPane.add(label);
	}
}

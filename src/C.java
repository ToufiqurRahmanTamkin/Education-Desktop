import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class C extends JFrame {

	private JPanel contentPane;
	private JTextField txtCProgramming;
	private JTextField txtVariableDeclaration;
	private JTextField txtArray;
	private JTextField txtLoop;
	private JTextField txtString;
	private JTextField txtPointer;
	private JTextField txtStructure;

	/**
	 * Launch the application.
	 */
	public static void cprogram() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C frame = new C();
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
	public C() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(C.class.getResource("/Background/b6.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVariableDeclaration = new JButton("ENTER");
		btnVariableDeclaration.setIcon(new ImageIcon(C.class.getResource("/Icon/Actions-dialog-ok-icon.png")));
		btnVariableDeclaration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				variable v2 = new variable();
				v2.fun();
				dispose();
				
			}
		});
		btnVariableDeclaration.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVariableDeclaration.setBackground(Color.WHITE);
		btnVariableDeclaration.setForeground(Color.BLACK);
		btnVariableDeclaration.setBounds(427, 61, 121, 39);
		contentPane.add(btnVariableDeclaration);
		
		JButton btnArray = new JButton("ENTER");
		btnArray.setIcon(new ImageIcon(C.class.getResource("/Icon/Actions-dialog-ok-icon.png")));
		btnArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Array arr = new Array();
				arr.arraypage();
				dispose();
			}
		});
		btnArray.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnArray.setForeground(Color.BLACK);
		btnArray.setBackground(Color.WHITE);
		btnArray.setBounds(427, 109, 121, 37);
		contentPane.add(btnArray);
		
		JButton btnString = new JButton("ENTER");
		btnString.setIcon(new ImageIcon(C.class.getResource("/Icon/Actions-dialog-ok-icon.png")));
		btnString.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				string s1 = new string();
				s1.fun();
				dispose();
			}
		});
		btnString.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnString.setForeground(Color.BLACK);
		btnString.setBackground(Color.WHITE);
		btnString.setBounds(427, 204, 121, 37);
		contentPane.add(btnString);
		
		JButton btnLoop = new JButton("ENTER");
		btnLoop.setIcon(new ImageIcon(C.class.getResource("/Icon/Actions-dialog-ok-icon.png")));
		btnLoop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loop1 forloop = new Loop1();
				forloop.L1();
				dispose();
			}
		});
		btnLoop.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLoop.setForeground(Color.BLACK);
		btnLoop.setBackground(Color.WHITE);
		btnLoop.setBounds(427, 157, 121, 37);
		contentPane.add(btnLoop);
		
		JButton btnPointer = new JButton("ENTER");
		btnPointer.setIcon(new ImageIcon(C.class.getResource("/Icon/Actions-dialog-ok-icon.png")));
		btnPointer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pointer1 p1 = new pointer1();
				p1.pointerpage();
				dispose();
				
			}
		});
		btnPointer.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPointer.setForeground(Color.BLACK);
		btnPointer.setBackground(Color.WHITE);
		btnPointer.setBounds(427, 251, 121, 37);
		contentPane.add(btnPointer);
		
		JButton btnStructure = new JButton("ENTER");
		btnStructure.setIcon(new ImageIcon(C.class.getResource("/Icon/Actions-dialog-ok-icon.png")));
		btnStructure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				structure st = new structure();
				st.strpage();
				dispose();
			}
		});
		btnStructure.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnStructure.setForeground(Color.BLACK);
		btnStructure.setBackground(Color.WHITE);
		btnStructure.setBounds(427, 300, 121, 39);
		contentPane.add(btnStructure);
		
		JButton btnBack = new JButton("Back");
		btnBack.setIcon(new ImageIcon(C.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				programming pg = new programming();
				pg.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(10, 365, 102, 37);
		contentPane.add(btnBack);
		
		txtCProgramming = new JTextField();
		txtCProgramming.setEditable(false);
		txtCProgramming.setForeground(Color.BLACK);
		txtCProgramming.setBackground(Color.WHITE);
		txtCProgramming.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtCProgramming.setHorizontalAlignment(SwingConstants.CENTER);
		txtCProgramming.setText("C Programming");
		txtCProgramming.setBounds(10, 22, 642, 28);
		contentPane.add(txtCProgramming);
		txtCProgramming.setColumns(10);
		
		txtVariableDeclaration = new JTextField();
		txtVariableDeclaration.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtVariableDeclaration.setHorizontalAlignment(SwingConstants.CENTER);
		txtVariableDeclaration.setText("Variable Declaration");
		txtVariableDeclaration.setBounds(88, 63, 299, 37);
		contentPane.add(txtVariableDeclaration);
		txtVariableDeclaration.setColumns(10);
		
		txtArray = new JTextField();
		txtArray.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtArray.setText("Array");
		txtArray.setHorizontalAlignment(SwingConstants.CENTER);
		txtArray.setColumns(10);
		txtArray.setBounds(88, 111, 299, 37);
		contentPane.add(txtArray);
		
		txtLoop = new JTextField();
		txtLoop.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtLoop.setText("Loop");
		txtLoop.setHorizontalAlignment(SwingConstants.CENTER);
		txtLoop.setColumns(10);
		txtLoop.setBounds(88, 159, 299, 37);
		contentPane.add(txtLoop);
		
		txtString = new JTextField();
		txtString.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtString.setText("String");
		txtString.setHorizontalAlignment(SwingConstants.CENTER);
		txtString.setColumns(10);
		txtString.setBounds(88, 206, 299, 37);
		contentPane.add(txtString);
		
		txtPointer = new JTextField();
		txtPointer.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPointer.setText("Pointer");
		txtPointer.setHorizontalAlignment(SwingConstants.CENTER);
		txtPointer.setColumns(10);
		txtPointer.setBounds(88, 253, 299, 37);
		contentPane.add(txtPointer);
		
		txtStructure = new JTextField();
		txtStructure.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtStructure.setText("Structure");
		txtStructure.setHorizontalAlignment(SwingConstants.CENTER);
		txtStructure.setColumns(10);
		txtStructure.setBounds(88, 302, 299, 37);
		contentPane.add(txtStructure);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setIcon(new ImageIcon(C.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(531, 361, 121, 37);
		contentPane.add(btnExit);
		
		JButton btnChatBox = new JButton("CHAT BOX");
		btnChatBox.setIcon(new ImageIcon(C.class.getResource("/Icon/Text-Edit-icon.png")));
		btnChatBox.setForeground(Color.BLACK);
		btnChatBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnChatBox.setBackground(Color.WHITE);
		btnChatBox.setBounds(250, 363, 134, 39);
		contentPane.add(btnChatBox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(C.class.getResource("/Background/b6.jpg")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 662, 409);
		contentPane.add(label);
	}
}

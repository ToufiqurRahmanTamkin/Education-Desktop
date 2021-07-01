import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class programming extends JFrame {

	private JPanel contentPane;
	private JTextField txtCprogramming;
	private JTextField txtCProgramming;
	private JTextField txtJavaProgramming;
	private JTextField txtObjectorientedProgrammingoop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					programming frame = new programming();
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
	public programming() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(programming.class.getResource("/Background/b7.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.setIcon(new ImageIcon(programming.class.getResource("/Icon/c1.png")));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				C c1 = new C();
				c1.cprogram();
				dispose();
				
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(401, 61, 125, 37);
		contentPane.add(btnNewButton);
		
		JButton btnJavaprogramming = new JButton("ENTER");
		btnJavaprogramming.setIcon(new ImageIcon(programming.class.getResource("/Icon/c1.png")));
		btnJavaprogramming.setForeground(Color.BLACK);
		btnJavaprogramming.setBackground(Color.WHITE);
		btnJavaprogramming.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnJavaprogramming.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()>0) {
					if(Desktop.isDesktopSupported()) {
						Desktop desktop = Desktop.getDesktop();
						try {
							URI uri = new URI("http://www.cplusplus.com/doc/tutorial/");
							desktop .browse(uri);
						}catch(IOException ex) {
							ex.printStackTrace();
						}catch(URISyntaxException ex) {
							ex.printStackTrace();
						}
					}
				}
			}
		});
		btnJavaprogramming.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnJavaprogramming.setBounds(401, 109, 125, 36);
		contentPane.add(btnJavaprogramming);
		
		JButton btnJavaprogramming_1 = new JButton("ENTER");
		btnJavaprogramming_1.setIcon(new ImageIcon(programming.class.getResource("/Icon/c1.png")));
		btnJavaprogramming_1.setForeground(Color.BLACK);
		btnJavaprogramming_1.setBackground(Color.WHITE);
		btnJavaprogramming_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					if(e.getClickCount()>0) {
						if(Desktop.isDesktopSupported()) {
							Desktop desktop = Desktop.getDesktop();
							try {
								URI uri = new URI("https://www.programiz.com/java-programming");
								desktop .browse(uri);
							}catch(IOException ex) {
								ex.printStackTrace();
							}catch(URISyntaxException ex) {
								ex.printStackTrace();
							}
						}
					}
				
			}
		});
		btnJavaprogramming_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnJavaprogramming_1.setBounds(401, 156, 125, 39);
		contentPane.add(btnJavaprogramming_1);
		
		JButton btnObjectOrientedProgramming = new JButton("ENTER");
		btnObjectOrientedProgramming.setIcon(new ImageIcon(programming.class.getResource("/Icon/c1.png")));
		btnObjectOrientedProgramming.setForeground(Color.BLACK);
		btnObjectOrientedProgramming.setBackground(Color.WHITE);
		btnObjectOrientedProgramming.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()>0) {
					if(Desktop.isDesktopSupported()) {
						Desktop desktop = Desktop.getDesktop();
						try {
							URI uri = new URI("https://searchmicroservices.techtarget.com/definition/object-oriented-programming-OOP");
							desktop .browse(uri);
						}catch(IOException ex) {
							ex.printStackTrace();
						}catch(URISyntaxException ex) {
							ex.printStackTrace();
						}
					}
				}
			}
		});
		btnObjectOrientedProgramming.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnObjectOrientedProgramming.setBounds(401, 206, 125, 37);
		contentPane.add(btnObjectOrientedProgramming);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Undergraduate ug = new Undergraduate();
				ug.setVisible(true);
				dispose();
			}
		});
		btnBack.setIcon(new ImageIcon(programming.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBounds(36, 295, 120, 34);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setIcon(new ImageIcon(programming.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBounds(482, 295, 120, 34);
		contentPane.add(btnExit);
		
		txtCprogramming = new JTextField();
		txtCprogramming.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtCprogramming.setForeground(Color.BLACK);
		txtCprogramming.setBackground(Color.WHITE);
		txtCprogramming.setEditable(false);
		txtCprogramming.setHorizontalAlignment(SwingConstants.CENTER);
		txtCprogramming.setText("C - Programming");
		txtCprogramming.setBounds(96, 61, 282, 37);
		contentPane.add(txtCprogramming);
		txtCprogramming.setColumns(10);
		
		txtCProgramming = new JTextField();
		txtCProgramming.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtCProgramming.setForeground(Color.BLACK);
		txtCProgramming.setBackground(Color.WHITE);
		txtCProgramming.setEditable(false);
		txtCProgramming.setText("C++  Programming");
		txtCProgramming.setHorizontalAlignment(SwingConstants.CENTER);
		txtCProgramming.setColumns(10);
		txtCProgramming.setBounds(96, 109, 282, 37);
		contentPane.add(txtCProgramming);
		
		txtJavaProgramming = new JTextField();
		txtJavaProgramming.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtJavaProgramming.setForeground(Color.BLACK);
		txtJavaProgramming.setBackground(Color.WHITE);
		txtJavaProgramming.setEditable(false);
		txtJavaProgramming.setText("Java Programming");
		txtJavaProgramming.setHorizontalAlignment(SwingConstants.CENTER);
		txtJavaProgramming.setColumns(10);
		txtJavaProgramming.setBounds(96, 156, 282, 39);
		contentPane.add(txtJavaProgramming);
		
		txtObjectorientedProgrammingoop = new JTextField();
		txtObjectorientedProgrammingoop.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtObjectorientedProgrammingoop.setForeground(Color.BLACK);
		txtObjectorientedProgrammingoop.setBackground(Color.WHITE);
		txtObjectorientedProgrammingoop.setEditable(false);
		txtObjectorientedProgrammingoop.setText("Object-Oriented Programming (OOP)");
		txtObjectorientedProgrammingoop.setHorizontalAlignment(SwingConstants.CENTER);
		txtObjectorientedProgrammingoop.setColumns(10);
		txtObjectorientedProgrammingoop.setBounds(96, 206, 282, 37);
		contentPane.add(txtObjectorientedProgrammingoop);
		
		JButton btnChatBox = new JButton("CHAT BOX");
		btnChatBox.setIcon(new ImageIcon(programming.class.getResource("/Icon/Text-Edit-icon.png")));
		btnChatBox.setForeground(Color.BLACK);
		btnChatBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnChatBox.setBackground(Color.WHITE);
		btnChatBox.setBounds(235, 295, 160, 34);
		contentPane.add(btnChatBox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(programming.class.getResource("/Background/b7.jpg")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 631, 340);
		contentPane.add(label);
	}
}

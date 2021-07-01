import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Loop1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtForLoop;
	private JTextField txtWhileLoop;
	private JTextField txtDoWhileLoop;

	/**
	 * Launch the application.
	 */
	public static void L1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loop1 frame = new Loop1();
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
	public Loop1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Loop1.class.getResource("/Image/wall-3.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoopIsA = new JLabel("");
		lblLoopIsA.setIcon(new ImageIcon(Loop1.class.getResource("/example/Capture.PNG")));
		lblLoopIsA.setForeground(Color.WHITE);
		lblLoopIsA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoopIsA.setBackground(Color.WHITE);
		lblLoopIsA.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoopIsA.setBounds(0, 22, 651, 50);
		contentPane.add(lblLoopIsA);
		
		JButton btnExample = new JButton("Example");
		btnExample.setForeground(Color.BLACK);
		btnExample.setBackground(Color.WHITE);
		btnExample.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoopExample lx = new LoopExample();
				lx.forloop();
				dispose();
			}
		});
		btnExample.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExample.setBounds(249, 104, 151, 30);
		contentPane.add(btnExample);
		
		JButton btnExample_1 = new JButton("Example");
		btnExample_1.setForeground(Color.BLACK);
		btnExample_1.setBackground(Color.WHITE);
		btnExample_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WhileLoop WL = new WhileLoop();
				WL.While();
				dispose();
			}
		});
		btnExample_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExample_1.setBounds(249, 159, 151, 30);
		contentPane.add(btnExample_1);
		
		JButton btnExample_2 = new JButton("Example");
		btnExample_2.setForeground(Color.BLACK);
		btnExample_2.setBackground(Color.WHITE);
		btnExample_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				do_while dw = new do_while();
				dw.dwloop();
				dispose();
				
			}
		});
		btnExample_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExample_2.setBounds(249, 212, 151, 30);
		contentPane.add(btnExample_2);
		
		JButton btnSiteLink = new JButton("Site Link");
		btnSiteLink.setForeground(Color.BLACK);
		btnSiteLink.setBackground(Color.WHITE);
		btnSiteLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()>0) {
					if(Desktop.isDesktopSupported()) {
						Desktop desktop = Desktop.getDesktop();
						try {
							URI uri = new URI("https://www.programiz.com/c-programming/c-for-loop");
							desktop.browse(uri);
						}catch(IOException ex) {
							ex.printStackTrace();
						}catch(URISyntaxException ex) {
							ex.printStackTrace();
						}
					}
				}
			}
		});
		btnSiteLink.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSiteLink.setBounds(425, 104, 151, 30);
		contentPane.add(btnSiteLink);
		
		JButton btnSiteLink_1 = new JButton("Site Link");
		btnSiteLink_1.setForeground(Color.BLACK);
		btnSiteLink_1.setBackground(Color.WHITE);
		btnSiteLink_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()>0) {
					if(Desktop.isDesktopSupported()) {
						Desktop desktop = Desktop.getDesktop();
						try {
							URI uri = new URI("https://www.tutorialspoint.com/cprogramming/c_while_loop.htm");
							desktop.browse(uri);
						}catch(IOException ex) {
							ex.printStackTrace();
						}catch(URISyntaxException ex) {
							ex.printStackTrace();
						}
					}
				}
			}
		});
		btnSiteLink_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSiteLink_1.setBounds(425, 159, 151, 30);
		contentPane.add(btnSiteLink_1);
		
		JButton btnSiteLink_2 = new JButton("Site Link");
		btnSiteLink_2.setForeground(Color.BLACK);
		btnSiteLink_2.setBackground(Color.WHITE);
		btnSiteLink_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()>0) {
					if(Desktop.isDesktopSupported()) {
						Desktop desktop = Desktop.getDesktop();
						try {
							URI uri =  new URI("https://beginnersbook.com/2014/01/c-dowhile-loop/");
							desktop.browse(uri);
						}catch(IOException ex) {
							ex.printStackTrace();
						}catch(URISyntaxException ex) {
							ex.printStackTrace();
						}
					}
				}
			}
		});
		btnSiteLink_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSiteLink_2.setBounds(425, 212, 151, 30);
		contentPane.add(btnSiteLink_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(Color.WHITE);
		btnBack.setForeground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C frame = new C();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(71, 285, 125, 30);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setBackground(Color.WHITE);
		btnExit.setForeground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(462, 285, 114, 30);
		contentPane.add(btnExit);
		
		txtForLoop = new JTextField();
		txtForLoop.setEditable(false);
		txtForLoop.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtForLoop.setForeground(Color.BLACK);
		txtForLoop.setBackground(Color.WHITE);
		txtForLoop.setHorizontalAlignment(SwingConstants.CENTER);
		txtForLoop.setText("For Loop");
		txtForLoop.setBounds(71, 104, 151, 30);
		contentPane.add(txtForLoop);
		txtForLoop.setColumns(10);
		
		txtWhileLoop = new JTextField();
		txtWhileLoop.setEditable(false);
		txtWhileLoop.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtWhileLoop.setForeground(Color.BLACK);
		txtWhileLoop.setBackground(Color.WHITE);
		txtWhileLoop.setHorizontalAlignment(SwingConstants.CENTER);
		txtWhileLoop.setText("While Loop");
		txtWhileLoop.setColumns(10);
		txtWhileLoop.setBounds(71, 159, 151, 30);
		contentPane.add(txtWhileLoop);
		
		txtDoWhileLoop = new JTextField();
		txtDoWhileLoop.setEditable(false);
		txtDoWhileLoop.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDoWhileLoop.setForeground(Color.BLACK);
		txtDoWhileLoop.setBackground(Color.WHITE);
		txtDoWhileLoop.setHorizontalAlignment(SwingConstants.CENTER);
		txtDoWhileLoop.setText("DO While Loop");
		txtDoWhileLoop.setColumns(10);
		txtDoWhileLoop.setBounds(71, 212, 151, 30);
		contentPane.add(txtDoWhileLoop);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Loop1.class.getResource("/Background/b8.jpg")));
		lblNewLabel.setBounds(0, 0, 651, 337);
		contentPane.add(lblNewLabel);
	}
}

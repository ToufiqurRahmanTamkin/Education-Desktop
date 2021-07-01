import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class string extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void fun() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					string frame = new string();
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
	public string() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(string.class.getResource("/Image/w.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCharStrnamesize = new JLabel("char str_name[size]");
		lblCharStrnamesize.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblCharStrnamesize.setBackground(Color.WHITE);
		lblCharStrnamesize.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharStrnamesize.setBounds(0, 58, 525, 47);
		contentPane.add(lblCharStrnamesize);
		
		JLabel lblDeclaration = new JLabel("Declaration ");
		lblDeclaration.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDeclaration.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeclaration.setBackground(Color.WHITE);
		lblDeclaration.setBounds(0, 11, 525, 47);
		contentPane.add(lblDeclaration);
		
		JButton btnExample = new JButton("Example");
		btnExample.setForeground(Color.BLACK);
		btnExample.setBackground(Color.WHITE);
		btnExample.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str_example strex = new str_example();
				strex.str();
				dispose();
			}
		});
		btnExample.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExample.setBounds(180, 135, 183, 36);
		contentPane.add(btnExample);
		
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
							URI uri = new URI("https://www.programiz.com/c-programming/c-strings");
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
		btnSiteLink.setBounds(180, 185, 183, 36);
		contentPane.add(btnSiteLink);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C frame = new C();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(83, 232, 100, 36);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(358, 232, 100, 36);
		contentPane.add(btnExit);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(string.class.getResource("/Image/w.jpg")));
		label.setBounds(0, 0, 525, 292);
		contentPane.add(label);
	}
}

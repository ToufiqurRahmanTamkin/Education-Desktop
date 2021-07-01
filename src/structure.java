import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class structure extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void strpage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					structure frame = new structure();
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
	public structure() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(structure.class.getResource("/Image/w2.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(structure.class.getResource("/example/ss.PNG")));
		label_1.setBounds(50, 36, 525, 150);
		contentPane.add(label_1);
		
		JButton btnExample = new JButton("Example");
		btnExample.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExample.setBackground(Color.WHITE);
		btnExample.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				structEX s1 = new structEX();
				s1.st1();
				dispose();
			}
		});
		btnExample.setBounds(196, 208, 236, 36);
		contentPane.add(btnExample);
		
		JButton btnSiteLink = new JButton("Site Link");
		btnSiteLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(e.getClickCount()>0) {
					if(Desktop.isDesktopSupported()) {
						Desktop desktop = Desktop.getDesktop();
						try {
							URI uri = new URI("https://www.geeksforgeeks.org/structures-c/");
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
		btnSiteLink.setBackground(Color.WHITE);
		btnSiteLink.setBounds(196, 255, 236, 36);
		contentPane.add(btnSiteLink);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C frame = new C();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(10, 317, 117, 36);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(490, 317, 117, 36);
		contentPane.add(btnExit);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(structure.class.getResource("/Background/b9.jpg")));
		label.setBounds(0, 0, 617, 364);
		contentPane.add(label);
	}

}

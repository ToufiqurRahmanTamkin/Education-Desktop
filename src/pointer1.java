import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class pointer1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void pointerpage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pointer1 frame = new pointer1();
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
	public pointer1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(pointer1.class.getResource("/Image/w1.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeclaration = new JLabel("Declaration:");
		lblDeclaration.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDeclaration.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeclaration.setBackground(Color.WHITE);
		lblDeclaration.setBounds(0, 29, 525, 41);
		contentPane.add(lblDeclaration);
		
		JLabel lblDatatypePointervariablename = new JLabel("data_type* pointer_variable_name;");
		lblDatatypePointervariablename.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatatypePointervariablename.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDatatypePointervariablename.setBackground(Color.WHITE);
		lblDatatypePointervariablename.setBounds(0, 66, 525, 41);
		contentPane.add(lblDatatypePointervariablename);
		
		JButton btnExample = new JButton("Example");
		btnExample.setForeground(Color.BLACK);
		btnExample.setBackground(Color.WHITE);
		btnExample.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				poinerEx p = new poinerEx();
				p.example();
			}
		});
		btnExample.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExample.setBounds(182, 136, 175, 32);
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
							URI uri = new URI("https://fresh2refresh.com/c-programming/c-pointer/");
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
		btnSiteLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSiteLink.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSiteLink.setBounds(182, 179, 175, 32);
		contentPane.add(btnSiteLink);
		
		JButton btnBack = new JButton("Back");
		btnBack.setIcon(new ImageIcon(pointer1.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C frame = new C();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(68, 230, 99, 32);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setIcon(new ImageIcon(pointer1.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(364, 230, 99, 32);
		contentPane.add(btnExit);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(pointer1.class.getResource("/Image/w1.jpg")));
		label.setBounds(0, 0, 525, 292);
		contentPane.add(label);
	}
}

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Color;

public class Array extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void arraypage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Array.class.getResource("/Image/wall3.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDatatypeArraynamearraysize = new JLabel("data_type array_name [array_size]");
		lblDatatypeArraynamearraysize.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDatatypeArraynamearraysize.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatatypeArraynamearraysize.setBounds(0, 0, 525, 58);
		contentPane.add(lblDatatypeArraynamearraysize);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Array.class.getResource("/example/initialize_Array.jpg")));
		label.setBounds(0, 69, 525, 58);
		contentPane.add(label);
		
		JButton btnExample = new JButton("Example");
		btnExample.setForeground(Color.BLACK);
		btnExample.setBackground(Color.WHITE);
		btnExample.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				arrayEx example = new arrayEx();
				example.arrayexample();
				dispose();
				
			}
		});
		btnExample.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnExample.setBounds(152, 138, 230, 36);
		contentPane.add(btnExample);
		
		JButton btnSiteLink = new JButton("Site Link");
		btnSiteLink.setForeground(Color.BLACK);
		btnSiteLink.setBackground(Color.WHITE);
		btnSiteLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() > 0 ) {
					if(Desktop.isDesktopSupported()) {
						Desktop desktop = Desktop.getDesktop();
						try {
							URI uri = new URI("https://www.programiz.com/c-programming/c-arrays");
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
		btnSiteLink.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSiteLink.setBounds(152, 185, 230, 36);
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
		btnBack.setBounds(36, 232, 106, 30);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(389, 232, 106, 30);
		contentPane.add(btnExit);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Array.class.getResource("/Image/wall3.jpg")));
		label_1.setBounds(0, 0, 525, 292);
		contentPane.add(label_1);
	}

}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class str_example extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void str() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					str_example frame = new str_example();
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
	public str_example() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(str_example.class.getResource("/Image/w.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(str_example.class.getResource("/example/stringEx.PNG")));
		label.setBounds(0, 0, 525, 292);
		contentPane.add(label);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setIcon(new ImageIcon(str_example.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				string str = new string();
				str.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(27, 297, 111, 34);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setIcon(new ImageIcon(str_example.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(380, 297, 111, 34);
		contentPane.add(btnExit);
	}

}

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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class structEX extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void st1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					structEX frame = new structEX();
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
	public structEX() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(structEX.class.getResource("/Image/prg.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(structEX.class.getResource("/example/st1.PNG")));
		label.setBounds(0, 0, 525, 292);
		contentPane.add(label);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				structure st = new structure();
				st.setVisible(true);
				dispose();
			}
		});
		btnBack.setIcon(new ImageIcon(structEX.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(10, 303, 123, 37);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setIcon(new ImageIcon(structEX.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(392, 303, 123, 37);
		contentPane.add(btnExit);
	}

}

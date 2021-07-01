import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class poinerEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void example() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					poinerEx frame = new poinerEx();
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
	public poinerEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(poinerEx.class.getResource("/example/pointer.PNG")));
		label.setBounds(0, 0, 525, 292);
		contentPane.add(label);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setIcon(new ImageIcon(poinerEx.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pointer1 p1 = new pointer1();
				p1.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(43, 303, 109, 31);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setIcon(new ImageIcon(poinerEx.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(367, 303, 109, 31);
		contentPane.add(btnExit);
	}

}

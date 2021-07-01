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

public class do_while extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void dwloop() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					do_while frame = new do_while();
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
	public do_while() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(do_while.class.getResource("/example/do_while.PNG")));
		label.setBounds(20, 11, 525, 292);
		contentPane.add(label);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loop1 l1 = new Loop1();
				l1.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(69, 314, 105, 30);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(385, 318, 105, 30);
		contentPane.add(btnExit);
	}

}

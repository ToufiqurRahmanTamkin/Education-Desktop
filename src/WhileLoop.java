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

public class WhileLoop extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void While() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WhileLoop frame = new WhileLoop();
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
	public WhileLoop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(WhileLoop.class.getResource("/example/while.jpg")));
		label.setBounds(28, 11, 470, 292);
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
		btnBack.setBounds(73, 307, 101, 34);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(347, 307, 101, 34);
		contentPane.add(btnExit);
	}

}

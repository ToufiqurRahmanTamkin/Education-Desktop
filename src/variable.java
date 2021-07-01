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

public class variable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void fun() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					variable frame = new variable();
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
	public variable() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(variable.class.getResource("/Image/wall-2.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(variable.class.getResource("/example/variable.PNG")));
		label.setBounds(0, 0, 525, 292);
		contentPane.add(label);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C frame = new C();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(76, 303, 99, 34);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(361, 303, 99, 34);
		contentPane.add(btnExit);
	}

}

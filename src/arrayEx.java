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

public class arrayEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void arrayexample() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrayEx frame = new arrayEx();
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
	public arrayEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(arrayEx.class.getResource("/example/arrayExa.jpg")));
		label.setBounds(0, 0, 525, 292);
		contentPane.add(label);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Array ar = new Array();
				ar.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(37, 293, 97, 38);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(391, 293, 97, 38);
		contentPane.add(btnExit);
	}

}

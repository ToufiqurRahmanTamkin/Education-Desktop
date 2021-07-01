import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class poems extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					poems frame = new poems();
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
	public poems() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(54, 50, 311, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(54, 113, 311, 37);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(54, 175, 311, 37);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(54, 234, 311, 37);
		contentPane.add(textField_3);
		
		JButton button = new JButton("");
		button.setBounds(400, 50, 129, 37);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(400, 113, 129, 37);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(400, 175, 129, 37);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(400, 234, 129, 37);
		contentPane.add(button_3);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 610, 328);
		contentPane.add(label);
	}
}

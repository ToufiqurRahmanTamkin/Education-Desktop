import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_2 extends JFrame {
	
	static String username2;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_2 frame = new Window_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Window_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display2 = new JTextArea();
		display2.setBounds(0, 40, 376, 217);
		contentPane.add(display2);
		
		text2 = new JTextArea();
		text2.setBounds(0, 278, 261, 43);
		contentPane.add(text2);
		
		send2 = new JButton("Send");
		send2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text2.getText();
				if(s.equals("")) {
					return;
				}
				display2.append(username2 + ":" + s + "\n");
				Window_1.sendText();
				text2.setText("");
			}
		});
		send2.setBounds(271, 279, 95, 42);
		contentPane.add(send2);
		
		label2 = new JLabel("Chat window for: " + username2);
		label2.setBounds(0, 11, 277, 30);
		contentPane.add(label2);
		
		JButton button_1 = new JButton("Clear");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
			}
		});
		button_1.setBounds(287, 11, 89, 23);
		contentPane.add(button_1);
	}

	public static void sendText() {
		String s = Window_1.text1.getText();
		if(s.equals("")) {
			return;
		}
		display2.append(Window_1.username1 + ":" + s + "\n");
		
	}
	private javax.swing.JLabel label2;
	private static javax.swing.JTextArea display2;
	private javax.swing.JButton send2;
	public static javax.swing.JTextArea text2;
}

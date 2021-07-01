import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Games extends JFrame {

	private JPanel contentPane;
	private JTextField txtSnake;
	private JTextField txtTicTacToe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Games frame = new Games();
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
	public Games() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Games.class.getResource("/Background/games.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("BACK");
		button.setIcon(new ImageIcon(Games.class.getResource("/Icon/Go-back-icon.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KidsEducation ke = new KidsEducation();
				ke.setVisible(true);
				dispose();
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBackground(Color.WHITE);
		button.setBounds(10, 250, 110, 34);
		contentPane.add(button);
		
		JButton button_1 = new JButton("CHATBOX");
		button_1.setIcon(new ImageIcon(Games.class.getResource("/Icon/Text-Edit-icon.png")));
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(230, 250, 136, 34);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("EXIT");
		button_2.setIcon(new ImageIcon(Games.class.getResource("/Icon/Close-2-icon.png")));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(469, 250, 110, 34);
		contentPane.add(button_2);
		
		txtSnake = new JTextField();
		txtSnake.setText("Snake\r\n");
		txtSnake.setHorizontalAlignment(SwingConstants.CENTER);
		txtSnake.setForeground(Color.BLACK);
		txtSnake.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSnake.setEditable(false);
		txtSnake.setColumns(10);
		txtSnake.setBackground(Color.WHITE);
		txtSnake.setBounds(77, 81, 266, 41);
		contentPane.add(txtSnake);
		
		txtTicTacToe = new JTextField();
		txtTicTacToe.setText("Tic Tac Toe");
		txtTicTacToe.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicTacToe.setForeground(Color.BLACK);
		txtTicTacToe.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtTicTacToe.setEditable(false);
		txtTicTacToe.setColumns(10);
		txtTicTacToe.setBackground(Color.WHITE);
		txtTicTacToe.setBounds(77, 133, 266, 41);
		contentPane.add(txtTicTacToe);
		
		JButton button_3 = new JButton("ENTER");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player p1 = new Player();
				p1.setVisible(true);
				//dispose();
			}
		});
		button_3.setIcon(new ImageIcon(Games.class.getResource("/Icon/ok.png")));
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(355, 135, 137, 41);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("ENTER");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_4.setIcon(new ImageIcon(Games.class.getResource("/Icon/ok.png")));
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(355, 81, 136, 41);
		contentPane.add(button_4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Games.class.getResource("/Background/games.jpg")));
		label.setBounds(0, 0, 585, 295);
		contentPane.add(label);
	}
}

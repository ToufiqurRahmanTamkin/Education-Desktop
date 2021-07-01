import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class KidsEducation extends JFrame {

	private JPanel contentPane;
	private JTextField txtMathematicsTable;
	private JTextField textField;
	private JTextField txtPoems;
	private JTextField txtCartoons;
	private JTextField txtGames;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KidsEducation frame = new KidsEducation();
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
	public KidsEducation() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(KidsEducation.class.getResource("/Background/b10.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setIcon(new ImageIcon(KidsEducation.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Education1 e1= new Education1();
				e1.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(10, 270, 110, 34);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setIcon(new ImageIcon(KidsEducation.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(469, 270, 110, 34);
		contentPane.add(btnExit);
		
		txtMathematicsTable = new JTextField();
		txtMathematicsTable.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtMathematicsTable.setForeground(Color.BLACK);
		txtMathematicsTable.setBackground(Color.WHITE);
		txtMathematicsTable.setEditable(false);
		txtMathematicsTable.setHorizontalAlignment(SwingConstants.CENTER);
		txtMathematicsTable.setText("Alphabet");
		txtMathematicsTable.setBounds(82, 11, 266, 41);
		contentPane.add(txtMathematicsTable);
		txtMathematicsTable.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setText("Mathematics Table");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(82, 61, 266, 41);
		contentPane.add(textField);
		
		txtPoems = new JTextField();
		txtPoems.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtPoems.setForeground(Color.BLACK);
		txtPoems.setBackground(Color.WHITE);
		txtPoems.setEditable(false);
		txtPoems.setText("Poems");
		txtPoems.setHorizontalAlignment(SwingConstants.CENTER);
		txtPoems.setColumns(10);
		txtPoems.setBounds(82, 113, 266, 41);
		contentPane.add(txtPoems);
		
		txtCartoons = new JTextField();
		txtCartoons.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtCartoons.setForeground(Color.BLACK);
		txtCartoons.setBackground(Color.WHITE);
		txtCartoons.setEditable(false);
		txtCartoons.setText("Cartoons");
		txtCartoons.setHorizontalAlignment(SwingConstants.CENTER);
		txtCartoons.setColumns(10);
		txtCartoons.setBounds(82, 165, 266, 41);
		contentPane.add(txtCartoons);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setIcon(new ImageIcon(KidsEducation.class.getResource("/Icon/Clear-Tick-icon.png")));
		btnEnter.setBounds(358, 11, 136, 41);
		contentPane.add(btnEnter);
		
		JButton button = new JButton("ENTER");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setForeground(Color.BLACK);
		button.setBackground(Color.WHITE);
		button.setIcon(new ImageIcon(KidsEducation.class.getResource("/Icon/Clear-Tick-icon.png")));
		button.setBounds(359, 61, 136, 41);
		contentPane.add(button);
		
		JButton button_1 = new JButton("ENTER");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setForeground(Color.BLACK);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setIcon(new ImageIcon(KidsEducation.class.getResource("/Icon/Clear-Tick-icon.png")));
		button_1.setBounds(360, 113, 136, 41);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("ENTER");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.WHITE);
		button_2.setIcon(new ImageIcon(KidsEducation.class.getResource("/Icon/Clear-Tick-icon.png")));
		button_2.setBounds(360, 167, 137, 41);
		contentPane.add(button_2);
		
		JButton btnChatbox = new JButton("CHATBOX");
		btnChatbox.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnChatbox.setIcon(new ImageIcon(KidsEducation.class.getResource("/Icon/Text-Edit-icon.png")));
		btnChatbox.setForeground(Color.BLACK);
		btnChatbox.setBackground(Color.WHITE);
		btnChatbox.setBounds(230, 270, 136, 34);
		contentPane.add(btnChatbox);
		
		txtGames = new JTextField();
		txtGames.setText("Games");
		txtGames.setHorizontalAlignment(SwingConstants.CENTER);
		txtGames.setForeground(Color.BLACK);
		txtGames.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtGames.setEditable(false);
		txtGames.setColumns(10);
		txtGames.setBackground(Color.WHITE);
		txtGames.setBounds(80, 217, 266, 41);
		contentPane.add(txtGames);
		
		JButton button_3 = new JButton("ENTER");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Games gm =  new Games();
				gm.setVisible(true);
				dispose();
			}
		});
		button_3.setIcon(new ImageIcon(KidsEducation.class.getResource("/Icon/Clear-Tick-icon.png")));
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(358, 219, 139, 41);
		contentPane.add(button_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(KidsEducation.class.getResource("/Background/b10.jpg")));
		label.setBounds(0, 0, 589, 315);
		contentPane.add(label);
	}
}

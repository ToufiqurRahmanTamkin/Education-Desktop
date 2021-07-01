import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Learning1st extends JFrame {

	private JPanel contentPane;
	private JTextField txtStudyWithLove;
	private JTextField txtStudyingPath;
	private JTextField txtVirtualScientificStudy;
	private JTextField txtEnrichYourKnowledge;
	private JTextField txtMakeYourselfGood;
	private JTextField txtTools;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Learning1st frame = new Learning1st();
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
	public Learning1st() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Learning1st.class.getResource("/Background/b4.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtStudyWithLove = new JTextField();
		txtStudyWithLove.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtStudyWithLove.setEditable(false);
		txtStudyWithLove.setHorizontalAlignment(SwingConstants.CENTER);
		txtStudyWithLove.setText("Study");
		txtStudyWithLove.setBounds(20, 76, 298, 38);
		contentPane.add(txtStudyWithLove);
		txtStudyWithLove.setColumns(10);
		
		txtStudyingPath = new JTextField();
		txtStudyingPath.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtStudyingPath.setEditable(false);
		txtStudyingPath.setText("Studying Path Through Physiology");
		txtStudyingPath.setHorizontalAlignment(SwingConstants.CENTER);
		txtStudyingPath.setColumns(10);
		txtStudyingPath.setBounds(20, 125, 298, 38);
		contentPane.add(txtStudyingPath);
		
		txtVirtualScientificStudy = new JTextField();
		txtVirtualScientificStudy.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtVirtualScientificStudy.setEditable(false);
		txtVirtualScientificStudy.setText("Virtual Scientific Study Tools");
		txtVirtualScientificStudy.setHorizontalAlignment(SwingConstants.CENTER);
		txtVirtualScientificStudy.setColumns(10);
		txtVirtualScientificStudy.setBounds(20, 174, 298, 38);
		contentPane.add(txtVirtualScientificStudy);
		
		txtEnrichYourKnowledge = new JTextField();
		txtEnrichYourKnowledge.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEnrichYourKnowledge.setEditable(false);
		txtEnrichYourKnowledge.setText("Enrich Your Knowledge");
		txtEnrichYourKnowledge.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnrichYourKnowledge.setColumns(10);
		txtEnrichYourKnowledge.setBounds(20, 222, 298, 38);
		contentPane.add(txtEnrichYourKnowledge);
		
		txtMakeYourselfGood = new JTextField();
		txtMakeYourselfGood.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtMakeYourselfGood.setEditable(false);
		txtMakeYourselfGood.setText("Make Yourself Good At");
		txtMakeYourselfGood.setHorizontalAlignment(SwingConstants.CENTER);
		txtMakeYourselfGood.setColumns(10);
		txtMakeYourselfGood.setBounds(20, 271, 298, 38);
		contentPane.add(txtMakeYourselfGood);
		
		txtTools = new JTextField();
		txtTools.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTools.setEditable(false);
		txtTools.setHorizontalAlignment(SwingConstants.CENTER);
		txtTools.setText("TOOLS");
		txtTools.setBounds(20, 27, 634, 31);
		contentPane.add(txtTools);
		txtTools.setColumns(10);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnter.setIcon(new ImageIcon(Learning1st.class.getResource("/Icon/Window-Enter-icon.png")));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Education1 edu = new Education1();
				edu.setVisible(true);
				dispose();
			}
		});
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(342, 76, 146, 38);
		contentPane.add(btnEnter);
		
		JButton button = new JButton("ENTER");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setIcon(new ImageIcon(Learning1st.class.getResource("/Icon/Window-Enter-icon.png")));
		button.setForeground(Color.BLACK);
		button.setBackground(Color.WHITE);
		button.setBounds(342, 125, 146, 38);
		contentPane.add(button);
		
		JButton button_1 = new JButton("ENTER");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setIcon(new ImageIcon(Learning1st.class.getResource("/Icon/Window-Enter-icon.png")));
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(342, 174, 146, 38);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("ENTER");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setIcon(new ImageIcon(Learning1st.class.getResource("/Icon/Window-Enter-icon.png")));
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(342, 222, 146, 38);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("ENTER");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setIcon(new ImageIcon(Learning1st.class.getResource("/Icon/Window-Enter-icon.png")));
		button_3.setForeground(Color.BLACK);
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(342, 271, 146, 38);
		contentPane.add(button_3);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setIcon(new ImageIcon(Learning1st.class.getResource("/Icon/Close-2-icon.png")));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(514, 271, 140, 38);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstjFrame f1 = new FirstjFrame();
				f1.setVisible(true);
				dispose();
			}
		});
		btnBack.setIcon(new ImageIcon(Learning1st.class.getResource("/Icon/Go-back-icon.png")));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(514, 222, 140, 38);
		contentPane.add(btnBack);
		
		JButton btnChatBox = new JButton("CHAT BOX");
		btnChatBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ChatRoom cr = new ChatRoom();
				cr.setVisible(true);
				dispose();
			}
		});
		btnChatBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnChatBox.setIcon(new ImageIcon(Learning1st.class.getResource("/Icon/Text-Edit-icon.png")));
		btnChatBox.setForeground(Color.BLACK);
		btnChatBox.setBackground(Color.WHITE);
		btnChatBox.setBounds(514, 174, 140, 38);
		contentPane.add(btnChatBox);
		
		JButton btnDevelopers = new JButton("Developers");
		btnDevelopers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs au = new AboutUs();
				au.setVisible(true);
				dispose();
			}
		});
		btnDevelopers.setIcon(new ImageIcon(Learning1st.class.getResource("/Icon/Developer-icon.png")));
		btnDevelopers.setForeground(Color.BLACK);
		btnDevelopers.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDevelopers.setBackground(Color.WHITE);
		btnDevelopers.setBounds(514, 125, 140, 38);
		contentPane.add(btnDevelopers);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Learning1st.class.getResource("/Background/b4.jpg")));
		label.setBounds(0, 0, 675, 334);
		contentPane.add(label);
	}
}

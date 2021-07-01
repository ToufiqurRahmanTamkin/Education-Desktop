import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutUs extends JFrame {

	private JPanel contentPane;
	private JTextField txtToufiqurRahman;
	private JTextField txtEmailToufiqurdiuedubd;
	private JTextField txtMohammoddiuedubd;
	private JTextField txtShohanurRahman;
	private JTextField txtLubnadiuedubd;
	private JTextField txtLubnaAfroj;
	private JTextField txtMehnazdiuedubd;
	private JTextField txtMehnazRashidMim;
	private JTextField txtPurnatadiuedubd;
	private JTextField txtPurnataMojumder;
	private JTextField txtDevelopers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
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
	public AboutUs() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AboutUs.class.getResource("/developer/back.JPG")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AboutUs.class.getResource("/developer/tamkin.jpg")));
		label.setBounds(10, 84, 218, 204);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(AboutUs.class.getResource("/developer/sohan.jpg")));
		label_1.setBounds(238, 84, 228, 204);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(AboutUs.class.getResource("/developer/lula.jpg")));
		label_2.setBounds(476, 84, 228, 204);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(AboutUs.class.getResource("/developer/mim.jpg")));
		label_3.setBounds(712, 84, 228, 204);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(AboutUs.class.getResource("/developer/purnata.jpg")));
		label_4.setBounds(946, 84, 228, 204);
		contentPane.add(label_4);
		
		txtToufiqurRahman = new JTextField();
		txtToufiqurRahman.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtToufiqurRahman.setForeground(Color.BLACK);
		txtToufiqurRahman.setBackground(Color.WHITE);
		txtToufiqurRahman.setEditable(false);
		txtToufiqurRahman.setHorizontalAlignment(SwingConstants.CENTER);
		txtToufiqurRahman.setText("Toufiqur Rahman");
		txtToufiqurRahman.setBounds(10, 303, 218, 33);
		contentPane.add(txtToufiqurRahman);
		txtToufiqurRahman.setColumns(10);
		
		txtEmailToufiqurdiuedubd = new JTextField();
		txtEmailToufiqurdiuedubd.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtEmailToufiqurdiuedubd.setForeground(Color.BLACK);
		txtEmailToufiqurdiuedubd.setBackground(Color.WHITE);
		txtEmailToufiqurdiuedubd.setEditable(false);
		txtEmailToufiqurdiuedubd.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmailToufiqurdiuedubd.setText("toufiqur-15-10609@diu.edu.bd");
		txtEmailToufiqurdiuedubd.setColumns(10);
		txtEmailToufiqurdiuedubd.setBounds(10, 338, 218, 33);
		contentPane.add(txtEmailToufiqurdiuedubd);
		
		txtMohammoddiuedubd = new JTextField();
		txtMohammoddiuedubd.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtMohammoddiuedubd.setForeground(Color.BLACK);
		txtMohammoddiuedubd.setBackground(Color.WHITE);
		txtMohammoddiuedubd.setEditable(false);
		txtMohammoddiuedubd.setHorizontalAlignment(SwingConstants.CENTER);
		txtMohammoddiuedubd.setText("mohammod15-9152@diu.edu.bd");
		txtMohammoddiuedubd.setColumns(10);
		txtMohammoddiuedubd.setBounds(238, 338, 228, 33);
		contentPane.add(txtMohammoddiuedubd);
		
		txtShohanurRahman = new JTextField();
		txtShohanurRahman.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtShohanurRahman.setForeground(Color.BLACK);
		txtShohanurRahman.setBackground(Color.WHITE);
		txtShohanurRahman.setEditable(false);
		txtShohanurRahman.setHorizontalAlignment(SwingConstants.CENTER);
		txtShohanurRahman.setText("MD Shohanur Rahman");
		txtShohanurRahman.setColumns(10);
		txtShohanurRahman.setBounds(238, 303, 228, 33);
		contentPane.add(txtShohanurRahman);
		
		txtLubnadiuedubd = new JTextField();
		txtLubnadiuedubd.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtLubnadiuedubd.setForeground(Color.BLACK);
		txtLubnadiuedubd.setBackground(Color.WHITE);
		txtLubnadiuedubd.setEditable(false);
		txtLubnadiuedubd.setHorizontalAlignment(SwingConstants.CENTER);
		txtLubnadiuedubd.setText("lubna15-10913@diu.edu.bd");
		txtLubnadiuedubd.setColumns(10);
		txtLubnadiuedubd.setBounds(476, 338, 228, 33);
		contentPane.add(txtLubnadiuedubd);
		
		txtLubnaAfroj = new JTextField();
		txtLubnaAfroj.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtLubnaAfroj.setForeground(Color.BLACK);
		txtLubnaAfroj.setBackground(Color.WHITE);
		txtLubnaAfroj.setEditable(false);
		txtLubnaAfroj.setHorizontalAlignment(SwingConstants.CENTER);
		txtLubnaAfroj.setText("Lubna Afroj");
		txtLubnaAfroj.setColumns(10);
		txtLubnaAfroj.setBounds(476, 303, 228, 33);
		contentPane.add(txtLubnaAfroj);
		
		txtMehnazdiuedubd = new JTextField();
		txtMehnazdiuedubd.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtMehnazdiuedubd.setForeground(Color.BLACK);
		txtMehnazdiuedubd.setBackground(Color.WHITE);
		txtMehnazdiuedubd.setEditable(false);
		txtMehnazdiuedubd.setHorizontalAlignment(SwingConstants.CENTER);
		txtMehnazdiuedubd.setText("mehnaz15-10504@diu.edu.bd");
		txtMehnazdiuedubd.setColumns(10);
		txtMehnazdiuedubd.setBounds(712, 338, 228, 33);
		contentPane.add(txtMehnazdiuedubd);
		
		txtMehnazRashidMim = new JTextField();
		txtMehnazRashidMim.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtMehnazRashidMim.setForeground(Color.BLACK);
		txtMehnazRashidMim.setBackground(Color.WHITE);
		txtMehnazRashidMim.setEditable(false);
		txtMehnazRashidMim.setHorizontalAlignment(SwingConstants.CENTER);
		txtMehnazRashidMim.setText("Mehnaz Rashid Mim");
		txtMehnazRashidMim.setColumns(10);
		txtMehnazRashidMim.setBounds(712, 303, 228, 33);
		contentPane.add(txtMehnazRashidMim);
		
		txtPurnatadiuedubd = new JTextField();
		txtPurnatadiuedubd.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPurnatadiuedubd.setForeground(Color.BLACK);
		txtPurnatadiuedubd.setBackground(Color.WHITE);
		txtPurnatadiuedubd.setEditable(false);
		txtPurnatadiuedubd.setText("purnata15-10719@diu.edu.bd");
		txtPurnatadiuedubd.setHorizontalAlignment(SwingConstants.CENTER);
		txtPurnatadiuedubd.setColumns(10);
		txtPurnatadiuedubd.setBounds(946, 338, 228, 33);
		contentPane.add(txtPurnatadiuedubd);
		
		txtPurnataMojumder = new JTextField();
		txtPurnataMojumder.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPurnataMojumder.setForeground(Color.BLACK);
		txtPurnataMojumder.setBackground(Color.WHITE);
		txtPurnataMojumder.setEditable(false);
		txtPurnataMojumder.setText("Purnata Mojumder");
		txtPurnataMojumder.setHorizontalAlignment(SwingConstants.CENTER);
		txtPurnataMojumder.setColumns(10);
		txtPurnataMojumder.setBounds(946, 303, 228, 33);
		contentPane.add(txtPurnataMojumder);
		
		txtDevelopers = new JTextField();
		txtDevelopers.setEditable(false);
		txtDevelopers.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtDevelopers.setHorizontalAlignment(SwingConstants.CENTER);
		txtDevelopers.setText("Developers");
		txtDevelopers.setBounds(476, 27, 228, 38);
		contentPane.add(txtDevelopers);
		txtDevelopers.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Learning1st l1 = new Learning1st();
				l1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(AboutUs.class.getResource("/Icon/Go-back-icon.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 412, 164, 43);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setIcon(new ImageIcon(AboutUs.class.getResource("/Icon/Close-2-icon.png")));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(1010, 412, 164, 43);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AboutUs.class.getResource("/developer/back.JPG")));
		lblNewLabel.setBounds(0, 0, 1184, 466);
		contentPane.add(lblNewLabel);
	}
}

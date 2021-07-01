import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class SignupFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameTF;
	private JTextField emailTF;
	private JTextField usernameTF;
	private JTextField passField;
	private JTextField ageTF;
	private JTextField contactTF;
	private JTextField heightTF;
	private JRadioButton rdbtnMale, rdbtnFemale;
	private JComboBox addressCB;
	private JCheckBox chckbxNewCheckBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	String v = "";

	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	private JTextField txtSignupHere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupFrame frame = new SignupFrame();
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
	public SignupFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SignupFrame.class.getResource("/Background/sign2.jpg")));
		design();
		centerize();
		conn = SQLConnection.connecrDb();
	}

	private void centerize() {
		Dimension screenSize, frameSize;
		int x, y;
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frameSize = getSize();
		x = (screenSize.width - frameSize.width) / 2;
		y = (screenSize.height - frameSize.height) / 2;
		setLocation(x, y);
	}

	private void register() {
		try {
			String query = "INSERT INTO Employee (E_name,E_Email,E_Username,E_Passward,E_Age,E_Contact,E_Gender,E_Height,E_Address) VALUES (?,?,?,?,?,?,?,?,?)";
			pst = conn.prepareStatement(query);
			pst.setString(1, nameTF.getText());
			pst.setString(2, emailTF.getText());
			pst.setString(3, usernameTF.getText());
			pst.setString(4, passField.getText());
			pst.setString(5, ageTF.getText());
			pst.setString(6, contactTF.getText());

			if (rdbtnMale.isSelected()) {
				v = rdbtnMale.getText().toString();
			} else if (rdbtnFemale.isSelected()) {
				v = rdbtnFemale.getText().toString();
			} else {
				JOptionPane.showMessageDialog(null, "Select Gender");
			}

			pst.setString(7, String.valueOf(v));

			pst.setString(8, heightTF.getText());
			pst.setString(9, addressCB.getSelectedItem().toString());

			pst.execute();
			pst.close();

			JOptionPane.showMessageDialog(null, "Signup Successful");
			FirstjFrame fj = new FirstjFrame();
			fj.setVisible(true);
			dispose();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private void design() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		nameTF = new JTextField();
		nameTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nameTF.setHorizontalAlignment(SwingConstants.CENTER);
		nameTF.setBounds(131, 82, 259, 28);
		contentPane.add(nameTF);
		nameTF.setColumns(10);

		emailTF = new JTextField();
		emailTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		emailTF.setHorizontalAlignment(SwingConstants.CENTER);
		emailTF.setBounds(131, 122, 259, 28);
		contentPane.add(emailTF);
		emailTF.setColumns(10);

		usernameTF = new JTextField();
		usernameTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		usernameTF.setHorizontalAlignment(SwingConstants.CENTER);
		usernameTF.setBounds(131, 166, 259, 28);
		contentPane.add(usernameTF);
		usernameTF.setColumns(10);

		passField = new JTextField();
		passField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passField.setHorizontalAlignment(SwingConstants.CENTER);
		passField.setBounds(131, 205, 256, 28);
		contentPane.add(passField);
		passField.setColumns(10);

		ageTF = new JTextField();
		ageTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ageTF.setHorizontalAlignment(SwingConstants.CENTER);
		ageTF.setBounds(131, 257, 145, 28);
		contentPane.add(ageTF);
		ageTF.setColumns(10);

		contactTF = new JTextField();
		contactTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contactTF.setHorizontalAlignment(SwingConstants.CENTER);
		contactTF.setBounds(131, 296, 259, 28);
		contentPane.add(contactTF);
		contactTF.setColumns(10);

		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setForeground(Color.BLACK);
		rdbtnMale.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(131, 347, 69, 23);
		contentPane.add(rdbtnMale);

		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setForeground(Color.BLACK);
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(233, 347, 78, 23);
		contentPane.add(rdbtnFemale);

		heightTF = new JTextField();
		heightTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		heightTF.setHorizontalAlignment(SwingConstants.CENTER);
		heightTF.setBounds(128, 390, 133, 31);
		contentPane.add(heightTF);
		heightTF.setColumns(10);

		addressCB = new JComboBox();
		addressCB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		addressCB.setForeground(Color.BLACK);
		addressCB.setFont(new Font("Bell MT", Font.BOLD, 14));
		addressCB.setModel(new DefaultComboBoxModel(new String[] { "Dhaka", "Rajshahi", "Sylhet", "Barishal" }));
		addressCB.setBounds(128, 432, 133, 28);
		contentPane.add(addressCB);

		JLabel lblName = new JLabel("Name");
		lblName.setIcon(new ImageIcon(SignupFrame.class.getResource("/design/u2.png")));
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Bell MT", Font.BOLD, 16));
		lblName.setBounds(21, 82, 100, 28);
		contentPane.add(lblName);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setIcon(new ImageIcon(SignupFrame.class.getResource("/design/kh-email.png")));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblEmail.setBounds(21, 121, 100, 28);
		contentPane.add(lblEmail);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setIcon(new ImageIcon(SignupFrame.class.getResource("/design/kh-user.png")));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Bell MT", Font.BOLD, 16));
		lblUsername.setBounds(21, 163, 116, 31);
		contentPane.add(lblUsername);

		JLabel lblPassward = new JLabel("Passward");
		lblPassward.setIcon(new ImageIcon(SignupFrame.class.getResource("/design/kh-pass.png")));
		lblPassward.setForeground(Color.WHITE);
		lblPassward.setFont(new Font("Bell MT", Font.BOLD, 16));
		lblPassward.setBounds(16, 204, 109, 28);
		contentPane.add(lblPassward);

		JLabel lblAge = new JLabel("Age");
		lblAge.setIcon(new ImageIcon(SignupFrame.class.getResource("/design/kh-age.png")));
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Bell MT", Font.BOLD, 16));
		lblAge.setBounds(21, 261, 97, 24);
		contentPane.add(lblAge);

		JLabel lblContact = new JLabel("Contact");
		lblContact.setIcon(new ImageIcon(SignupFrame.class.getResource("/design/kh-call.png")));
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("Bell MT", Font.BOLD, 16));
		lblContact.setBounds(21, 296, 94, 28);
		contentPane.add(lblContact);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setIcon(new ImageIcon(SignupFrame.class.getResource("/design/Users-Gender-icon.png")));
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Bell MT", Font.BOLD, 16));
		lblGender.setBounds(21, 347, 100, 23);
		contentPane.add(lblGender);

		JLabel lblHeight = new JLabel("Height");
		lblHeight.setIcon(new ImageIcon(SignupFrame.class.getResource("/design/height-icon.png")));
		lblHeight.setForeground(Color.WHITE);
		lblHeight.setFont(new Font("Bell MT", Font.BOLD, 16));
		lblHeight.setBounds(21, 390, 97, 31);
		contentPane.add(lblHeight);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setIcon(new ImageIcon(SignupFrame.class.getResource("/design/kh-location.png")));
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Bell MT", Font.BOLD, 16));
		lblAddress.setBounds(21, 431, 100, 28);
		contentPane.add(lblAddress);

		JButton btnRegister = new JButton("Register");
		btnRegister.setBackground(Color.WHITE);
		btnRegister.setIcon(new ImageIcon(SignupFrame.class.getResource("/design/Window-Enter-icon.png")));
		btnRegister.setForeground(Color.BLUE);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxNewCheckBox.isSelected()) {
					register();
				} else {
					JOptionPane.showMessageDialog(null, "Read Terms & Conditions");
				}

			}
		});
		btnRegister.setFont(new Font("Bell MT", Font.BOLD, 18));
		btnRegister.setBounds(103, 514, 192, 34);
		contentPane.add(btnRegister);

		chckbxNewCheckBox = new JCheckBox("I accept all the terms and conditions");
		chckbxNewCheckBox.setForeground(Color.BLACK);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox.setBounds(69, 481, 259, 18);
		contentPane.add(chckbxNewCheckBox);
		
		txtSignupHere = new JTextField();
		txtSignupHere.setEditable(false);
		txtSignupHere.setFont(new Font("Tahoma", Font.BOLD, 21));
		txtSignupHere.setHorizontalAlignment(SwingConstants.CENTER);
		txtSignupHere.setText("Signup Here");
		txtSignupHere.setBounds(107, 21, 182, 39);
		contentPane.add(txtSignupHere);
		txtSignupHere.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(SignupFrame.class.getResource("/Background/sign2.jpg")));
		label.setBounds(0, 0, 396, 559);
		contentPane.add(label);
	}
}

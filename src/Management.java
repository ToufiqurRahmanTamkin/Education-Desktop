import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class Management extends JFrame {

	private JPanel contentPane;
	private JTable dataTable;

	Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private JTextField nameTF;
	private JTextField emailTF;
	private JTextField usernameTF;
	private JTextField ageTF;
	private JTextField heightTF;
	private JTextField contactTF;
	private JComboBox addressCB;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JRadioButton rdbtnFemale, rdbtnMale;
	private String v = "";
	private String combo = "";
	private int E_ID = 0;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private JPasswordField passField;
	private JLabel lblHeight;
	private JLabel lblNewLabel;
	private JLabel lblAddress;
	private JTextField searchTF;
	private JButton btnExit;
	private JComboBox searchCB;
	private JButton btnLogout;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Management frame = new Management();
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
	public Management() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Management.class.getResource("/design/00000.jpg")));
		design();
		centerize();
		conn = SQLConnection.connecrDb();
		loadTable();

	}

	public void centerize() {
		Dimension screenSize, frameSize;
		int x, y;
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frameSize = getSize();
		x = (screenSize.width - frameSize.width) / 2;
		y = (screenSize.height - frameSize.height) / 2;
		setLocation(x, y);
	}

	private void resetEverything() {
		nameTF.setText(null);
		emailTF.setText(null);
		usernameTF.setText(null);
		passField.setText(null);
		contactTF.setText(null);
		buttonGroup.clearSelection();
		heightTF.setText(null);
		addressCB.setSelectedItem("-");
		searchCB.setSelectedItem("-");
		searchTF.setText(null);
		ageTF.setText(null);
		contactTF.setText(null);
		loadTable();

	}

	private void loadTable() {
		try {
			String query = "Select E_ID,E_Name,E_Email,E_Username,E_Age,E_Contact,E_Gender,E_Height,E_Address FROM Employee";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			dataTable.setModel(DbUtils.resultSetToTableModel(rs));
			pst.close();
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addData() {
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

			JOptionPane.showMessageDialog(null, "New Info Added");

			resetEverything();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private void loadtoField() {
		try {
			int row = dataTable.getSelectedRow();
			String ID = (dataTable.getModel().getValueAt(row, 0)).toString();
			String query = "SELECT * FROM Employee WHERE E_ID='" + ID + "'";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();

			while (rs.next()) {

				E_ID = rs.getInt("E_ID");

				nameTF.setText(rs.getString("E_Name"));
				emailTF.setText(rs.getString("E_Email"));
				usernameTF.setText(rs.getString("E_Username"));
				passField.setText(rs.getString("E_Passward"));
				ageTF.setText(rs.getString("E_Age"));
				contactTF.setText(rs.getString("E_Contact"));
				v = rs.getString("E_Gender");
				if (v.equals("Male")) {
					rdbtnMale.setSelected(true);
					rdbtnFemale.setSelected(false);
				} else if (v.equals("Female")) {
					rdbtnFemale.setSelected(true);
					rdbtnMale.setSelected(false);
				} else {
					System.out.println("");
				}

				heightTF.setText(rs.getString("E_Height"));

				combo = rs.getString("E_Address");

				if (combo.equals("Dhaka")) {
					addressCB.setSelectedItem("Dhaka");
				} else if (combo.equals("Barishal")) {
					addressCB.setSelectedItem("Barishal");
				} else if (combo.equals("Sylhet")) {
					addressCB.setSelectedItem("Sylhet");
				} else {
					System.out.println("");
				}
			}
			pst.close();
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void updateData() {
		try {

			String query = "UPDATE Employee SET E_Name = '" + nameTF.getText() + "',E_Email = '" + emailTF.getText()
					+ "',E_Username = '" + usernameTF.getText() + "',E_Passward = '" + passField.getText()
					+ "',E_Age = '" + ageTF.getText() + "',E_Contact = '" + contactTF.getText() + "',E_Gender = '" + v
					+ "',E_Height = '" + heightTF.getText() + "',E_Address = '" + addressCB.getSelectedItem().toString()
					+ "' WHERE E_ID = '" + E_ID + "'";

			pst = conn.prepareStatement(query);
			pst.execute();

			JOptionPane.showMessageDialog(null, "Data Updated Successfully");

			pst.close();
			resetEverything();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void deleteData() {
		try {
			int action = JOptionPane.showConfirmDialog(null, "Are You Sure to Detete??", "Delete",
					JOptionPane.YES_NO_CANCEL_OPTION);
			if (action == 0) {
				String query = "DELETE FROM Employee WHERE E_ID = '" + E_ID + "'";
				pst = conn.prepareStatement(query);
				pst.execute();
				JOptionPane.showMessageDialog(null, "Deleted Successfully");
				pst.close();
				resetEverything();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void searchData() {
		try {
			String selection = (String) searchCB.getSelectedItem();

			String query = "SELECT E_ID,E_name,E_Email,E_Username,E_Passward,E_Age,E_Contact,E_Gender,E_Height,E_Address FROM Employee WHERE "
					+ selection + " LIKE '" + searchTF.getText() + "%'";

			pst = conn.prepareStatement(query);
			// pst.setString(1, searchTF.getText());
			rs = pst.executeQuery();
			dataTable.setModel(DbUtils.resultSetToTableModel(rs));
			pst.close();
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void design() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 95, 655, 93);
		contentPane.add(scrollPane);

		dataTable = new JTable();
		dataTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				loadtoField();
			}

		});
		scrollPane.setViewportView(dataTable);

		nameTF = new JTextField();
		nameTF.setHorizontalAlignment(SwingConstants.CENTER);
		nameTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nameTF.setColumns(10);
		nameTF.setBounds(134, 199, 130, 28);
		contentPane.add(nameTF);

		emailTF = new JTextField();
		emailTF.setHorizontalAlignment(SwingConstants.CENTER);
		emailTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		emailTF.setColumns(10);
		emailTF.setBounds(134, 238, 130, 28);
		contentPane.add(emailTF);

		usernameTF = new JTextField();
		usernameTF.setHorizontalAlignment(SwingConstants.CENTER);
		usernameTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		usernameTF.setColumns(10);
		usernameTF.setBounds(134, 277, 130, 28);
		contentPane.add(usernameTF);

		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setForeground(Color.RED);
		rdbtnMale.setFont(new Font("Bell MT", Font.BOLD, 16));
		rdbtnMale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				v = rdbtnMale.getText().toString();
			}
		});
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(354, 234, 72, 28);
		contentPane.add(rdbtnMale);

		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setForeground(Color.RED);
		rdbtnFemale.setFont(new Font("Bell MT", Font.BOLD, 16));
		rdbtnFemale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				v = rdbtnFemale.getText().toString();
			}
		});
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(455, 235, 79, 28);
		contentPane.add(rdbtnFemale);

		ageTF = new JTextField();
		ageTF.setHorizontalAlignment(SwingConstants.CENTER);
		ageTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ageTF.setColumns(10);
		ageTF.setBounds(134, 355, 130, 28);
		contentPane.add(ageTF);

		heightTF = new JTextField();
		heightTF.setHorizontalAlignment(SwingConstants.CENTER);
		heightTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		heightTF.setColumns(10);
		heightTF.setBounds(404, 274, 130, 28);
		contentPane.add(heightTF);

		contactTF = new JTextField();
		contactTF.setHorizontalAlignment(SwingConstants.CENTER);
		contactTF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contactTF.setColumns(10);
		contactTF.setBounds(404, 313, 130, 28);
		contentPane.add(contactTF);

		addressCB = new JComboBox();
		addressCB.setModel(new DefaultComboBoxModel(new String[] { "-", "Dhaka", "Rajshahi", "Sylhet", "Barishal" }));
		addressCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		addressCB.setBounds(404, 352, 130, 28);
		contentPane.add(addressCB);

		btnAdd = new JButton("Add");
		btnAdd.setIcon(new ImageIcon(Management.class.getResource("/design/kh-add.png")));
		btnAdd.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 20));
		btnAdd.setForeground(Color.GREEN);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addData();
			}
		});
		btnAdd.setBounds(547, 199, 118, 41);
		contentPane.add(btnAdd);

		btnUpdate = new JButton("Update");
		btnUpdate.setIcon(new ImageIcon(Management.class.getResource("/design/kh-update.png")));
		btnUpdate.setForeground(Color.BLUE);
		btnUpdate.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 17));
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				updateData();

			}
		});
		btnUpdate.setBounds(545, 248, 120, 41);
		contentPane.add(btnUpdate);

		btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon(Management.class.getResource("/design/kh-delete - Copy.png")));
		btnDelete.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 18));
		btnDelete.setForeground(Color.RED);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteData();
			}
		});
		btnDelete.setBounds(545, 300, 120, 41);
		contentPane.add(btnDelete);

		passField = new JPasswordField();
		passField.setHorizontalAlignment(SwingConstants.CENTER);
		passField.setBounds(134, 316, 130, 28);
		contentPane.add(passField);

		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.RED);
		lblName.setIcon(new ImageIcon(Management.class.getResource("/design/Users-Name-icon.png")));
		lblName.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(10, 199, 90, 28);
		contentPane.add(lblName);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.RED);
		lblEmail.setIcon(new ImageIcon(Management.class.getResource("/design/kh-email.png")));
		lblEmail.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(10, 241, 90, 23);
		contentPane.add(lblEmail);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.RED);
		lblUsername.setIcon(new ImageIcon(Management.class.getResource("/design/kh-user.png")));
		lblUsername.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(10, 277, 118, 28);
		contentPane.add(lblUsername);

		JLabel lblPassward = new JLabel("Passward");
		lblPassward.setForeground(Color.RED);
		lblPassward.setIcon(new ImageIcon(Management.class.getResource("/design/kh-pass.png")));
		lblPassward.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblPassward.setBounds(10, 316, 114, 28);
		contentPane.add(lblPassward);

		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(Color.RED);
		lblAge.setIcon(new ImageIcon(Management.class.getResource("/design/kh-age.png")));
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblAge.setBounds(10, 355, 79, 28);
		contentPane.add(lblAge);

		lblHeight = new JLabel("Height");
		lblHeight.setForeground(Color.RED);
		lblHeight.setIcon(new ImageIcon(Management.class.getResource("/design/height-icon.png")));
		lblHeight.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeight.setBounds(298, 273, 105, 28);
		contentPane.add(lblHeight);

		lblNewLabel = new JLabel("Contact");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setIcon(new ImageIcon(Management.class.getResource("/design/kh-call.png")));
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(298, 312, 106, 32);
		contentPane.add(lblNewLabel);

		lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.RED);
		lblAddress.setBackground(Color.WHITE);
		lblAddress.setIcon(new ImageIcon(Management.class.getResource("/design/kh-location.png")));
		lblAddress.setFont(new Font("Bell MT", Font.BOLD, 18));
		lblAddress.setBounds(298, 351, 107, 32);
		contentPane.add(lblAddress);

		searchCB = new JComboBox();
		searchCB.setModel(new DefaultComboBoxModel(new String[] { "-", "E_Name", "E_Email", "E_Username", "E_Age",
				"E_Contact", "E_Gender", "E_Height", "E_Address" }));
		searchCB.setBounds(86, 21, 178, 33);
		contentPane.add(searchCB);

		searchTF = new JTextField();
		searchTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				searchData();
			}
		});
		searchTF.setBounds(354, 21, 178, 33);
		contentPane.add(searchTF);
		searchTF.setColumns(10);

		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setIcon(new ImageIcon(Management.class.getResource("/design/kh-reset - Copy.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetEverything();
			}
		});
		btnNewButton.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBounds(547, 353, 118, 41);
		contentPane.add(btnNewButton);

		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBackground(Color.WHITE);
		btnExit.setIcon(new ImageIcon(Management.class.getResource("/design/kh-exit - Copy.png")));
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 18));
		btnExit.setBounds(547, 405, 118, 41);
		contentPane.add(btnExit);

		btnLogout = new JButton("Logout");
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setIcon(new ImageIcon(Management.class.getResource("/design/SignOut-icon.png")));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				FirstjFrame fj = new FirstjFrame();
				fj.setVisible(true);
				dispose();

			}
		});
		btnLogout.setFont(new Font("Bell MT", Font.BOLD, 14));
		btnLogout.setBounds(547, 20, 118, 34);
		contentPane.add(btnLogout);
		
		JLabel lblSelect = new JLabel("Select");
		lblSelect.setIcon(new ImageIcon(Management.class.getResource("/design/Sign-Select-icon.png")));
		lblSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelect.setForeground(Color.BLACK);
		lblSelect.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSelect.setBackground(Color.WHITE);
		lblSelect.setBounds(10, 25, 70, 28);
		contentPane.add(lblSelect);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSearch.setIcon(new ImageIcon(Management.class.getResource("/design/Search-icon.png")));
		lblSearch.setForeground(Color.BLACK);
		lblSearch.setBackground(Color.WHITE);
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setBounds(274, 25, 79, 24);
		contentPane.add(lblSearch);
		
		JButton btnEnterForLearning = new JButton("Enter For Learning");
		btnEnterForLearning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Learning1st l = new Learning1st();
				l.setVisible(true);
				dispose();
			}
		});
		btnEnterForLearning.setForeground(Color.GREEN);
		btnEnterForLearning.setBackground(Color.WHITE);
		btnEnterForLearning.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEnterForLearning.setBounds(190, 394, 178, 52);
		contentPane.add(btnEnterForLearning);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Management.class.getResource("/design/00000.jpg")));
		label.setBounds(0, 0, 675, 457);
		contentPane.add(label);
	}
}

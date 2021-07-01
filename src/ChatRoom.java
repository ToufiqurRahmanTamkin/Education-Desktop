import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
public class ChatRoom {

	static Window_1 win1;
	static Window_2 win2;
	static Server server;
	
	public ChatRoom() {
		server = new Server();
		server.setLocationRelativeTo(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Learning1st l1 = new Learning1st();
				l1.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(10, 207, 110, 32);
		server.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("EXIT\r\n");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(314, 210, 110, 32);
		server.getContentPane().add(btnExit);
		server.setVisible(true);
		
	}
	
	protected void dispose() {
		// TODO Auto-generated method stub
		
	}

	public static void createRoom() {
		win1 = new Window_1();
		win2 = new Window_2();
		win1.setLocation(500, 200);
		win2.setLocation(900, 200);
		win1.setVisible(true);
		win2.setVisible(true);
		server.setVisible(true);
	}
	
	public static void main(String[] args) {
		ChatRoom chatRoom = new ChatRoom();
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.Timer;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

public class Splash extends JFrame implements ActionListener {
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash();
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
	public Splash(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Splash.class.getResource("/Files/splash.jpg")));
		design();
		tm.start();
		welcomeMusic();
	}
	
	Timer tm = new Timer(80, this);
	int time=0;
	private JProgressBar progressBar;
	private JLabel loadingLabel;
	private JLabel label;
	
	public void actionPerformed(ActionEvent e) {
		if(time != 100) {
			time++;
			progressBar.setValue(time);
			loadingLabel.setText("Loading"+" "+ time+ "%");
			
		}else {
			tm.stop();
			//JOptionPane.showMessageDialog(null, "Done");
			FirstjFrame mf = new FirstjFrame();
			mf.setVisible(true);
			dispose();
		}
	}
	
	private void welcomeMusic() {
		
		try {
			Clip c = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(Splash.class.getResource("/Files/edu.wav"));
			c.open(inputStream);
			c.start();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void design(){
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Splash.class.getResource("/Files/splash.jpg")));
		label.setBounds(10, 0, 574, 302);
		contentPane.add(label);
		
		loadingLabel = new JLabel("Loading  %");
		loadingLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		loadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loadingLabel.setBounds(222, 313, 150, 33);
		contentPane.add(loadingLabel);
		
		progressBar = new JProgressBar();
		progressBar.setBackground(new Color(0, 0, 128));
		progressBar.setForeground(new Color(211, 211, 211));
		progressBar.setBounds(10, 313, 574, 33);
		contentPane.add(progressBar);
	}
}

package com.brainmentors.billing.main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import com.brainmentors.billing.user.Login;

import jaco.mp3.player.MP3Player;

public class IntroScreen extends JWindow {
	
	private void playSound() {
		
		MP3Player mp3 = new MP3Player();
		mp3.play();
	}
	private Timer timer;
	int counter = 1;
	JProgressBar progressBar = new JProgressBar();
	private void doProgress() {
		
		timer = new Timer(5,(e)->{
			if(counter>=100) {
				timer.stop();
				this.setVisible(false);
				this.dispose();
				Login login = new Login();
				login.setVisible(true);
			}
			progressBar.setValue(counter);
			counter++;
		}) ;
		timer.start();
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					IntroScreen frame = new IntroScreen();
					frame.setVisible(true);
					frame.doProgress();
				
	}

	/**
	 * Create the frame.
	 */
	public IntroScreen() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(IntroScreen.class.getResource("/com/brainmentors/billing/main/intro.jpg")));
		lblNewLabel.setBounds(20, 6, 600, 226);
		contentPane.add(lblNewLabel);
		
		
		progressBar.setStringPainted(true);
		progressBar.setBounds(6, 235, 500, 40);
		contentPane.add(progressBar);
	}
}

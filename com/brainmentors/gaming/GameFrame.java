package com.brainmentors.gaming;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(900,600);
		setTitle("Game-2019");
		setResizable(false);
		//setLocation(200, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GameFrame();
		

	}

}

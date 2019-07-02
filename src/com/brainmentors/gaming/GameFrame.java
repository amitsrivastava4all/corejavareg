package com.brainmentors.gaming;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements GameConstants {
	public static GameFrame frame ;
	public GameFrame() {
		frame = this;
		Board board = new Board();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(GWIDTH,GHEIGHT);
		setTitle(TITLE);
		add(board);
		setResizable(false);
		//setLocation(200, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GameFrame();
		

	}

}

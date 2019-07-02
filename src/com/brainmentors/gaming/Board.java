package com.brainmentors.gaming;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants{
	Player player;
	private Timer timer;
	
	private void gameLoop() {
		// Lambda Style
		timer = new Timer(50,(e)->{
			player.move();
			repaint();
		});
		timer.start();
		// Anonymous Style
//		timer = new Timer(50,new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
	}
	
	public Board() {
		player = new Player();
		setSize(GWIDTH, GHEIGHT);
		setBackground(Color.BLACK);
		gameLoop();
	}
	
	private void drawBackground(Graphics g) {
		BufferedImage image = ImageLoader.loadImage(BACKGROUND_IMAGE);
		g.drawImage(image, 0, 0, GWIDTH, GHEIGHT, null);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		// Paint Job
		drawBackground(g);
		player.drawPlayer(g);
	}
	
	
	

}

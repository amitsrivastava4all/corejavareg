package com.brainmentors.gaming;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants{
	Player player;
	private Timer timer;
	Enemy enemies [] = new Enemy[MAX_ENEMIES];
	BufferedImage enemyImages[] = new BufferedImage[MAX_ENEMIES];
	private void loadEnemiesImages() {
		enemyImages[0] = ImageLoader.loadImage(ENEMY_IMG1);
		enemyImages[1] = ImageLoader.loadImage(ENEMY_IMG2);
		enemyImages[2] = ImageLoader.loadImage(ENEMY_IMG3);
	}
	private void loadEnemies() {
		int speed = -10;
		int diff = 0;
		int gap = 1;
		for(int i = 0 ; i<enemies.length; i++) {
			
			enemies[i] = new Enemy(ENEMY_POS+gap, enemyImages[i], speed + diff);
			diff+=3;
			gap+=100;
		}
	}
	
	private void registerEvents() {
		this.addKeyListener(new KeyAdapter() {
			
//			@Override
//			public void keyTyped(KeyEvent e) {
//				System.out.println("Key Typed Call "+e.getKeyChar()+" "+e.getKeyCode());
//				// TODO Auto-generated method stub
//				
//			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Key Release Call "+e.getKeyChar()+" "+e.getKeyCode());
				// TODO Auto-generated method stub
				player.setSpeed(0);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_SPACE) {
					player.jump();
				}
				else
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					player.setSpeed(5);
					player.move();
				}
				else
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {	
					player.setSpeed(-5);
					player.move();
				}
				
				//System.out.println("Key Press Call "+e.getKeyChar()+" "+e.getKeyCode());
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	private void gameLoop() {
		// Lambda Style
		timer = new Timer(DELAY,(e)->{
			//player.move();
			player.fall();
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
	
	private void drawEnemies(Graphics g) {
		for(Enemy en: enemies) {
			en.draw(g);
			en.move();
		}
	}
	
	public Board() {
		loadEnemiesImages();
		loadEnemies();
		setFocusable(true);
		registerEvents();
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
		player.draw(g);
		drawEnemies(g);
	}
	
	
	

}

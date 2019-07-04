package com.brainmentors.gaming;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants{
	Player player;
	Camera camera;
	private Timer timer;
	Enemy enemies [] = new Enemy[MAX_ENEMIES];
	BufferedImage enemyImages[] = new BufferedImage[MAX_ENEMIES];
	private boolean gameOver = false;
	private boolean isCollide(Player player, Enemy enemy) {
		int xDistance = Math.abs(player.getX() - enemy.getX());
		int yDistance = Math.abs(player.getY() - enemy.getY());
		int w = Math.max(player.getW(), enemy.getW());
		int h = Math.max(player.getH(), enemy.getH());
		System.out.println("Height is "+h+" Width is "+w +" Y Distance is "+yDistance);
		return xDistance<=(w-WGAP) && yDistance<=(h-HGAP);
	}
	private void gameOverPrint(Graphics g) {
		g.setColor(Color.RED);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("Game Over", GWIDTH/2, GHEIGHT/2);
	}
	private void collisionCheck(Graphics g) {
		for(Enemy enemy : enemies) {
			if(isCollide(player, enemy)) {
				gameOver = true;
				gameOverPrint(g);
				timer.stop();
				break;
			}
		}
	}
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
			//	player.setSpeed(0);
				camera.setSpeed(0);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_F) {
					player.fire();
				}
				if(e.getKeyCode()==KeyEvent.VK_SPACE) {
					player.jump();
				}
				else
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					//player.setSpeed(5);
					camera.setSpeed(10);
					camera.move();
					//player.move();
				}
				else
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {	
					camera.setSpeed(-10);
					camera.move();
					//player.setSpeed(-5);
					//player.move();
				}
				
				//System.out.println("Key Press Call "+e.getKeyChar()+" "+e.getKeyCode());
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	private void gameLoop() {
		// Lambda Style
//		ActionListener l =(e)->{
//			player.fall();
//			repaint();
//		};
//		timer = new Timer(DELAY, l);
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
		camera = new Camera();
		loadEnemiesImages();
		loadEnemies();
		setFocusable(true);
		registerEvents();
		player = new Player();
		setSize(GWIDTH, GHEIGHT);
		setBackground(Color.BLACK);
		gameLoop();
	}
	
	private void printBullets(Graphics g) {
		for(Bullet bullet : player.getBullets()) {
			bullet.drawBullet(g);
		}
	}
	
	private void drawBackground(Graphics g) {
		camera.drawCamera(g);
		//BufferedImage image = ImageLoader.loadImage(BACKGROUND_IMAGE);
		//g.drawImage(image, 0, 0, GWIDTH, GHEIGHT, null);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		// Paint Job
		drawBackground(g);
		player.draw(g);
		drawEnemies(g);
		//collisionCheck(g);
		printBullets(g);
	}
	
	
	

}

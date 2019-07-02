package com.brainmentors.gaming;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player implements GameConstants {
	private int x;
	private int y;
	private int w;
	private int h;
	private int speed;
	private BufferedImage image;
	public Player() {
		speed = 5;
		x = 100;
		h = w = 100;
		y = FLOOR - h;
		image=  ImageLoader.loadImage(PLAYER_IMG);
			
	}
	public void move() {
		x+=speed;
		System.out.println("X is "+x);
	}
	public void drawPlayer(Graphics g) {
		g.drawImage(image, x,y,w,h,null);
	}

}

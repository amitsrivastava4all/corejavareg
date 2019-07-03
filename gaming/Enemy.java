package com.brainmentors.gaming;

import java.awt.image.BufferedImage;

public class Enemy extends Sprite implements GameConstants{
	boolean outOfScreen = false;
	public Enemy(int x, BufferedImage image, int speed) {
		this.h = this.w = 100;
		this.y = FLOOR - h;
		this.image = image;
		this.x = x;	
		this.speed = speed;
		
	}
}

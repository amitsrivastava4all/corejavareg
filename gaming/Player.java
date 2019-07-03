package com.brainmentors.gaming;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player extends Sprite implements GameConstants {
	
	private int force;
	private boolean isJumped;
	public Player() {
		isJumped = false;
		speed = 5;
		x = 100;
		h = w = 100;
		y = FLOOR - h;
		image=  ImageLoader.loadImage(PLAYER_IMG);
			
	}
	
	
	public void jump() {
		if(!isJumped) {
		force = DEFAULT_FORCE;
		y = y + force;
		isJumped = true;
		}
	}
	
	public void fall() {
		if(y>=FLOOR-h) {
			isJumped = false;
			y = FLOOR - h;
		}
		else {
		force  = force + GRAVITY;
		y = y + force;
		}
	}
	

	
	

}

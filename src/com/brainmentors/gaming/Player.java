package com.brainmentors.gaming;

import java.util.ArrayList;

public class Player extends Sprite implements GameConstants {
	private ArrayList<Bullet> bullets = new ArrayList<>();
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
	
	public ArrayList<Bullet> getBullets() {
		return bullets;
	}

	public void setBullets(ArrayList<Bullet> bullets) {
		this.bullets = bullets;
	}

	public void fire() {
		Bullet bullet = new Bullet((x+this.getW()/2+10), (y+(this.getH()/2-30)));
		bullets.add(bullet);
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

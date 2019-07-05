package com.brainmentors.gaming;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Camera extends Sprite implements GameConstants{
public Camera() {
	x = 0;
	y = 0;
	w = GWIDTH;
	h= GHEIGHT;
	speed = 10;
	image = ImageLoader.loadImage(CAMERA_IMAGE);
}
public void drawCamera(Graphics g) {
	BufferedImage subImage = image.getSubimage(x, y, GWIDTH, GHEIGHT);
	g.drawImage(subImage,0,0,GWIDTH, GHEIGHT,null);
}
}

package com.brainmentors.gaming;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public interface ImageLoader {
	
	static BufferedImage loadImage(String image) {
		try {
			BufferedImage buf = ImageIO.read(ImageLoader.class.getResource(image));
			return buf;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(GameFrame.frame, "Assets are Missing , Contact to Game Owner");
			e.printStackTrace();
			System.exit(0);
		}
		return null;
		
	}

}

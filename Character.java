import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;


public abstract class Character {
	int hM = 10;
	int vM = 10;
	int xComponent = 0;
	int yComponent = 0;
	
	Image x = null;
	static JLayeredPane EverythingButPlayer;
	static Character l1;
	
	public Character() {
	    EverythingButPlayer = new JLayeredPane();

	    BufferedImage img = null;
	    try {
	        img = ImageIO.read(new File("BeachRoad.png"));
	    } catch (IOException e) {
	    }
	    Graphics g = img.getGraphics();
	    g.drawImage(img, 0, 0, null);

	   
	}

	
	public Image getImage() {
		return null;
	}
	
	abstract public void updatePosition() ;
	
	//Returns positional data
	public int getX() {
		return 0;
	}
	public int getY() {
		return 0;
	}
	public void setX(int num) {
		xComponent = num;
	}
	public void setY(int num) {
		yComponent = num;
	}
	
}

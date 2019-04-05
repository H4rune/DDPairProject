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
	int speedMultiplier = 3;
	int xComponent = 50;
	int yComponent = 50;
	
	Image image;
	
	public Character() {
		
	}

	
	public Image getImage() {
		return image;
	}
	
	abstract public void setMovement(int dx, int dy);
	
	abstract public void updatePosition();
	
	//Returns positional data
	public int getX() {
		return xComponent;
	}
	public int getY() {
		return yComponent;
	}
	public void setX(int num) {
		xComponent = num;
	}
	public void setY(int num) {
		yComponent = num;
	}
	
	abstract public int getAngle();
	
}

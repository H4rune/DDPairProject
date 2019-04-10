import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;


public abstract class Character {
	double cursorAngle = 0;
	int hM = 10;
	int vM = 10;
	int speedMultiplier = 3;
	int xComponent = 50;
	int yComponent = 50;
	Point cursorPoint;
	String imageAddress = "T:\\Hello There\\transparentDD.png";

	Image image;

	public Character() {

	}

	protected void setCharacterImage(String imageString) {
		imageAddress = imageString;
		try {
			image = ImageIO.read(new File(imageAddress));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	abstract public double getAngle();
	public void setCursorPoint(Point p) {
		cursorPoint = p;
	}

	public void setCursorAngle() {
		double theAngle = 0;

		int x = (int)cursorPoint.getX();
		int y = (int)cursorPoint.getY();
		int xLength = x - xComponent;
		int yLength = y - yComponent;

		if(xLength>0 && yLength>0) {
			theAngle = Math.atan(yLength/xLength); 
		}
		
		else if(xLength>0 && yLength<0) {
			theAngle = Math.atan(yLength/xLength) + 2 * Math.PI; 
		}
		
		else if(xLength<0) {
			theAngle = Math.atan(yLength/xLength) + Math.PI; 
		}
		
		else {
			if(yLength>0) {
				theAngle = Math.PI / 2;
			}else if (yLength<0) {
				theAngle = 3 * Math.PI / 2;
			}else {
				theAngle = 0;
			}
		}

		cursorAngle = theAngle;
		System.out.println("CursorPoint:("+x+","+y+")");
		System.out.println("characterpoint:("+xComponent+","+yComponent+")");
		System.out.println("CursorAngle:"+Math.toDegrees(cursorAngle));
		
	}

}

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;


public abstract class Character {
	int[][] Coordinates /*= {{2,2},{2,2}}*/;
	double cursorAngle = 0;
	int hM = 10;
	int vM = 10;
	int speedMultiplier = 3;
	int xComponent = 50;
	int yComponent = 50;
	Point cursorPoint;
	String imageAddress = "T:\\Hello There\\transparentDD.png";
	Image image;
	Rectangle hitbox = new Rectangle();

	public Character() {

	}
	public Rectangle getHitbox() {
		return hitbox;
	}
	public void setHitbox(Rectangle r) {
		hitbox = new Rectangle(r);
	}
	public void setHitbox(int x, int y, int width, int height) {
		hitbox = new Rectangle(x-getXOffset(),y-getXOffset(),width,height);
	}
	public void moveHitbox(int dx, int dy) {
		hitbox.translate(dx, dy);
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
	public abstract void updateHitbox();

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
		
		

//		if(xLength>0 && yLength>0) {
//			theAngle = Math.atan2(yLength,xLength); 
//		}
//		
//		else if(xLength>0 && yLength<0) {
//			theAngle = Math.atan2(yLength,xLength) /*+ 2 * Math.PI*/; 
//		}
//		
//		else if(xLength<0) {
//			theAngle = Math.atan2(yLength,xLength) /*+ Math.PI*/; 
//		}
//		
//		else {
//			if(yLength>0) {
//				theAngle = Math.PI / 2;
//			}else if (yLength<0) {
//				theAngle = 3 * Math.PI / 2;
//			}else {
//				theAngle = 0;
//			}
//		}
//		System.out.println("CursorPoint:("+x+","+y+")");
//		System.out.println("characterpoint:("+xComponent+","+yComponent+")");
//		System.out.println("CursorAngle:"+Math.toDegrees(cursorAngle));
		
		
		cursorAngle = theAngle;

		
	}
	
	public int getXOffset() {
		return 32;
	}
	public int getYOffset() {
		return 32;
	}
	public int getWidth() {
		return image.getWidth(null);
	}
	public int getHeight() {
		return image.getHeight(null);
	}
	

}

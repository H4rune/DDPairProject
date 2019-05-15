import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Player extends Character{
	
	String imageAddress = ""; // Change this when back in schools
	Map map;
	Player(String imageFilePath, Map mappy){
		imageAddress = imageFilePath;
		setCharacterImage(imageAddress);
		map = mappy;
	}
	
	
		
	

	public void throwProjectile() {

	}
	public void takeDown() {

	}
	public void setVelocity() {
		
	}
	public void setCollisionReaction() {

	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		xComponent += hM;
		yComponent += vM;
		
	}

	@Override
	public void setMovement(int dx, int dy) {
		// TODO Auto-generated method stub
		hM = dx * speedMultiplier;
		vM = dy * speedMultiplier;
	}

	@Override
	public double getAngle() {
		return cursorAngle;		
	}
	public void setCursorAngle() {
		double theAngle = 0;

		int x = (int)cursorPoint.getX();
		int y = (int)cursorPoint.getY();
		int xLength = x - xComponent;
		int yLength = y - yComponent;

		float angle = (float) Math.toDegrees(Math.atan2(yLength, xLength));
		theAngle = Math.toRadians(angle);
		
		
//		if(xLength>0 && yLength>0) {
//			theAngle = Math.atan(yLength/xLength); 
//		}
//		
//		else if(xLength>0 && yLength<0) {
//			theAngle = Math.atan(yLength/xLength) + 2 * Math.PI; 
//		}
//		
//		else if(xLength<0) {
//			theAngle = Math.atan(yLength/xLength) + Math.PI; 
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


		cursorAngle = theAngle;
//		System.out.println("CursorPoint:("+x+","+y+")");
//		System.out.println("characterpoint:("+xComponent+","+yComponent+")");
//		System.out.println("CursorAngle:"+Math.toDegrees(cursorAngle));
		
	}





	@Override
	public int getXOffset() {
		// TODO Auto-generated method stub
		return 32;
	}
	public int getYOffset() {
		// TODO Auto-generated method stub
		return 32;
	}





	@Override
	public void updateHitbox() {
		// TODO Auto-generated method stub
		hitbox.translate(hM, vM);
	}


	@Override
	public void collisionReaction(Character otherCharacter, boolean informOther) {
		// TODO Auto-generated method stub
		if(informOther) {
			otherCharacter.collisionReaction(this, false);
		}
		
		//For player needs to reverse the movement
		xComponent -= hM;
		yComponent -= vM;
		
		//Add what will happend when colliding with blocks and enemies
		if(otherCharacter instanceof Guard) {
			lose();
		}
	}
	
	public void lose() {
		map.playerText("Uh Oh.. A guard hit you...");
		map.stopGame();
		
	}

}

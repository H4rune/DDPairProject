import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Player extends Character{
	
	String imageAddress = ""; // Change this when back in school
	
	Player(String imageFilePath){
		imageAddress = imageFilePath;
		setCharacterImage(imageAddress);
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

}

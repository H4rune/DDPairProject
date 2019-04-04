import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Player extends Character implements KeyListener{
	
	String imageAddress = "Z:\\transparentDD.png"; // Change this when back in school
	
	Player(){
		setCharacterImage();
	}
	
	private void setCharacterImage() {
		try {
			image = ImageIO.read(new File(imageAddress));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void throwProjectile() {

	}
	public void takeDown() {

	}
	public void setVelocity() {
		
	}
	public void setCollisionReaction() {

	}
	 public void keyPressed(KeyEvent e) {

	        int buttonPressed = e.getKeyCode();
	        System.out.println("hfjshfjksdhfsfdsdfs");

	        if (buttonPressed == KeyEvent.VK_LEFT) {
	            xComponent-=hM;
	            System.out.println("does this");
	        }

	        if (buttonPressed == KeyEvent.VK_RIGHT) {
	        	xComponent+=hM;
	        }

	        if (buttonPressed == KeyEvent.VK_UP) {
	        	yComponent+=vM;
	        }

	        if (buttonPressed == KeyEvent.VK_DOWN) {
	        	yComponent-=vM;
	        }
	    }

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		xComponent += hM;
		yComponent += vM;
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMovement(int dx, int dy) {
		// TODO Auto-generated method stub
		hM = dx * speedMultiplier;
		vM = dy * speedMultiplier;
	}

}

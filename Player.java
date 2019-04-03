import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Player extends Character implements ActionListener{
	
	private void setCharacterImage() {

//		ImageIcon theImageIcon = "filepath";
//		image = theImageIcon.getImage(); 

//		w = image.getWidth(null);
//		h = image.getHeight(null);
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

	        if (buttonPressed == KeyEvent.VK_LEFT) {
	            xComponent-=hM;
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		
		
	}

}

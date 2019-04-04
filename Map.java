import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Paint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.*;

public class Map extends JPanel implements WindowListener{

	JFrame frame;
	ArrayList<Character> characters;
	boolean loop;
	boolean closing;
	Map singleton;
	
	

	public void setBackground() {

	}

	Map(int width, int height){
		frame = new JFrame();
		characters = new ArrayList<Character>();
		closing = false;
		singleton = this;
		
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.addWindowListener(this);
		frame.setSize(width,height);
		this.setSize(width,height);
		Graphics g = frame.getGraphics();
		frame.add(singleton);
		singleton.paintComponents(g); 
		frame.setVisible(false);
	}
	//Call this to call the bottom paintComponent class code and update the map
	public void updateMap() {
		Graphics g = frame.getGraphics();
		singleton.paintComponents(g);
		frame.setVisible(true);
	}

	public void addCharacter(Character character) {
		characters.add(character);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("goes herer");

		for(Character character:characters) {
			character.updatePosition();

			int xPos = character.getX();
			int yPos = character.getY();

			Image image = character.getImage();

			g.drawImage(image, xPos, yPos, null);
		}

	}
	
	public void mainLoop() {//need to create a consistent game loop : (used fixed frame rates) http://www.java-gaming.org/index.php?topic=24220.0
		loop = true;
		//Try 1
//		while(loop) {
//			updateMap();
//			
//			if(characters.isEmpty())
//				loop = false;
//			if(closing) // this loop prevents the closing of the frame
//				loop = false;
//		}
		
		//Test Try
//		for(int i= 0 ;i < 10000; i++ ) {
//			updateMap();
//		}
		
		//Another attempt a game loop
//		long lastLoopTime = System.nanoTime();
//		   final int TARGET_FPS = 60;
//		   final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;
//		   long lastFpsTime = 0;
//		   long fps = 0;
//		   
//
//		   // keep looping round til the game ends
//		   while (loop){
//			   updateMap();
//			   singleton.repaint();
//			   try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		   }	
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		closing = true;
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}


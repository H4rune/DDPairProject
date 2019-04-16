import javax.imageio.ImageIO;
import javax.swing.*;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.MouseInfo;

public class Map extends JPanel implements Runnable, KeyListener{

	JFrame frame;
	ArrayList<Character> characters;
	boolean loop;
	boolean closing;
	Map singleton;
	Thread thread;
	int dx = 0;
	int dy = 0;
	Point cursor;
	
	

	public void setBackground() {

	}

	Map(int width, int height){
		frame = new JFrame();
		characters = new ArrayList<Character>();
		closing = false;
		singleton = this;
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(width,height);
		singleton.setSize(width,height);
		Graphics g = frame.getGraphics();
		frame.add(singleton);
		singleton.paintComponents(g);
		frame.setVisible(true);
		
		frame.addKeyListener(this);
		
//		System.out.println("does this");
	}
	//Call this to call the bottom paintComponent class code and update the map
	public void updateMap() {//Does not call paintComponent
		Graphics g = singleton.getGraphics();
		singleton.paint(g);
		frame.setVisible(true);
		
	}

	public void addCharacter(Character character) {
		characters.add(character);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
//		System.out.println("goes herer");
		
		Graphics2D g2= (Graphics2D) g;

		for(Character character:characters) {
			character.setMovement(dx, dy);
			Point framePoint = frame.getLocation();
			cursor = MouseInfo.getPointerInfo().getLocation();
			cursor.translate(-(int)framePoint.getX(), -(int)framePoint.getY());;
			cursor.translate(-5, -30);
			character.setCursorPoint(cursor);
			character.setCursorAngle();
			character.updatePosition();
			
			//Coordinates of the center of the image
			int xCenter = character.getX();
			int yCenter = character.getY();
			
			//Coordinates of the top left of the image
			//uses offset to make it look like it is rotating about its center
			int xPos = xCenter - character.getXOffset();
			int yPos = yCenter - character.getYOffset();
			
			Image image = character.getImage();
			
			double angle = character.getAngle();
			
			g2.rotate(angle, xCenter, yCenter);
			g.drawImage(image, xPos, yPos, null);
			
		}

	}
	
	
	public void mainLoop() {//need to create a consistent game loop : (used fixed frame rates) http://www.java-gaming.org/index.php?topic=24220.0
		//now in gameLoop
		thread = new Thread(singleton,"test");
		thread.start();
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean loop = true;
		long lastLoopTime = System.nanoTime();
		final int TARGET_FPS = 60;
		final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;   
		long fps = 0;
		long lastFpsTime = 0;

		   // keep looping round til the game ends
		   while (loop)
		   {
		      // work out how long its been since the last update, this
		      // will be used to calculate how far the entities should
		      // move this loop
		      long now = System.nanoTime();
		      long updateLength = now - lastLoopTime;
		      lastLoopTime = now;
		      double delta = updateLength / ((double)OPTIMAL_TIME);

		      // update the frame counter
		      lastFpsTime += updateLength;
		      fps++;
		      
		      // update our FPS counter if a second has passed since
		      // we last recorded
		      if (lastFpsTime >= 1000000000)
		      {
		         System.out.println("(FPS: "+fps+")");
		         lastFpsTime = 0;
		         fps = 0;
		      }
		      
		      
		      
		      
		      try {
		    	  updateMap();
		      }
		      catch(Exception e) {
//		    	  System.out.println("LOLOLOLOLOL");
//		    	  thread.interrupt();
		    	  thread.stop();
//		    	  thread.destroy();
		      }
		      
		      // we want each frame to take 10 milliseconds, to do this
		      // we've recorded when we started the frame. We add 10 milliseconds
		      // to this and then factor in the current time to give 
		      // us our final value to wait for
		      // remember this is in ms, whereas our lastLoopTime etc. vars are in ns.
		      try{Thread.sleep( (lastLoopTime-System.nanoTime() + OPTIMAL_TIME)/1000000 );}
		      catch(Exception e) {
		    	  
		      }
		   }
		}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int buttonPressed = e.getKeyCode();

        if (buttonPressed == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (buttonPressed == KeyEvent.VK_RIGHT) {
        	dx = 1;
        }

        if (buttonPressed == KeyEvent.VK_UP) {
        	dy = -1;
        }

        if (buttonPressed == KeyEvent.VK_DOWN) {
        	dy = 1;
        }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int buttonPressed = e.getKeyCode();

        if (buttonPressed == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (buttonPressed == KeyEvent.VK_RIGHT) {
        	dx = 0;
        }

        if (buttonPressed == KeyEvent.VK_UP) {
        	dy = 0;
        }

        if (buttonPressed == KeyEvent.VK_DOWN) {
        	dy = 0;
        }
       
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	


}
	
	
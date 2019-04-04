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

public class Map extends JPanel{

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
		frame.setSize(width,height);
		this.setSize(width,height);
		Graphics g = frame.getGraphics();
		frame.add(singleton);
		singleton.paintComponents(g);
		frame.setVisible(true);
//		System.out.println("does this");
	}
	//Call this to call the bottom paintComponent class code and update the map
	public void updateMap() {//Does not call paintComponent
		Graphics g = frame.getGraphics();
		singleton.paint(g);
		frame.setVisible(true);
	}

	public void addCharacter(Character character) {
		characters.add(character);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
//		System.out.println("goes herer");

		for(Character character:characters) {
			character.updatePosition();

			int xPos = character.getX();
			int yPos = character.getY();

			Image image = character.getImage();

			g.drawImage(image, xPos, yPos, null);
		}

	}
	
	public void mainLoop() {//need to create a consistent game loop : (used fixed frame rates) http://www.java-gaming.org/index.php?topic=24220.0
		loop = true;		// also need to create a new thread to run this
		while(loop) {
			updateMap();
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}

}
	
	
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

	public void setBackground() {

	}

	Map(int width, int height){
		frame = new JFrame();
		characters = new ArrayList<Character>();
		closing = false;
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(this);
		frame.setSize(width,height);
		Graphics g = frame.getGraphics();
		frame.paint(g); // will this work, if not which graphics should be passed as a parameter?
		frame.setVisible(false);
	}
	//Call this to call the bottom paintComponent class code and update the map
	public void updateMap() {
		frame.repaint();
		frame.setVisible(true);
	}

	public void addCharacter(Character character) {
		characters.add(character);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for(Character character:characters) {
			character.updatePosition();

			int xPos = character.getX();
			int yPos = character.getY();

			Image image = character.getImage();

			g.drawImage(image, xPos, yPos, null);
		}

	}
	
	public void mainLoop() {
		loop = true;
		while(loop) {
			updateMap();
			if(characters.isEmpty())
				loop = false;
			if(closing)
				loop = false;
		}
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


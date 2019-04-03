import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.*;

public class Map extends JPanel {
	
	JFrame frame = new JFrame();
	ArrayList<Character> characters = new ArrayList<Character>();
	
	public void setBackground() {
		
	}
	
	Map(int width, int height){
		this.setSize(width, height);
		frame.add(this);
		frame.setVisible(false);
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

}


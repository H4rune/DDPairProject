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

public class Map extends JPanel {

	JFrame frame = new JFrame();
	ArrayList<Character> characters = new ArrayList<Character>();
	Character player = characters.get(0);

	public void setBackground() {

	}

	Map(int width, int height){
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

//	public void actionPerformed(ActionEvent e) {
//
//		player.updatePosition();
//	}
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


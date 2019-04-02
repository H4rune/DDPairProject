import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;
public class Character implements ActionListener {
	
	static JLayeredPane EverythingButPlayer;
	static Character l1;
	
	public Character() {
	    EverythingButPlayer = new JLayeredPane();

	    BufferedImage img = null;
	    try {
	        img = ImageIO.read(new File("BeachRoad.png"));
	    } catch (IOException e) {
	    }
	    Graphics g = img.getGraphics();
	    g.drawImage(img, 0, 0, null);

	   
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

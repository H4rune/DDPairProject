import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.*;

public class LevelSelect implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel contentPane = new JPanel();
	JButton level1 = new JButton();
	JButton level2 = new JButton();
	JButton level3 = new JButton();
	JButton level4 = new JButton();
	JButton level5 = new JButton();
	JButton level6 = new JButton();
	JButton level7 = new JButton();
	JButton level8 = new JButton();
	JButton level9 = new JButton();
	
	
	
	public static void main(String[] args) {
		
		
	}
	
	LevelSelect(){
		level1.setActionCommand("1");
		level2.setActionCommand("2");
		level3.setActionCommand("3");
		level4.setActionCommand("4");
		level5.setActionCommand("5");
		level6.setActionCommand("6");
		level7.setActionCommand("7");
		level8.setActionCommand("8");
		level9.setActionCommand("9");
		level1.addActionListener(null);
		level2.addActionListener(null);
		level3.addActionListener(null);
		level4.addActionListener(null);
		level5.addActionListener(null);
		level6.addActionListener(null);
		level7.addActionListener(null);
		level8.addActionListener(null);
		level9.addActionListener(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		e.getActionCommand();
	}
	
}

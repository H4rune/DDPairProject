import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.GridLayout;
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
	JButton level10 = new JButton();
	
	
	
	public static void main(String[] args) {
		LevelSelect main = new LevelSelect();
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
		level10.setActionCommand("10");
		level1.addActionListener(this);
		level2.addActionListener(this);
		level3.addActionListener(this);
		level4.addActionListener(this);
		level5.addActionListener(this);
		level6.addActionListener(this);
		level7.addActionListener(this);
		level8.addActionListener(this);
		level9.addActionListener(this);
		level10.addActionListener(this);
		level1.setText("Level 1");
		level2.setText("Level 2");
		level3.setText("Level 3");
		level4.setText("Level 4");
		level5.setText("Level 5");
		level6.setText("Level 6");
		level7.setText("Level 7");
		level8.setText("Level 8");
		level9.setText("Level 9");
		level10.setText("Level 10");
		
		GridLayout grid = new GridLayout(0,2);
		contentPane.setLayout(grid);
		
		contentPane.add(level1);
		contentPane.add(level2);
		contentPane.add(level3);
		contentPane.add(level4);
		contentPane.add(level5);
		contentPane.add(level6);
		contentPane.add(level7);
		contentPane.add(level8);
		contentPane.add(level9);
		contentPane.add(level10);
		
		frame.add(contentPane);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		e.getActionCommand();
	}
	
}

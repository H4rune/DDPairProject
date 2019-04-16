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
	//School
//	String playerAddress = "T:\\Hello There\\transparentDD.png";
//	String easyGuardAddress = "T:\\Hello There\\easyGuard.png";
	//Anudeep
//	String playerAddress = "C:\\Users\\ametu\\OneDrive\\Desktop\\DDPics\\transparentDD.png";
//	String easyGuardAddress = "C:\\Users\\ametu\\OneDrive\\Desktop\\DDPics\\easyGuard.png";
	//Harun
	String playerAddress = "C:\\Users\\harun\\Desktop\\miscelaneous\\PairProjPic\\transparentDD.png";
	String easyGuardAddress = "C:\\Users\\harun\\Desktop\\miscelaneous\\PairProjPic\\transparentDD.png";
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
	
	Map map;
	static LevelSelect main;
	
	public static void main(String[] args) {
		main = new LevelSelect();
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
		frame.setSize(400, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	//Runs the respective level
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.setVisible(false);
		if(e.getActionCommand().equals("1")) {
			create1();
		}
		else if(e.getActionCommand().equals("2")) {
			create2();
		}
		else if(e.getActionCommand().equals("3")) {
			create3();
		}
		else if(e.getActionCommand().equals("4")) {
			create4();
		}
		else if(e.getActionCommand().equals("5")) {
			create5();
		}
		else if(e.getActionCommand().equals("6")) {
			create6();
		}
		else if(e.getActionCommand().equals("7")) {
			create7();
		}
		else if(e.getActionCommand().equals("8")) {
			create8();
		}
		else if(e.getActionCommand().equals("9")) {
			create9();
		}
		else if(e.getActionCommand().equals("10")) {
			create10();
		}
		
		frame.setVisible(true);
	}
	
	
	//Place all characters into maps here
	private void create1() {
		Character player = new Player(playerAddress);
		map = new Map(500,500);
		map.addCharacter(player);
		map.mainLoop();
	}
	

	private void create2() {
		Character guard = new EasyGuard(easyGuardAddress);
		map = new Map(500,500);
		map.addCharacter(guard);
		map.mainLoop();
	}

	private void create3() {
		
	}

	private void create4() {
		
	}

	private void create5() {
		
	}

	private void create6() {
		
	}

	private void create7() {
		
	}

	private void create8() {
		
	}

	private void create9() {
		
	}

	private void create10() {
		
	}
	
}


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
	
	/*Read this!!!!!!!!!!
	 * 
	 * 
	 * 
	 * For every level, Player must be the first object added to the characters ArrayList!!!!
	 * For every level, Player must be the first object added to the characters ArrayList!!!!
	 * For every level, Player must be the first object added to the characters ArrayList!!!!
	 * For every level, Player must be the first object added to the characters ArrayList!!!!
	 * For every level, Player must be the first object added to the characters ArrayList!!!!
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	
	
	
	
	
	
	//School
//	String playerAddress = "T:\\Hello There\\transparentDD.png";
//	String easyGuardAddress = "T:\\Hello There\\easyGuard.png";
//	String wallBlockAddress = "T:\\Hello There\\wallSprite.png";
	//Anudeep
//	String playerAddress = "C:\\Users\\ametu\\OneDrive\\Desktop\\DDPics\\transparentDD.png";
//	String easyGuardAddress = "C:\\Users\\ametu\\OneDrive\\Desktop\\DDPics\\easyGuard.png";
	//Harun
	String playerAddress = "C:\\Users\\harun\\Desktop\\miscelaneous\\PairProjPic\\transparentDD.png";
	String easyGuardAddress = "C:\\Users\\harun\\Desktop\\miscelaneous\\PairProjPic\\transparentDD.png";
	String wallBlockAddress = "C:\\Users\\harun\\Desktop\\miscelaneous\\PairProjPic\\transparentDD.png";
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
//		contentPane.add(level9);
//		contentPane.add(level10);
		
		frame.add(contentPane);
		frame.setSize(400, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	//Runs the respective level
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		frame.setVisible(false);
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
		
//		frame.setVisible(true);
	}
	
	
	//Place all characters into maps here
	private void create1() {
		Character player = new Player(playerAddress, map);
		player.xComponent = 65 + 32;
		player.yComponent = 65 + 32;
		
		Character[] walls = new Character[30];
		for(int i = 0;i<=4;i++) {
			walls[i]= new WallBlock(wallBlockAddress, 0,i*64);
		}
		for(int i = 5;i<=9;i++) {
			walls[i]= new WallBlock(wallBlockAddress, 576,(i-5)*64);
		}
		for(int i = 10;i<=19;i++) {
			walls[i]= new WallBlock(wallBlockAddress, (i-10)*64,0);
			walls[i+10]= new WallBlock(wallBlockAddress, (i-10)*64,256);
		}
		
		Map map;
		map = new Map(640 +18,320 +32);
		map.addCharacter(player);
		for(Character wall:walls) {
			map.addCharacter(wall);
		}
		
		Character Winner = new WinBlock(wallBlockAddress,500,192, map);
		map.addCharacter(Winner);
		map.mainLoop();
	}
	

	private void create2() {
		Character player = new Player(playerAddress, map);
		player.xComponent = 65 + 32;
		player.yComponent = 65 + 32;
		
		Character[] walls = new Character[30];
		for(int i = 0;i<=4;i++) {
			walls[i]= new WallBlock(wallBlockAddress, 0,i*64);
		}
		for(int i = 5;i<=9;i++) {
			walls[i]= new WallBlock(wallBlockAddress, 576,(i-5)*64);
		}
		for(int i = 10;i<=19;i++) {
			walls[i]= new WallBlock(wallBlockAddress, (i-10)*64,0);
			walls[i+10]= new WallBlock(wallBlockAddress, (i-10)*64,256);
		}
		
		Map map;
		map = new Map(640 +18,320 +32);
		map.addCharacter(player);
		for(Character wall:walls) {
			map.addCharacter(wall);
		}
		
		Character Winner = new WinBlock(wallBlockAddress,500,192, map);
		map.addCharacter(Winner);
		
		//add guards
		Character guard = new Guard(easyGuardAddress);
		((Guard) guard).setStartingPoint(384, 64);;
		int[][] lmao = {{384,256},{192,256},{192,64},{384,64}};
		((Guard) guard).setPath(lmao);
		
		map.addCharacter(guard);
		map.mainLoop();
	}

	private void create3() {
		Character player = new Player(playerAddress, map);
		player.xComponent = 32;
		player.yComponent = 300 ;
		
		
		
		Map map;
		map = new Map(1000 +18,600 +32);
		map.addCharacter(player);
		
		
		Character Winner = new WinBlock(wallBlockAddress,900,300, map);
		map.addCharacter(Winner);
		
		//Add guards
		Character guard1 = new Guard(easyGuardAddress);
		((Guard) guard1).setStartingPoint(200, 100);
		int[][] lmao = {{200,100},{200,550}};
		((Guard) guard1).setPath(lmao);
		((Guard) guard1).setSpeed(7);
		
		Character guard2 = new Guard(easyGuardAddress);
		((Guard) guard2).setStartingPoint(300, 100);
		int[][] lmao2 = {{300,100},{300,550}};
		((Guard) guard2).setPath(lmao2);
		((Guard) guard2).setSpeed(7);
		
		Character guard3 = new Guard(easyGuardAddress);
		((Guard) guard3).setStartingPoint(400, 100);
		int[][] lmao3 = {{400,100},{400,550}};
		((Guard) guard3).setPath(lmao3);
		((Guard) guard3).setSpeed(7);
		
		Character guard4 = new Guard(easyGuardAddress);
		((Guard) guard4).setStartingPoint(500, 100);
		int[][] lmao4 = {{500,100},{500,550}};
		((Guard) guard4).setPath(lmao4);
		((Guard) guard4).setSpeed(7);
		
		Character guard5 = new Guard(easyGuardAddress);
		((Guard) guard5).setStartingPoint(600, 100);
		int[][] lmao5 = {{600,100},{600,550}};
		((Guard) guard5).setPath(lmao5);
		((Guard) guard5).setSpeed(7);
		
		Character guard6 = new Guard(easyGuardAddress);
		((Guard) guard6).setStartingPoint(700, 100);
		int[][] lmao6 = {{700,100},{700,550}};
		((Guard) guard6).setPath(lmao6);
		((Guard) guard6).setSpeed(7);
		
		Character guard7 = new Guard(easyGuardAddress);
		((Guard) guard7).setStartingPoint(800, 100);
		int[][] lmao7 = {{800,100},{800,550}};
		((Guard) guard7).setPath(lmao7);
		((Guard) guard7).setSpeed(7);
		
		map.addCharacter(guard1);
		map.addCharacter(guard2);
		map.addCharacter(guard3);
		map.addCharacter(guard4);
		map.addCharacter(guard5);
		map.addCharacter(guard6);
		map.addCharacter(guard7);
		map.mainLoop();	}

	private void create4() {//test player and also the guard in this one
		Character player = new Player(playerAddress, map);
		player.xComponent = 32;
		player.yComponent = 32 ;
		
		
		
		
		Map map;
		map = new Map(600+18,600 +32);
		map.addCharacter(player);
		
		
		Character Winner = new WinBlock(wallBlockAddress,550,550, map);
		map.addCharacter(Winner);

		
		Character guard1 = new Guard(easyGuardAddress);
		((Guard) guard1).setStartingPoint(550, 550);
		int[][] lmao = {{550,550},{130,550},{130,400},{500,400},{500,100},{130,100},{130,550}};
		((Guard) guard1).setPath(lmao);
		((Guard) guard1).setSpeed(20);
		map.addCharacter(guard1);
		
		map.mainLoop();
		

	}

	private void create5() {
		Character player = new Player(playerAddress, map);
		player.xComponent = 52;
		player.yComponent = 500;
		
		Map map;
		map = new Map(640,640);
		map.addCharacter(player);
		Character guard1 = new Guard(easyGuardAddress);
		((Guard) guard1).setStartingPoint(300, 400);
		int[][] lmao = {{300,400},{50,400},{500,400},{500,140},{300,140}};
		((Guard) guard1).setPath(lmao);
		Character guard2 = new Guard(easyGuardAddress);
		((Guard) guard2).setStartingPoint(300, 50);
		int[][] lmao2 = {{50,50},{550,50}};
		((Guard) guard2).setPath(lmao2);
		Character guard3 = new Guard(easyGuardAddress);
		((Guard) guard3).setStartingPoint(300, 300);
		int[][] lmao3 = {{50,300},{150,300}};
		((Guard) guard3).setPath(lmao3);
		Character block1 = new WallBlock(wallBlockAddress,32,120);
		Character block2 = new WallBlock(wallBlockAddress,96,120);
		Character block3 = new WallBlock(wallBlockAddress,128,120);
		Character block4 = new WallBlock(wallBlockAddress,146,120);
		
		map.addCharacter(guard1);
		map.addCharacter(guard2);
		map.addCharacter(guard3);
		map.addCharacter(block1);
		map.addCharacter(block2);
		map.addCharacter(block3);
		map.addCharacter(block4);

		Character Winner = new WinBlock(wallBlockAddress,32,32, map);
		map.addCharacter(Winner);
		map.mainLoop();

	}

	private void create6() {//tests the guardvision
		Character player = new Player(playerAddress, map);
		player.xComponent = 52;
		player.yComponent = 560;
		
		Map map;
		map = new Map(500,800);
		map.addCharacter(player);
		Character guard1 = new Guard(easyGuardAddress);
		((Guard) guard1).setStartingPoint(300, 430);
		int[][] lmao = {{300,430},{50,430},{600,430},{600,140},{300,140}};
		((Guard) guard1).setPath(lmao);
		Character guard2 = new Guard(easyGuardAddress);
		((Guard) guard2).setStartingPoint(300, 50);
		int[][] lmao2 = {{50,50},{550,50}};
		((Guard) guard2).setPath(lmao2);
		Character guard3 = new Guard(easyGuardAddress);
		((Guard) guard3).setStartingPoint(300, 350);
		int[][] lmao3 = {{50,350},{150,350}};
		((Guard) guard3).setPath(lmao3);
		Character block1 = new WallBlock(wallBlockAddress,32,120);
		Character block2 = new WallBlock(wallBlockAddress,250,520);
		Character block3 = new WallBlock(wallBlockAddress,160,248);
		Character block4 = new WallBlock(wallBlockAddress,224,312);
		Character block5 = new WallBlock(wallBlockAddress,186,520);
		
		
		map.addCharacter(guard1);
		map.addCharacter(guard2);
		map.addCharacter(guard3);
		map.addCharacter(block1);
		map.addCharacter(block2);
		map.addCharacter(block3);
		map.addCharacter(block4);
		map.addCharacter(block5);

		Character Winner = new WinBlock(wallBlockAddress,32,32, map);
		map.addCharacter(Winner);
		map.mainLoop();

	}

	private void create7() {
		Character player = new Player(playerAddress, map);
		player.xComponent = 32;
		player.yComponent = 32;
		
		Map map;
		map = new Map(1000,800);
		map.addCharacter(player);
		Character guard1 = new Guard(easyGuardAddress);
		((Guard) guard1).setStartingPoint(32,700);
		int[][] lmao = {{32,700},{32,400}};
		((Guard) guard1).setPath(lmao);
		
		Character guard2 = new Guard(easyGuardAddress);
		((Guard) guard2).setStartingPoint(700, 32);
		int[][] lmao2 = {{700,200},{700,32}};
		((Guard) guard2).setPath(lmao2);
		
		Character guard2b = new Guard(easyGuardAddress);
		((Guard) guard2b).setStartingPoint(500, 200);
		int[][] lmao2b = {{500,300},{500,32}};
		((Guard) guard2b).setPath(lmao2b);
		
		Character guard4 = new Guard(easyGuardAddress);
		((Guard) guard4).setStartingPoint(386, 418);
		
		Character block1 = new WallBlock(wallBlockAddress,688,400);
		Character block2 = new WallBlock(wallBlockAddress,624,400);
		Character block3 = new WallBlock(wallBlockAddress,760,400);
		Character block4 = new WallBlock(wallBlockAddress,824,400);
		Character block5 = new WallBlock(wallBlockAddress,952,400);
		
		Character block1a = new WallBlock(wallBlockAddress,288,500);
		Character block2a = new WallBlock(wallBlockAddress,224,500);
		Character block3a = new WallBlock(wallBlockAddress,160,500);
		
		
		map.addCharacter(guard1);
		map.addCharacter(guard2);
		map.addCharacter(guard2b);
		map.addCharacter(guard4);
		map.addCharacter(block1);
		map.addCharacter(block2);
		map.addCharacter(block3);
		map.addCharacter(block1a);
		map.addCharacter(block2a);
		map.addCharacter(block3a);
		map.addCharacter(block4);
		map.addCharacter(block5);

		Character Winner = new WinBlock(easyGuardAddress,600,500, map);//536,468
		map.addCharacter(Winner);
		map.mainLoop();


	}

	private void create8() {
		Character player = new Player(playerAddress, map);
		player.xComponent = 32;
		player.yComponent = 50 ;
		
		
		
		Map map;
		map = new Map(1000 +18,100);
		map.addCharacter(player);
		
		
		Character Winner = new WinBlock(wallBlockAddress,900,50, map);
		map.addCharacter(Winner);
		
		//Add guards
		Character guard1 = new Guard(easyGuardAddress);
		((Guard) guard1).setStartingPoint(200, 50);
		int[][] lmao = {{200,50},{800,50},{800,300},{100,300}};
		((Guard) guard1).setPath(lmao);
		((Guard) guard1).setSpeed(4);
		
		Character guard2 = new Guard(easyGuardAddress);
		((Guard) guard2).setStartingPoint(200, 150);
		int[][] lmao2 = {{200,150},{800,50},{800,300},{100,300}};
		((Guard) guard2).setPath(lmao2);
		((Guard) guard2).setSpeed(7);
		
		Character guard3 = new Guard(easyGuardAddress);
		((Guard) guard3).setStartingPoint(200, 250);
		int[][] lmao3 = {{200,250},{800,50},{800,300},{100,300}};
		((Guard) guard3).setPath(lmao3);
		((Guard) guard3).setSpeed(7);
		
		Character guard4 = new Guard(easyGuardAddress);
		((Guard) guard4).setStartingPoint(200, 350);
		int[][] lmao4 = {{200,350},{800,50},{800,300},{100,300}};
		((Guard) guard4).setPath(lmao4);
		((Guard) guard4).setSpeed(7);
		
		Character guard5 = new Guard(easyGuardAddress);
		((Guard) guard5).setStartingPoint(200, 450);
		int[][] lmao5 = {{200,450},{800,50},{800,300},{100,300}};
		((Guard) guard5).setPath(lmao5);
		((Guard) guard5).setSpeed(7);
		
		Character guard6 = new Guard(easyGuardAddress);
		((Guard) guard6).setStartingPoint(200, 550);
		int[][] lmao6 = {{200,550},{800,50},{800,300},{100,300}};
		((Guard) guard6).setPath(lmao6);
		((Guard) guard6).setSpeed(7);
		
		Character guard7 = new Guard(easyGuardAddress);
		((Guard) guard7).setStartingPoint(200, 650);
		int[][] lmao7 = {{200,650},{800,50},{800,300},{100,300}};
		((Guard) guard7).setPath(lmao7);
		((Guard) guard7).setSpeed(7);
		
		map.addCharacter(guard1);
		map.addCharacter(guard2);
		map.addCharacter(guard3);
		map.addCharacter(guard4);
		map.addCharacter(guard5);
		map.addCharacter(guard6);
		map.addCharacter(guard7);
		map.mainLoop();
		
	}
	

	private void create9() {
		
	}

	private void create10() {
		
	}
	
}
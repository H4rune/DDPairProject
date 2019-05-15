
public class WinBlock extends WallBlock{
	
	Map map;

	WinBlock(String imageFilePath, int x, int y, Map mappy) {
		super(imageFilePath, x, y);
		// TODO Auto-generated constructor stub
		GivenX = x;
		GivenY = y;
		map = mappy;
	}
	
	public boolean collisionReaction(Character otherCharacter, boolean informOther) {
		// TODO Auto-generated method stub
		if(informOther) {
			otherCharacter.collisionReaction(this, false);
		}
		
		//Add what will happend when colliding with blocks and enemies
		if(otherCharacter instanceof Player) {
//			win();
			return true;
		}
		return false;
	}
	
	public void win() {
		//add code here to make the game over
		map.playerText("Congrats You Won!");
		map.stopGame();
		
	}
	
}
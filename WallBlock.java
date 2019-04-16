
public class WallBlock extends Character {
	
	WallBlock(String imageFilePath){
		imageAddress = imageFilePath;
		setCharacterImage(imageAddress);
	}
	
	public void setCollisionReaction() {
		
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		xComponent = 200;
		yComponent = 200;
	}

	@Override
	public void setMovement(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getAngle() {
		// TODO Auto-generated method stub
		return 0;
	}

}

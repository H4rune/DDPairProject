
public class WallBlock extends Character {
	int GivenX;
	int GivenY;
	
	
	WallBlock(String imageFilePath, int x, int y){
		imageAddress = imageFilePath;
		setCharacterImage(imageAddress);
		GivenX = x;
		GivenY = y;
	}
	
	public void setCollisionReaction() {
		
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		xComponent = GivenX;
		yComponent = GivenY;
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

	@Override
	public void updateHitbox() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collisionReaction(Character otherCharacter, boolean informOther) {
		// TODO Auto-generated method stub
		if(informOther) {
			otherCharacter.collisionReaction(this, false);
		}
	}

}

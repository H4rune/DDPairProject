
public class Guard extends Character {
	
	String imageAddress = "";

	Guard(String imageFilePath){
		imageAddress = imageFilePath;
		setCharacterImage(imageAddress);
	}
	
	
	public void setGuardPath() {
		
	}
	public void setLookingDirectionVector() {

	}
	
	public void setCollisionReaction() {

	}
	
	@Override
	public void updatePosition() {
	
		xComponent += 5;
		yComponent += 5;
		
	}
	@Override
	public void setMovement(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getAngle() {
		// TODO Auto-generated method stub
		return 0;
	}
}

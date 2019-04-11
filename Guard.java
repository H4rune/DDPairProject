
public abstract class Guard extends Character {
	boolean reachedPoint = false;
	boolean faceFromPoint = false;
	boolean facePoint = true;
	int[] pointToReach = {400,400};
	
	String imageAddress = "";

	Guard(String imageFilePath){
		imageAddress = imageFilePath;
		setCharacterImage(imageAddress);
	}
	
	
	abstract public void setGuardPath();
	public void setLookingDirectionVector() {}
	
	public void setCollisionReaction() {}
	
	@Override
	public void updatePosition() {
		xComponent += hM;
		yComponent += vM;
	}
	@Override
	abstract public void setMovement(int dx, int dy) ;
	@Override
	public double getAngle() {
		// TODO Auto-generated method stub
		return 0;
	}
}

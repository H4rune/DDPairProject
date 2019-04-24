public abstract class Guard extends Character {
	String FacingDirection = "";
	boolean reachedPoint = false;
	
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
//		xComponent += hM;
//		if(x = 2) {
//			
//		}
		yComponent += vM/10;
		
//		if(this.getX() = ) {
//			
//		}
	}
	
//	private void setFacingDirection() {
//		if(this.cursorAngle< Math.PI/2 && this.cursorAngle< Math.PI/2) {
//			
//		}
//	}
	@Override
	abstract public void setMovement(int dx, int dy) ;
	@Override
	public double getAngle() {
		// TODO Auto-generated method stub
		return 0;
	}
}
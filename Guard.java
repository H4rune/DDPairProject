public abstract class Guard extends Character {
	int index;
	String FacingDirection = "";
	int[][] Coordinates /*= {{2,2},{2,2}}*/;
	boolean reachedPoint = false;

	int[] pointToReach = {400,400};


	String imageAddress = "";

	Guard(String imageFilePath){
		imageAddress = imageFilePath;
		setCharacterImage(imageAddress);
	}

	public void setLookingDirectionVector() {}

	public void setCollisionReaction() {}

	@Override
	public void updatePosition() {
		//		xComponent += hM;
		//		if(x = 2) {
		//			
		//		}

		int xCor = this.getX();
		if(xCor < 200) {
			xComponent += hM/10;
			String FacingDirection = "right";
		}
		if(xCor >= 200 && xCor<205) {
			yComponent += vM/10;
			String FacingDirection = "down";
		}
	}

	public void setGuardPath(int[][]points) {
		int xC = 0;
		int yC = 1;
		int xCor = this.getX();
		int yCor = this.getY();
		
		Coordinates = points;
		//		for(int i = 0; i<Coordinates.length; i++) {
		if(xCor < Coordinates[index][xC]) {
			xComponent += hM/10;
			String FacingDirection = "right";
		}	
		if(xCor > Coordinates[index][xC]) {
			xComponent -= hM/10;
			String FacingDirection = "left";
		}	
		if(yCor < Coordinates[index][yC]) {
			yComponent += vM/10;
			String FacingDirection = "up";
		}
		if(yCor > Coordinates[index][yC]) {
			yComponent -= vM/10;
			String FacingDirection = "down";
		}
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
public class Guard extends Character {
	int lastIndexReached;
	int index;
	String facingDirection = "";// "up" "down" "left" "right"
	int[][] Coordinates /*= {{2,2},{2,2}}*/;

	String imageAddress = "";

	Guard(String imageFilePath){
		imageAddress = imageFilePath;
		setCharacterImage(imageAddress);
		lastIndexReached= 0;
		xComponent = 100;
		yComponent = 100;
	}
	public void setStartingPoint(int x, int y) {
		xComponent = x;
		yComponent = y; 		
	}
	public void setLookingDirectionVector() {}

	public void setCollisionReaction() {}

	@Override
	public void updatePosition() {
		//		xComponent += hM;
		//		if(x = 2) {
		//			
		//		}

		
		if(xComponent == Coordinates[lastIndexReached+1][0] && yComponent == Coordinates[lastIndexReached+1][1]) {
			if(lastIndexReached == (Coordinates.length - 2)) {
				lastIndexReached = 0;
			} else {
				lastIndexReached++;
			}
		}
		if(Coordinates[lastIndexReached][0] == xComponent) {
			if(Coordinates[lastIndexReached][1] > yComponent) {
				facingDirection = "down" ;
			}
			if(Coordinates[lastIndexReached][1] < yComponent) {
				facingDirection = "up" ;
			}
		}
		
		if(Coordinates[lastIndexReached][0] == yComponent) {
			if(Coordinates[lastIndexReached][0] > xComponent) {
				facingDirection = "left" ;
			}
			if(Coordinates[lastIndexReached][0] < xComponent) {
				facingDirection = "right" ;
			}
		}
		
		if(facingDirection.equals("up")) {
			if(Coordinates[lastIndexReached+1][1]  - yComponent <10) {
				yComponent += Coordinates[lastIndexReached+1][1] - yComponent;
			}else {
				yComponent -= vM/10;
			}
		}
		
		if(facingDirection.equals("down")) {
			if(yComponent - Coordinates[lastIndexReached+1][1] <10) {
				yComponent += Coordinates[lastIndexReached+1][1] - yComponent;
			}else {
				yComponent += vM/10;
			}
		
		}
		
		if(facingDirection.equals("left")) {
			if(xComponent - Coordinates[lastIndexReached+1][0] <10) {
				xComponent += Coordinates[lastIndexReached+1][0] - xComponent;
			}else {
			xComponent -= hM/10;
			}
		}
		
		if(facingDirection.equals("right")) {
			if(Coordinates[lastIndexReached+1][0] - xComponent <10) {
				xComponent += Coordinates[lastIndexReached+1][0] - xComponent;
			}else {
			xComponent += hM/10;
			}
		}
		
		//		if(xComponent < 200) {
		//			xComponent += hM/10;
		//			String FacingDirection = "right";
		//		}
		//		if(xComponent >= 200 && xComponent<205) {
		//			yComponent += vM/10;
		//			String FacingDirection = "down";
		//		}





	}

	public void followPoint(int[] point) {
		if(this.getX()<point[0]) {

		}
	}

	public void setGuardPath(int[][]points) {
//		int xC = 0;
//		int yC = 1;
//		int xComponent = this.getX();
//		int yComponent = this.getY();

		Coordinates = points;
		//		for(int i = 0; i<Coordinates.length; i++) {
//		if(xComponent < Coordinates[index][xC]) {
//			xComponent += hM/10;
//			String FacingDirection = "right";
//		}	
//		if(xComponent > Coordinates[index][xC]) {
//			xComponent -= hM/10;
//			String FacingDirection = "left";
//		}	
//		if(yComponent < Coordinates[index][yC]) {
//			yComponent += vM/10;
//			String FacingDirection = "up";
//		}
//		if(yComponent > Coordinates[index][yC]) {
//			yComponent -= vM/10;
//			String FacingDirection = "down";
//		}
		//		}

	}

	//	private void setFacingDirection() {
	//		if(this.cursorAngle< Math.PI/2 && this.cursorAngle< Math.PI/2) {
	//			
	//		}
	//	}
//	@Override
//	abstract public void setMovement(int dx, int dy) ;
	@Override
	public double getAngle() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setMovement(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateHitbox() {
		// TODO Auto-generated method stub
		
	}
}
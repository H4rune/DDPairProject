public abstract class Guard extends Character {
	int lastIndexReached;
	int index;
	String facingDirection = "";// "up" "down" "left" "right"
	int[][] Coordinates /*= {{2,2},{2,2}}*/;

	String imageAddress = "";

	Guard(String imageFilePath){
		imageAddress = imageFilePath;
		setCharacterImage(imageAddress);
		lastIndexReached= 0;
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

		int xCor = this.getX();
		int yCor = this.getY();

		if(Coordinates[lastIndexReached][0] == xCor) {
			if(Coordinates[lastIndexReached][1] > yCor) {
				facingDirection = "down" ;
			}
			if(Coordinates[lastIndexReached][1] < yCor) {
				facingDirection = "up" ;
			}
		}
		if(Coordinates[lastIndexReached][0] == yCor) {
			if(Coordinates[lastIndexReached][0] > xCor) {
				facingDirection = "left" ;
			}
			if(Coordinates[lastIndexReached][0] < xCor) {
				facingDirection = "right" ;
			}
		}
		
		if(facingDirection.equals("up")) {
			
		}
		if(facingDirection.equals("down")) {
			yComponent += vM/10;
		}
		if(facingDirection.equals("left")) {
			if(Coordinates[lastIndexReached+1][0] - xCor <10) {
				xComponent += Coordinates[lastIndexReached+1][0] - xCor;
			}else {
			xComponent -= hM/10;//work here bext tine
			}
		}
		if(facingDirection.equals("right")) {
			if(Coordinates[lastIndexReached+1][0] - xCor <10) {
				xComponent += Coordinates[lastIndexReached+1][0] - xCor;
			}else {
			xComponent += hM/10;
			}
		}
		//		if(xCor < 200) {
		//			xComponent += hM/10;
		//			String FacingDirection = "right";
		//		}
		//		if(xCor >= 200 && xCor<205) {
		//			yComponent += vM/10;
		//			String FacingDirection = "down";
		//		}





	}

	public void followPoint(int[] point) {
		if(this.getX()<point[0]) {

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

//seeing player when facing up works, right works, left works
public class Guard extends Character {
	boolean staticGuard = true;
	int lastIndexReached;
	int IndexToReach;
	int index;
	int sightRadius = 128;
	double sightAngle = Math.PI/2;
	String facingDirection = "right";// "up" "down" "left" "right"


	String imageAddress = "";

	Guard(String imageFilePath){
		imageAddress = imageFilePath;
		setCharacterImage(imageAddress);
		lastIndexReached= 0;
		xComponent = 100;
		yComponent = 100;
	}
	public void setVision(int angleInRadians, int radius) {//angle is in radians
		sightAngle = angleInRadians;
		sightRadius = radius;
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
		//		IndexToReach = lastIndexReached+1;
		hM = 3;
		vM = 3;
		if(!staticGuard) {
			if(xComponent == Coordinates[lastIndexReached+1][0] && yComponent == Coordinates[lastIndexReached+1][1]) {
				if(lastIndexReached == Coordinates.length-2) {
					lastIndexReached = -1;
				} else {
					lastIndexReached++;
				}
			}
			if(Coordinates[lastIndexReached+1][0] == xComponent) {
				if(Coordinates[lastIndexReached+1][1] > yComponent) {
					facingDirection = "down" ;
				}
				if(Coordinates[lastIndexReached+1][1] < yComponent) {
					facingDirection = "up" ;
					System.out.println("this works");
				}
			}

			if(Coordinates[lastIndexReached+1][1] == yComponent) {
				if(Coordinates[lastIndexReached+1][0]< xComponent) {
					facingDirection = "left" ;
				}
				if(Coordinates[lastIndexReached+1][0]> xComponent) {
					facingDirection = "right" ;
				}
			}

			if(facingDirection.equals("up")) {
				if(yComponent - Coordinates[lastIndexReached+1][1] <10) {
					yComponent -=  yComponent - Coordinates[lastIndexReached+1][1];
				}else {
					yComponent -= vM/2;
				}
			}

			if(facingDirection.equals("down")) {
				if(Coordinates[lastIndexReached+1][1] - yComponent <10) {
					yComponent += Coordinates[lastIndexReached+1][1] - yComponent;
				}else {
					yComponent += vM/2;
				}

			}

			if(facingDirection.equals("left")) {
				if(xComponent - Coordinates[lastIndexReached+1][0] <10) {
					xComponent += Coordinates[lastIndexReached+1][0] - xComponent;
				}else {
					xComponent -= hM/2;
				}
			}

			if(facingDirection.equals("right")) {
				if(Coordinates[lastIndexReached+1][0] - xComponent <10) {
					xComponent += Coordinates[lastIndexReached+1][0] - xComponent;
				}else {
					xComponent += hM/2;
				}
			}
			System.out.println("facingDirection = " + facingDirection);
			System.out.println("lastIndexReached = " + lastIndexReached);
			System.out.println("characterpoint:("+xComponent+","+yComponent+")");
			System.out.println("CursorAngle:"+Math.toDegrees(cursorAngle));
			System.out.println("");


			//		if(xComponent < 200) {
			//			xComponent += hM/2;
			//			String FacingDirection = "right";
			//		}
			//		if(xComponent >= 200 && xComponent<205) {
			//			yComponent += vM/2;
			//			String FacingDirection = "down";
			//		}

		}

	}

	public boolean canHeSeeThis(int playerX, int playerY) {
		float angle;
		int xLength = playerX - xComponent;
		int yLength = playerY - yComponent;
		double distance = Math.sqrt(Math.pow(xLength, 2)+ Math.pow(yLength, 2));
		if(distance < sightRadius) {
			angle = (float)(Math.atan2(yLength, xLength));//this is in radians
			System.out.println("\nGuardX = "+ xComponent + "\nGuardY = " + yComponent);
			System.out.println("playerx = " + playerX + "\nplayerY = " + playerY);
			if(facingDirection.equals("right")) {
				if(angle<0) {
					angle*=-1;
				}
			}
			if(facingDirection.equals("up") || facingDirection.equals("down")) {

				if(angle<0) {
					angle*=-1;
				}
				if(playerY<yComponent) {
					angle-=Math.PI/2;
					if(angle<0) {
						angle*=-1;
					}
				}else {
					if(xComponent<playerX) {
						angle+=Math.PI/2;

					}else {
						angle = (float) (Math.PI * 1.5 - angle);
					}
				}
				if(facingDirection.equals("down")) {
					angle = (float) (Math.PI - angle);
				}
			}
			if(facingDirection.equals("left")) {
				if(playerY<yComponent) {
					angle = (float) (angle + Math.PI);
				}else {
					angle = (float) (Math.PI - angle);
				}

			}
			System.out.println("angle = " + (int)Math.toDegrees(angle));
			if(angle <sightAngle/2 ) {
				return true;
			}else {
				return false;
			}
		}
		return false;

	}

	public void setPath(int[][]points) {
		Coordinates = points;
		staticGuard = false;
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
		if(facingDirection.equals("left")) {
			return Math.PI;
		}else if(facingDirection.equals("up")) {
			return -Math.PI/2;
		}else if(facingDirection.equals("down")) {
			return Math.PI/2;
		}else {
			return 0;
		}
	}
	@Override
	public void setMovement(int dx, int dy) {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateHitbox() {
		// TODO Auto-generated method stub

	}
	@Override
	public void collisionReaction(Character otherCharacter, boolean informOther) {
		// TODO Auto-generated method stub
		
	}

}
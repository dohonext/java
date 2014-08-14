package MazeSolve;

public class PlayerDirection8 implements Player{

	private int[][] path = new int [50000][2];
	public int location_x = 1;
	public int location_y = 1;
	private int stackCount = 0;
	private int pathCount = 0;
	public int direction = selectDirection();
	
	@Override
	public void start() {
			if(checkN() == false && checkNE() == false && checkE() == false && checkES() == false
					&& checkS() == false && checkSW() == false && checkW() == false	&& checkWN() == false){
				goBack();
				pathCount++;
			} else{
				direction = selectDirection();
				if(checkPath(direction) == true){
					go(direction);
					pathCount++;
				}
			}
	}


	@Override
	public int selectDirection() {
		return (int) (Math.random()*8);
	}

	@Override
	public boolean checkPath(int direction) {
		switch(direction) {
			case 0 : return checkN(); 
			case 1 : return checkNE();
			case 2 : return checkE();
			case 3 : return checkES();
			case 4 : return checkS();
			case 5 : return checkSW();
			case 6 : return checkW();
			case 7 : return checkWN();
			default: break;
		}
		return false;
	}

	@Override
	public boolean checkCommon(int x, int y) {
		if(Maze.getInstance().getMap(x,y) == 0){
			return true;	
		}else{
			return false;
		}
	}
	
	@Override
	public boolean checkN() {
		return(checkCommon(location_x - 1, location_y));
	}
	
	@Override
	public boolean checkNE() {
		return(checkCommon(location_x - 1, location_y + 1));
	}
	
	@Override
	public boolean checkE() {
		return(checkCommon(location_x, location_y + 1));
	}
	
	@Override
	public boolean checkES() {
		return(checkCommon(location_x + 1, location_y + 1));
	}

	@Override
	public boolean checkS() {
		return(checkCommon(location_x + 1, location_y));
	}

	@Override
	public boolean checkSW() {
		return(checkCommon(location_x + 1, location_y - 1));
	}

	@Override
	public boolean checkW() {
		return(checkCommon(location_x, location_y - 1));
	}

	@Override
	public boolean checkWN() {
		return(checkCommon(location_x - 1, location_y - 1));
	}
	
	@Override
	public void go(int direction) {
		stackCount++;
		switch(direction){
			case 0: Maze.getInstance().alreadyWent(location_x,location_y);
					this.location_x--; 
					path[stackCount][0] = this.location_x;
					path[stackCount][1] = this.location_y;
					Maze.getInstance().cursor(location_x,location_y);
					break;
			case 1: Maze.getInstance().alreadyWent(location_x,location_y);
					this.location_x--;
					this.location_y++;
					path[stackCount][0] = this.location_x;
					path[stackCount][1] = this.location_y;
					Maze.getInstance().cursor(location_x,location_y);
					break;
			case 2: Maze.getInstance().alreadyWent(location_x,location_y);
					this.location_y++;
					path[stackCount][0] = this.location_x;
					path[stackCount][1] = this.location_y;
					Maze.getInstance().cursor(location_x,location_y);
					break;
			case 3: Maze.getInstance().alreadyWent(location_x,location_y);
					this.location_x++;
					this.location_y++;
					path[stackCount][0] = this.location_x;
					path[stackCount][1] = this.location_y;
					Maze.getInstance().cursor(location_x,location_y);
					break;
			case 4: Maze.getInstance().alreadyWent(location_x,location_y);
					this.location_x++;
					path[stackCount][0] = this.location_x;
					path[stackCount][1] = this.location_y;
					Maze.getInstance().cursor(location_x,location_y);
					break;
			case 5: Maze.getInstance().alreadyWent(location_x,location_y);
					this.location_x++;
					this.location_y--;
					path[stackCount][0] = this.location_x;
					path[stackCount][1] = this.location_y;
					Maze.getInstance().cursor(location_x,location_y);
					break;
			case 6: Maze.getInstance().alreadyWent(location_x,location_y);
					this.location_y--;
					path[stackCount][0] = this.location_x;
					path[stackCount][1] = this.location_y;
					Maze.getInstance().cursor(location_x,location_y);
					break;
			case 7: Maze.getInstance().alreadyWent(location_x,location_y);
					this.location_x--;
					this.location_y--;
					path[stackCount][0] = this.location_x;
					path[stackCount][1] = this.location_y;
					Maze.getInstance().cursor(location_x,location_y);
					break;
			default: break;
		}
	}

	@Override
	public void goBack() {
		Maze.getInstance().alreadyWent(location_x,location_y);
		path[stackCount][0] = 0;
		path[stackCount][1] = 0;
		stackCount--;
		location_x = path[stackCount][0];
		location_y = path[stackCount][1];
		Maze.getInstance().cursor(location_x,location_y);
		try {
		    Thread.sleep(100);                 
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}

	@Override
	public void showPathCount() {
		System.out.println(this.pathCount);
	}
}

package MazeSolve;

public class Maze {
	public int[][] map = new int[][]{
		{9,9,9,9,9,9,9,9,9,9},
		{9,0,9,9,9,0,9,9,9,9},
		{9,0,0,0,9,0,0,0,0,9},
		{9,9,9,0,0,0,9,0,9,9},
		{9,9,9,0,9,9,9,0,9,9},
		{9,9,0,0,9,0,0,0,0,9},
		{9,0,9,9,9,0,9,9,9,9},
		{9,9,0,9,9,0,0,0,0,9},
		{9,0,9,9,0,9,9,9,0,9},
		{9,9,9,9,9,9,9,9,9,9}
	};
	
	private static Maze instance = new Maze();
	private Maze(){}
	public static Maze getInstance(){
		if (instance == null){
			instance = new Maze();
		}
		return instance;
	}
	
	public int getMap(int x, int y){
		return this.map[x][y];
	}
	public void cursor(int x, int y){
		this.map[x][y] = 1;
	}
	public void alreadyWent(int x, int y){
		this.map[x][y] = 2;
	}
	public void goBack(int x, int y){
		this.map[x][y] = 0;
	}
	public void showMaze(){
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(map[i][j] == 9){
					System.out.print("█");
				} else if(map[i][j] == 0 || map[i][j] == 2){
					System.out.print(" ");
				} else{
					System.out.print("©");
				}
			}
			System.out.println();
		}
	}
	
	
}

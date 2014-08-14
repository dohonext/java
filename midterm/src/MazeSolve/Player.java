package MazeSolve;

public interface Player {
	public abstract void start();
	
	public int selectDirection();
	public boolean checkPath(int direction);
	public boolean checkCommon(int x, int y);
	public boolean checkN();
	public boolean checkNE();
	public boolean checkE();
	public boolean checkES();
	public boolean checkS();
	public boolean checkSW();
	public boolean checkW();
	public boolean checkWN();
	
	public void go(int direction);
	public void goBack();
	public void showPathCount();
}

package homework3;

public class Player {

	public GameLevel realLevel = GameLevel1.getInstance();
	public int showLevel = 1;
	public String name;
	
	public Player() {	
		new Player("no name");
	}
	
	public Player(String name) {
		this.name = name;
	}

	public void upgradeLevel(){
		this.showLevel ++;
		this.realLevel = this.realLevel.levelUp();
	}
	
	public int getGameLevel(){
		return this.showLevel;
	}
	
	public void attack(){
		this.realLevel.play();
	}
	
}

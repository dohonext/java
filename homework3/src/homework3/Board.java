package homework3;

public class Board {

	public static void main(String[] args) {
		Player p = new Player();
		
		for(int i = 0; i < 3; i++){
			p.attack();
			p.upgradeLevel();
		}
		
	}

}

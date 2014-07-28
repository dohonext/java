package template;

public class TestDisplay {

	public static void main(String[] args) {
		AbstractDisplay db = new CharacterDisplay('H');
		db.display();
	}

}

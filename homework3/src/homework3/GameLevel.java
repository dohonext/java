package homework3;

public abstract class GameLevel {

	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	public abstract GameLevel levelUp();
	
	public final void play(){
		simpleAttack();
		turnAttack();
		flyingAttack();
	}
	
}

class GameLevel1 extends GameLevel {

	private static GameLevel1 level1 = new GameLevel1();
	private GameLevel1(){}
	
	public static GameLevel1 getInstance(){
		if (level1 == null){
			level1 = new GameLevel1();
		}
		return level1;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("============Level 1 start============");
		System.out.println("메롱~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("못하지롱");
	}

	@Override
	public void flyingAttack() {
		System.out.println("이것도 못하지롱");
		System.out.println("============Level 1 end==============");
		System.out.println();
	}
	
	public GameLevel levelUp(){
		return GameLevel2.getInstance();
	}
}

class GameLevel2 extends GameLevel {

	private static GameLevel2 level2 = new GameLevel2();
	private GameLevel2(){}
	
	public static GameLevel2 getInstance(){
		System.out.println("============Level 2 start============");
		if (level2 == null){
			level2 = new GameLevel2();
		}
		return level2;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("메롱~메롱~");
	}

	@Override
	public void turnAttack() {
		System.out.println("돌려차기 쓍~~~");
	}

	@Override
	public void flyingAttack() {
		System.out.println("이건 못하지롱");
		System.out.println("============Level 2 end==============");
		System.out.println();
	}
	
	public GameLevel levelUp(){
		return GameLevel3.getInstance();
	}
}

class GameLevel3 extends GameLevel {

	private static GameLevel3 level3 = new GameLevel3();
	private GameLevel3(){}
	
	public static GameLevel3 getInstance(){
		if (level3 == null){
			level3 = new GameLevel3();
		}
		return level3;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("============Level 3 start============");
		System.out.println("메롱~ 메롱~ 메롱~");
	}

	@Override
	public void turnAttack() {
		System.out.println("뒤돌려차기 앞돌려차기");
	}

	@Override
	public void flyingAttack() {
		System.out.println("날라차기 휙~~");
		System.out.println("============Level 3 end==============");
		System.out.println();
	}
	
	public GameLevel levelUp(){
		System.out.println("level 3 is the full level.");
		return GameLevel3.getInstance();
	}
}
package template;

public abstract class AbstractDisplay {

	public abstract void start();
	public abstract void print();
	public abstract void end();
	
	public final void display(){
		start();
		for(int i=0; i<5; i++){
			print();
		}
		end();
	}
}

class CharacterDisplay extends AbstractDisplay {
	char character;
	
	public CharacterDisplay(char character){
		this.character = character;
	}
	
	@Override
	public void start() {
		System.out.print("<");
		
	}

	@Override
	public void print() {
		System.out.print(character);
		
	}

	@Override
	public void end() {
		System.out.print(">");
		
	}
	
}
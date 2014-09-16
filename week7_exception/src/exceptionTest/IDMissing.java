package exceptionTest;

public class IDMissing extends Exception {
	
	String message;
	
	public IDMissing(String message){
		super(message);
	}
}

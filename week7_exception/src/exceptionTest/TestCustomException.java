package exceptionTest;

public class TestCustomException {

	public void getID() throws IDMissing{
		//.......
		throw new IDMissing("홍길동 id missing");
	}
	
	
	public static void main(String[] args) {
		
		TestCustomException test = new TestCustomException();
		try {
			test.getID();
		} catch (IDMissing e) {
			System.out.println(e.getMessage());
		}

	}

}

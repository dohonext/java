package exceptionTest;

public class exceptionTest {

	public static void main(String[] args) {
		int i=0;
		String greetings[] = {"Hello, World", "No, I mean it", "HELLO WORLD"};
		
		while(i<4){
			try{
				System.out.println(greetings[i]);
				i++;
			}catch(Exception e){
				System.out.println(e);
				System.out.println(e.getMessage());
				i++;
				return;
			}finally{
				System.out.println("always printed");
				
			}
		}
	}

}

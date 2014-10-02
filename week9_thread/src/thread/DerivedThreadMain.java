package thread;

public class DerivedThreadMain {

	public static void main(String[] args) {
		System.out.println("main start");
		DerivedThread dt1 = new DerivedThread();
		
		Thread t1 = new Thread(dt1);
		Thread t2 = new Thread(dt1);
		
		t1.start();
		t2.start();
		System.out.println("main end");
	}

}

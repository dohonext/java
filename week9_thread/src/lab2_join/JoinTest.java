package lab2_join;

public class JoinTest extends Thread {
	
	private int first;
	private int last;
	public int sum;
	
	public JoinTest(int first, int last){
		this.first = first;
		this.last = last;
	}
	
	public void run(){
		for(int i= first; i<=last; i++){
			sum += i;
		}
	}

	public static void main(String[] args) {
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();   //this(메인스레드)가 jt1을 기다리고 있으라는 명령. 
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int total = jt1.sum + jt2.sum;
		
		System.out.println("total = " + total);
		System.out.println("jt1.sum = " + jt1.sum);
		System.out.println("jt2.sum = " + jt2.sum);
		
	}

}

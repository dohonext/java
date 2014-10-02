package thread;

import java.awt.Frame;

//public class DerivedThread extends Thread{
//
//	public void run(){
//		int i;
//		for(i=0; i<200; i++){
//			System.out.print(i + "\t");
//		}
//	}
//}

public class DerivedThread extends Frame implements Runnable{  // 다중상속이 안되므로 뭔가를 상속받고 쓰레드로도 만들땐 인터페이스 이용. 

	public void run(){
		int i;
		for(i=0; i<200; i++){
			System.out.print(i + "\t");
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
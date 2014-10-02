package lab3_terminateThread;

import java.io.IOException;

public class terminateThreadMain {

	public static void main(String[] args) throws IOException {
		sleepThread st1 = new sleepThread();
		sleepThread st2 = new sleepThread();
		sleepThread st3 = new sleepThread();
		
		st1.setName("A");
		st2.setName("B");
		st3.setName("C");
		st1.start();
		st2.start();
		st3.start();

		System.out.println("A,B,C,M 중 종료할 작업을 입력하세요");
		
		int i;
		while(true){
			i = System.in.read();
			if( i == 'A'){
				st1.setFlag(true);
			}else if ( i == 'B'){
				st2.setFlag(true);
			}else if ( i == 'C'){
				st3.setFlag(true);
			}else if ( i == 'M'){
				st1.setFlag(true);
				st2.setFlag(true);
				st3.setFlag(true);
				break;
			}
		}
				
	}

}

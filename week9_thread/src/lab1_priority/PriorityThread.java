package lab1_priority;

public class PriorityThread extends Thread {
	public void run(){
		System.out.println("우선순위" + this.getPriority() + ":" + this.getName() + "start");
		int i = 0;
		while(i < 10000){
			i += 1;
			
			try {
				sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("우선순위" + this.getPriority() + ":" + this.getName() + "end");
		}
	}
}



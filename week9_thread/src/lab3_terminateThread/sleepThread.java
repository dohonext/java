package lab3_terminateThread;

public class sleepThread extends Thread{
	private boolean flag = false;
	
	public void run(){
		
		while(!flag){
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("terminate : " + this.getName());
	}
	public void setFlag(boolean a){
		this.flag = a;
	}
	
}

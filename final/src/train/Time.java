package train;

public class Time extends Thread{
	public final static int MINUTE = 1000;
	int count = 0 ; 
	public void run()
	{
		while(true)
		{
			System.out.println("Now Time :" + count++ + "Minute");
			try {
				Thread.sleep(MINUTE);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
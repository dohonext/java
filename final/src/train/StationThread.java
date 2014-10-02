package train;

public class StationThread extends Thread{
	TicketBox tb;
	public StationThread(TicketBox tb){
		this.tb = tb;
	}
	
	public void run()
	{
		while(true)
		{
			tb.ticketingStart();
			if(TrainMain.finalQueue.size() >= 50)
				break;
		}
	}
}
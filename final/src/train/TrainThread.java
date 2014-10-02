package train;

import java.util.Queue;

public class TrainThread extends Thread{
	public Queue<Customer> platformQueue;
	private int trainStartTime = 0;
	private TicketBox tb;
	
	public TrainThread(TicketBox tb)
	{
		this.tb = tb;
		this.platformQueue = tb.platformQueue;
	}
	
	public synchronized void trainStart()
	{
		while(!platformQueue.isEmpty())
		{
			Customer inTrainClient = platformQueue.poll();
			int a = tb.goingTo(inTrainClient.getArrivalStation());
			inTrainClient.setTrainStartTime(""+trainStartTime);
			inTrainClient.setTrainArrivalTime(""+ (a + trainStartTime));
			inTrainClient.setWaitingForTicketingTime(""+ (Integer.parseInt(inTrainClient.getTrainArrivalTime()) - (Integer.parseInt(inTrainClient.getTrainArrivalTime()) + tb.goingTo(inTrainClient.getArrivalStation()))));
			TrainMain.finalQueue.add(inTrainClient);
			System.out.println(TrainMain.finalQueue.toString());
		}
		
		trainStartTime += 3;
		
	}
	
	public synchronized void  run()
	{
		while(true)
		{
			try{
				trainStart();
				Thread.sleep(3000);
			}catch(Exception e){};
			if(TrainMain.finalQueue.size() >= 50)
				break;
			
		}
	}
}
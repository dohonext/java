package train;

import java.util.Queue;

public abstract class TicketBox implements AlgorithmPolicy{
	public String stationName;
	public Queue<Customer> platformQueue;
	public Queue<Customer> waitTicketingQueue;
	
	TicketAgent ticketAgent1 = new TicketAgent();
	TicketAgent ticketAgent2 = new TicketAgent();
	TicketAgent ticketAgent3 = new TicketAgent();
	
	
	Customer CustomerOnTicketing1 = new Customer();
	Customer CustomerOnTicketing2 = new Customer();
	Customer CustomerOnTicketing3 = new Customer();
	
	public void ticketingStart()
	{	
		if(!ticketAgent1.getNowOnTicketing())
		{
			if(!waitTicketingQueue.isEmpty()){
				CustomerOnTicketing1 = waitTicketingQueue.poll();
				ticketAgent1.newCustomer(CustomerOnTicketing1);
				Thread th1 = new Thread(ticketAgent1);
				th1.start();
			}
		}
		
		if(!ticketAgent2.getNowOnTicketing())
		{
			if(!waitTicketingQueue.isEmpty()){
				CustomerOnTicketing2 = waitTicketingQueue.poll();
				ticketAgent2.newCustomer(CustomerOnTicketing2);
				Thread th2 = new Thread(ticketAgent2);
				th2.start();
			}
		}
		
		if(!ticketAgent3.getNowOnTicketing())
		{
			if(!waitTicketingQueue.isEmpty()){
				CustomerOnTicketing3 = waitTicketingQueue.poll();
				ticketAgent3.newCustomer(CustomerOnTicketing3);
				Thread th3 = new Thread(ticketAgent3);
				th3.start();
			}
		}
		
		try{
			if(CustomerOnTicketing1.isHasTicket())
			{
				platformQueue.add(CustomerOnTicketing1);
				CustomerOnTicketing1.setHasTicket(false);
				System.out.println(CustomerOnTicketing1.getName()+ "is on platform");
			}
			
			if(CustomerOnTicketing2.isHasTicket())
			{
				platformQueue.add(CustomerOnTicketing2);
				CustomerOnTicketing2.setHasTicket(false);
				System.out.println(CustomerOnTicketing2.getName()+ "is on platform");
			}
			
			if(CustomerOnTicketing3.isHasTicket())
			{
				platformQueue.add(CustomerOnTicketing3);
				CustomerOnTicketing3.setHasTicket(false);
				System.out.println(CustomerOnTicketing3.getName()+ "is on platform");
			}
		}catch(Exception e){};
	}
}

class TicketAgent extends Thread {
	private boolean nowOnTicketing;
	public Customer customerOnTicketing;
	
	public TicketAgent(){};
	public void newCustomer(Customer customer){
		if(customer != null) {
			customerOnTicketing = customer;
		} else {
			return;
		}
	}
	
	public boolean getNowOnTicketing(){
		return nowOnTicketing;
	}

	public synchronized void run(){
		nowOnTicketing = true;
		int customerTicketingTime = Integer.parseInt(customerOnTicketing.getTicketingTime());
		try {
			Thread.sleep(customerTicketingTime * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ticketing for "+ customerOnTicketing.getName() +"is complete.");
		//Todo queToPlatform ;;;
		nowOnTicketing = false;
	}
}

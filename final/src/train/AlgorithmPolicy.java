package train;

import java.util.LinkedList;

public interface AlgorithmPolicy {
	public int goingTo(String StationName);
}

class AsanStation extends TicketBox implements AlgorithmPolicy{
	public AsanStation(){                                                                                                                                                                                                                                                 
		this.stationName = "Asan";
		this.platformQueue = new LinkedList<Customer>();
		this.waitTicketingQueue = new LinkedList<Customer>();
	}

	@Override
	public int goingTo(String StationName) {
		
		if (StationName.equals("Chuncheon"))
		{
			return 36;
		}
		else if(StationName.equals("Daejeon"))
		{
			return 35;
		}
		else if(StationName.equals("Gwangju"))
		{
			return 25;
		}
		else if (StationName.equals("Gyeongju"))
		{
			return 43;
		}
		else if (StationName.equals("Seoul"))
		{
			return 20;
		}
		else if (StationName.equals("Wonju"))
		{
			return 42;
		}
		else 
			return 0;
	}
}

class ChuncheonStation extends TicketBox implements AlgorithmPolicy{
	public ChuncheonStation(){                                                                                                                                                                                                                                                 
		this.stationName = "Chuncheon";
		this.platformQueue = new LinkedList<Customer>();
		this.waitTicketingQueue = new LinkedList<Customer>();
	}
	
public int goingTo(String StationName) {
		
		if (StationName.equals("Asan"))
		{
			return 36;
		}
		else if(StationName.equals("Daejeon"))
		{
			return 45;
		}
		else if(StationName.equals("Gwangju"))
		{
			return 49;
		}
		else if (StationName.equals("Gyeongju"))
		{
			return 31;
		}
		else if (StationName.equals("Seoul"))
		{
			return 16;
		}
		else if (StationName.equals("Wonju"))
		{
			return 28;
		}
		else 
			return 0;
	}
}

class DaejeonStation extends TicketBox implements AlgorithmPolicy{
	public DaejeonStation(){                                                                                                                                                                                                                                                 
		this.stationName = "Daejeon";
		this.platformQueue = new LinkedList<Customer>();
		this.waitTicketingQueue = new LinkedList<Customer>();
	}
	
public int goingTo(String StationName) {
		
		if (StationName.equals("Chuncheon"))
		{
			return 45;
		}
		else if(StationName.equals("Asan"))
		{
			return 35;
		}
		else if(StationName.equals("Gwangju"))
		{
			return 12;
		}
		else if (StationName.equals("Gyeongju"))
		{
			return 15;
		}
		else if (StationName.equals("Seoul"))
		{
			return 29;
		}
		else if (StationName.equals("Wonju"))
		{
			return 23;
		}
		else 
			return 0;
	}
}

class GwangjuStation extends TicketBox implements AlgorithmPolicy{
	public GwangjuStation(){                                                                                                                                                                                                                                                 
		this.stationName = "Gwangju";
		this.platformQueue = new LinkedList<Customer>();
		this.waitTicketingQueue = new LinkedList<Customer>();
	}
	
public int goingTo(String StationName) {
		
		if (StationName.equals("Chuncheon"))
		{
			return 49;
		}
		else if(StationName.equals("Daejeon"))
		{
			return 12;
		}
		else if(StationName.equals("Asan"))
		{
			return 25;
		}
		else if (StationName.equals("Gyeongju"))
		{
			return 18;
		}
		else if (StationName.equals("Seoul"))
		{
			return 41;
		}
		else if (StationName.equals("Wonju"))
		{
			return 35;
		}
		else 
			return 0;
	}	
}

class GyeongjuStation extends TicketBox implements AlgorithmPolicy{
	public GyeongjuStation(){                                                                                                                                                                                                                                                 
		this.stationName = "Gyeongju";
		this.platformQueue = new LinkedList<Customer>();
		this.waitTicketingQueue = new LinkedList<Customer>();
	}
	
public int goingTo(String StationName) {
		
		if (StationName.equals("Chuncheon"))
		{
			return 31;
		}
		else if(StationName.equals("Daejeon"))
		{
			return 15;
		}
		else if(StationName.equals("Gwangju"))
		{
			return 18;
		}
		else if (StationName.equals("Asan"))
		{
			return 43;
		}
		else if (StationName.equals("Seoul"))
		{
			return 47;
		}
		else if (StationName.equals("Wonju"))
		{
			return 32;
		}
		else 
			return 0;
	}
}

class SeoulStation extends TicketBox implements AlgorithmPolicy{
	public SeoulStation(){
		this.stationName = "Seoul";
		this.platformQueue = new LinkedList<Customer>();
		this.waitTicketingQueue = new LinkedList<Customer>();
	}
	
public int goingTo(String StationName) {
		
		if (StationName.equals("Chuncheon"))
		{
			return 16;
		}
		else if(StationName.equals("Daejeon"))
		{
			return 29;
		}
		else if(StationName.equals("Gwangju"))
		{
			return 41;
		}
		else if (StationName.equals("Gyeongju"))
		{
			return 47;
		}
		else if (StationName.equals("Asan"))
		{
			return 20;
		}
		else if (StationName.equals("Wonju"))
		{
			return 22;
		}
		else 
			return 0;
	}
}

class WonjuStation extends TicketBox implements AlgorithmPolicy{
	public WonjuStation(){                                                                                                                                                                                                                                                 
		this.stationName = "Wonju";
		this.platformQueue = new LinkedList<Customer>();
		this.waitTicketingQueue = new LinkedList<Customer>();
	}
	
	
public int goingTo(String StationName) {
		
		if (StationName.equals("Chuncheon"))
		{
			return 28;
		}
		else if(StationName.equals("Daejeon"))
		{
			return 23;
		}
		else if(StationName.equals("Gwangju"))
		{
			return 35;
		}
		else if (StationName.equals("Gyeongju"))
		{
			return 32;
		}
		else if (StationName.equals("Seoul"))
		{
			return 22;
		}
		else if (StationName.equals("Asan"))
		{
			return 42;
		}
		else 
			return 0;
	}
}
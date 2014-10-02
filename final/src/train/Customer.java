package train;

public class Customer {
	private String id;
	private String name;
	private String stationReachTime;
	private String ticketingTime;
	private String departureStation;
	private String arrivalStation;
	private String waitingForTicketingTime;
	private boolean HasTicket;
	private String trainStartTime;
	private String trainArrivalTime;

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStationReachTime() {
		return stationReachTime;
	}


	public void setStationReachTime(String stationReachTime) {
		this.stationReachTime = stationReachTime;
	}


	public String getTicketingTime() {
		return ticketingTime;
	}


	public void setTicketingTime(String ticketingTime) {
		this.ticketingTime = ticketingTime;
	}


	public String getDepartureStation() {
		return departureStation;
	}


	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}


	public String getArrivalStation() {
		return arrivalStation;
	}


	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}


	public String getWaitingForTicketingTime() {
		return waitingForTicketingTime;
	}


	public void setWaitingForTicketingTime(String waitingForTicketingTime) {
		this.waitingForTicketingTime = waitingForTicketingTime;
	}


	public boolean isHasTicket() {
		return HasTicket;
	}


	public void setHasTicket(boolean hasTicket) {
		HasTicket = hasTicket;
	}


	public String getTrainStartTime() {
		return trainStartTime;
	}


	public void setTrainStartTime(String trainStartTime) {
		this.trainStartTime = trainStartTime;
	}


	public String getTrainArrivalTime() {
		return trainArrivalTime;
	}


	public void setTrainArrivalTime(String trainArrivalTime) {
		this.trainArrivalTime = trainArrivalTime;
	}


	@Override
	public String toString() {
		return "Client [ID=" + id + ", Name=" + name
				+ ", stationReachTime=" + stationReachTime + ", TicketingTime="
				+ ticketingTime + ", departureStation=" + departureStation
				+ ", ArrivalStaion=" + arrivalStation + ", WaitingForTicketingTime="
				+ waitingForTicketingTime + ", HasTicket=" + HasTicket
				+ ", trainStartTime=" + trainStartTime + ", trainArrivalTime="
				+ trainArrivalTime + "]";
	}
	
	
	
}
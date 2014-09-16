package train;

import java.util.ArrayList;

public class Customer {
	private int id;
	private String name;
	private int stationReachTime;
	private int ticketingTime;
	private String departureStation;
	private String arrivalStation;
	private int waitingForTicketTime;
	private int waitingForTrainTime;
	
	public Customer(int id, String name, int stationReachTime, int ticketingTime, 
					String departureStation, String arrivalStation) {
		this.id = id;
		this.name = name;
		this.stationReachTime = stationReachTime;
		this.ticketingTime = ticketingTime;
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
	}
	
	public Customer(ArrayList<String> customerInfo) {
		this(
			Integer.parseInt(customerInfo.get(0)),
			customerInfo.get(1),
			Integer.parseInt(customerInfo.get(2)),
			Integer.parseInt(customerInfo.get(3)),
			customerInfo.get(4),
			customerInfo.get(5)
		);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStationReachTime() {
		return stationReachTime;
	}
	public void setStationReachTime(int stationReachTime) {
		this.stationReachTime = stationReachTime;
	}
	public int getTicketingTime() {
		return ticketingTime;
	}
	public void setTicketingTime(int ticketingTime) {
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
	public int getWaitingForTicketTime() {
		return waitingForTicketTime;
	}
	public void setWaitingForTicketTime(int waitingForTicketTime) {
		this.waitingForTicketTime = waitingForTicketTime;
	}
	public int getWaitingForTrainTime() {
		return waitingForTrainTime;
	}
	public void setWaitingForTrainTime(int waitingForTrainTime) {
		this.waitingForTrainTime = waitingForTrainTime;
	}
	
}

package homework2;


public class CarCompany {
	
	private String CompanyName = "Hyundai";
	private static CarCompany instance = new CarCompany();
	private CarCompany(){}
	
	public static CarCompany getInstance(){
		if (instance == null){
			instance = new CarCompany();
		}
		return instance;
	}
	
	public String getCompanyName(){
		return CompanyName;
	}
}

class Car{
	protected String carCompanyName;
	protected String carName;
	protected int carPrice;
	
	public Car(){
		this("No name", 0);
	}
	
	public Car(String carName, int carPrice){
		this.carName = carName;
		this.carPrice = carPrice;
		this.carCompanyName = CarCompany.getInstance().getCompanyName();
	}
	
	public String getCarName(){
		return this.carName;
	}
	
	public int getCarPrice(){
		return this.carPrice;
	}
	
	public String getCarCompanyName(){
		return this.carCompanyName;
	}
}

class Sonata extends Car{

	public static int carNum = 0;
	
	public Sonata(){
		super("Sonata", 3000);
		carNum++;
	}
}

class Grandeur extends Car{

	public static int carNum = 0;
	
	public Grandeur(){
		super("Grandeur", 4000);
		carNum++;
	}
}

class Genesis extends Car{

	public static int carNum = 0;
	
	public Genesis(){
		super("Genesis", 5000);
		carNum++;
	}
}


class Calculator {
	public int priceSum;
	
	public Calculator(){
	}
	
	public void CalculatePriceSum(int carPrice[]){
		for (int i=0; i < carPrice.length; i++){
			this.priceSum = this.priceSum + carPrice[i];
		}
		System.out.println("Sum of price of all cars is : " + this.priceSum + "Man Won." );
	}
	
}

package singletonPattern;

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

class 
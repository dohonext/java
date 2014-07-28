package hyundai;

public class Avante extends HyundaiCar{
	
	@Override
	public void start(){
		System.out.println("avanteStart");
	}
	
	@Override
	public void drive(){
		System.out.println("avanteDrive");
	}
	
	@Override
	public void stop(){
		System.out.println("avanteStop");
	}
	
	@Override
	public void turnOff(){
		System.out.println("avanteTurnOff");
	}
	
}

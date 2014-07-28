package hyundai;

public class Sonata extends HyundaiCar{

	@Override   // 이건 안써도 되긴 함
	public void start(){
		System.out.println("sonataStart");
	}
	
	@Override
	public void drive(){
		System.out.println("sonataDrive");
	}
	
	@Override
	public void stop(){
		System.out.println("sonataStop");
	}
	
	@Override
	public void turnOff(){
		System.out.println("sonataTurnOff");
	}

	
	
}

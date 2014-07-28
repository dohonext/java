package hyundai;

public abstract class HyundaiCar {

	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	public final void go(){
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}
	public void washCar(){
		System.out.println("wash car");
	}
}

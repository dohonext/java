package hyundai;

public class CarTest {

	public static void main(String[] args) {
		
		CarTest test = new CarTest();
		test.testCar(new Sonata());
		test.testCar(new Avante());
		

	}

	public void testCar (HyundaiCar car){
		car.go();
	}
}

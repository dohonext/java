package homework2;

public class CarMain {

	public static void main(String[] args) {
		//가격 private으로 해서 getter 이용할것
		//Car라는 상위 클래스 상속할것
		//자동차 값을 계산하는거 Calculator 클래스로 따로 만들어서 계산하기. (main에서 불러다 쓰기)
		//클래스 6개 (회사 - singleton)
		int carPrice[] = new int[100];	
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		Grandeur g1 = new Grandeur();
		Grandeur g2 = new Grandeur();
		Genesis n1 = new Genesis();
		
		carPrice[0] = s1.getCarPrice();
		carPrice[1] = s2.getCarPrice();
		carPrice[2] = s3.getCarPrice();
		carPrice[3] = g1.getCarPrice();
		carPrice[4] = g2.getCarPrice();
		carPrice[5] = n1.getCarPrice();
		
		System.out.println(g2.getCarCompanyName()); // 각 인스턴스에 제품 특성이 부과되었는지 
		System.out.println(g2.getCarName()); 
		
		Calculator c = new Calculator();
		c.CalculatePriceSum(carPrice);
	}

}

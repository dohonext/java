package inheritance;

public class EmployeeMain {

	public static void main(String[] args) {
		Manager m = new Manager("James", 1000.0);
		System.out.println(m.getDetails());  // Manager 클래스의 메소드를 overriding 해서 불러옴( Employee 클래스에도 같은 이름의 메소드가 있지만..)
		
		Employee em = new Manager("James", 1000.0); // 업캐스팅(assign)했을때는?
		System.out.println(m.getDetails());
		//m.name = "이승기";
		//System.out.println(m.name);
		
	}

}

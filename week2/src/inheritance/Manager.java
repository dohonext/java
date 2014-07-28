package inheritance;

public class Manager extends Employee{
	public String department;
	
	public Manager(){
		//super(); //컴파일러가 자동으로 불러줌. this가 나 super는 parent.  
		System.out.println("Manager() called");
	}
	
	public Manager(String name, double salary){
		super(name, salary);
		department = "Personal";
	}
	
	public String getDetails(){             //super에 있는 이름 그대로 하지만 overriding(재정의)하는것임. 
		return name + "," + salary + "," + department;
	}
	
	public String getdetails2(){       // super의 겟디테일을 쓰고 싶을땐 하위 클래스에서 새로 하나 만들어서 수퍼껄 불러주면 된다 
		return super.getDetails();
	}
}

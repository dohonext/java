package inheritance;

import java.util.Date;

public class Employee {
	public String name;
	public double salary;
	public Date birthday;
	
	public Employee(){
		System.out.println("Employee() called");
	}
	
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
		this.birthday = new Date(1995, 7, 18);
	}
	
	public String getDetails(){
		return name + "," + salary;
	}
}

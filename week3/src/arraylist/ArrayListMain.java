package arraylist;

import java.util.ArrayList;

class Employee {
	public String name;
	public int age;
}

class Manager extends Employee {
	public String department = "총무부";
	
	public void showDep(){
		System.out.println(department);
	}
}

class Secretary extends Employee {
	public String boss = "Kim";
	
	public void showBoss(){
		System.out.println(boss);
	}
}



public class ArrayListMain {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		Secretary s1 = new Secretary();
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(m1);
		list.add(m2);
		list.add(s1);
		
		for(int i=0; i<3; i++){
			Employee e = list.get(i);
			if (e instanceof Manager){
				Manager m = (Manager)e;
				m.showDep();
			}
			else if (e instanceof Secretary){
				Secretary s = (Secretary)e;
				s.showBoss();
			}
			else{
				System.out.println("타입 에러!");
			}
		}
		
		
		
	}

}

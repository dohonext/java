package myfirst;

public class Person {
	String name;
	int age;
	boolean isMarried;
	int howManyChild;
	
	Person(){  // 생성자에 아무것도 입력 안했을시 아래 string int 받는 생성자 오버로딩해서 이름없음이랑 나이 1로 입력하게끔 할때 this 
		this("no name", 1);
	}
	
	Person(String name, int age){   // 그것을 아래 4개 받는 생성자로 재 
		//this.name = name;
		//this.age = age;
		this(name, age, false, 0);
	}
	
	Person(String name, int age, boolean isMarried, int howManyChild){
		this.name = name;
		this.age = age;
		this.isMarried = isMarried;
		this.howManyChild = howManyChild;
	}
	
	public Person getPerson(){
		return this;
	}
}

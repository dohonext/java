package myfirst;

public class Dogmain {

	public static void main(String[] args) {
		int i = 100;
		
		//Dog dog = new Dog("뽀삐", "");
		//Dog dog = new Dog();와와
		//dog.name = "똥개";
		//dog.type = "푸들";
		
		
		//System.out.println(dog.name);
		//System.out.println(dog.type);

		//System.out.println(dog);
		
		Person p = new Person();
		System.out.println(p.name +","+ p.age);
		
		
		Man man = new Man("James", 40);
		man.isMarried = true;
		man.howManyChild = 3;
		
		System.out.println(man.age);
		System.out.println(man.name);
		System.out.println(man.isMarried);
		System.out.println(man.howManyChild);
		
	}

}

package interfacetest2;

import java.sql.Date;
import java.util.HashSet;

interface IFork{
	void dig();
}

interface ITank{
	void shoot();
}

abstract class AutoCar{
	abstract void drive();
}

class MyCar extends AutoCar implements IFork, ITank{

	@Override
	public void shoot() {
		System.out.println("shoot");
		
	}

	@Override
	public void dig() {
		System.out.println("dig");
		
	}

	@Override
	void drive() {
		System.out.println("drive");
	}
		
	void soundHorn() {
		System.out.println("soundhorn");
	}
	
}

public class MyCarMain {

	public static void main(String[] args) {
		MyCar myCar = new MyCar();
		myCar.dig();
		myCar.shoot();
		myCar.drive();
		myCar.soundHorn();
		
		IFork f = myCar;
		f.dig();
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println( i1 == i2);
		System.out.println(i1.equals(i2));   //Integer 가 Object의 equals 함수를 오버라이드 해서 원래는
		// 메모리 어드레스가 같아야 트루인데 여기선 값이 같으면 true인걸로. 
		
		
		Student s1 = new Student(100, "James");
		Student s2 = new Student(100, "James2");
		//Student s3= s1;
		System.out.println(s1.equals(s2));
		
		System.out.println(i1.hashCode());
		
		HashSet set = new HashSet<Object>();
		
		set.add(s1);
		set.add(s2);
		set.add(new String("이승기"));
		set.add(new String("이승기"));
		System.out.println(set);
		
		MyDate d = new MyDate(11,12,13);
		System.out.println(d.hashCode(d));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println( str1 == str2);

		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println( str3 == str4);
 	}

}

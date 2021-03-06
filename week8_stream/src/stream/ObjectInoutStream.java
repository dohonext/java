package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

class Person implements Serializable{  //Serializable 대신 Externalizable을 쓰면 tran없이 멤버를 골라서 할수있다.
	
	private String name;
	public int age;
	public transient float height; // 얘는 시리얼라이제이션 하지 않는다.
	public transient Socket socket = new Socket(); //소켓은 시리얼라이제이션 하고싶어도 안되나 필요할경우, tran넣음.
	
	public Person(){
		name = "무명씨";
		age = 1;
		height = 58.0f;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		return name + ":" + age + ":" + height;
	}
	
}

public class ObjectInoutStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("serial.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		FileInputStream fis = new FileInputStream("serial.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person lee = new Person();
		lee.setName("이승기");
		Person kim = new Person();
		kim.setName("김수현");
		
		oos.writeObject(lee);
		oos.writeObject(kim);
		oos.close();

		Person p1 = (Person)ois.readObject();
		Person p2 = (Person)ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}

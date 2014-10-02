package library;

import java.util.ArrayList;

class Shelf{
	
	public ArrayList<String> nextShelf = new ArrayList<String>();
	
	public Shelf(){
		nextShelf.add("정글만리1");
		nextShelf.add("정글만리2");
		nextShelf.add("정글만리3");
	}
	
	public synchronized String lendBook() throws InterruptedException{
		Thread thread = Thread.currentThread();
		if( nextShelf.size() == 0) {
			System.out.println(thread.getName() + "waiting start");
			wait();
		}
		String name = nextShelf.remove(0);
		System.out.println(name + "대출");
		return name;
	}
	
	public synchronized void returnBook(String book){
		nextShelf.add(book);
		System.out.println(book + "반납");
		notify();  //notifyAll() 을 사용하면 또 어레이 아웃오브 인덱스러 
	}
	
	public void readBook() throws InterruptedException {
		Thread.sleep(5000);
	}
}

class Student extends Thread{
	
	public void run(){
		
		try {
			String name = LibraryMain.myShelf.lendBook();
			if(name == null) return;
			LibraryMain.myShelf.readBook();
			LibraryMain.myShelf.returnBook(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class LibraryMain {

	public static Shelf myShelf = new Shelf();
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		Student student6 = new Student();
		
		student1.start();
		student2.start();
		student3.start();
		student4.start();
		student5.start();
		student6.start();
		

	}

}

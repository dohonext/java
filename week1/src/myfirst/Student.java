package myfirst;

public class Student {
	public int studentNumber = 1;
	String name;
	String major;
	String address;
	int snCount = 0;
	
	
	Student(){
		this("이름없음", "학과없음", "주소없음");
	}
	
	Student(String name, String major, String address) {
		this.studentNumber = getStudentNumber();
		this.name = name;
		this.major = major;
		this.address = address;
	}
	
	public int getStudentNumber(){
		return snCount++;
	}
}

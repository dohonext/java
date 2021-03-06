package week2;

public class Student {
	public static int studentIDCount = 0;
	public int studentNumber;
	public String name;
	public String major;
	public String address;
	
	Student(){
		this("이름없음", "학과없음", "주소없음");
	}
	
	Student(String name, String major, String address) {
		getStudentNumber();
		this.name = name;
		this.major = major;
		this.address = address;
	}
	
	public void getStudentNumber(){
		++studentIDCount;
		this.studentNumber = Student.studentIDCount;
	}
	
	public static int getStudentCount(){
		return studentIDCount;
	}
}



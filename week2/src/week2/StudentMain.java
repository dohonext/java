package week2;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println(Student.studentIDCount);  //static 이라 new로 인스턴스 안만들어도 쓸수있음 그냥 클래스이름.멤버 이런식으로 
		System.out.println(Student.getStudentCount());  // 마찬가지 (메소드 static으로 만)
		
		Student student1 = new Student();
		System.out.println(student1.name);
		System.out.println(student1.studentNumber);
		
		Student student2 = new Student("이승기","컴퓨터공학과","서울");
		System.out.println(student2.name);
		System.out.println(student2.studentNumber);

	}

}

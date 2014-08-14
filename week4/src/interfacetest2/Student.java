package interfacetest2;

public class Student {
	int studentNumber;
	String name;
	
	public Student(int num, String name){
		this.studentNumber = num;
		this.name = name;
	}
	
	/* public boolean equals(Student student){
		if (this.studentNumber == student.studentNumber){
			return true;
		}
		else{
			return false;
		}*/
		
	public boolean equals(Object obj){
		if (obj instanceof Student){
			Student student = (Student)obj;
			if (this.studentNumber == student.studentNumber ){
				return true;
				}
			else{
				return false;
			}
		}
		else {
			return false;	
		}
		
	
		
	}	

	@Override
	public int hashCode() {
		
		return studentNumber;
	}
	

}

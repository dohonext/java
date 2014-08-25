package homework5;

public class Student implements Comparable<Student>{
	private String name;
	private String studentNumber;
	private Score score;
	
	public Student(String name, String studentNumber){
		this.name = name;
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
	
	@Override
	public int compareTo(Student other) {
		if (this.getScore().getScoreSum() > other.getScore().getScoreSum()) return -1;
		else if (this.getScore().getScoreSum() == other.getScore().getScoreSum()) return 0;
		else return 1;
	}
}

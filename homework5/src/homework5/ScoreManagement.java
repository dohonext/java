package homework5;

import java.util.Iterator;
import java.util.TreeMap;

public class ScoreManagement {
	private TreeMap<Student, Score> studentList;
	
	public ScoreManagement() {
		this.studentList = new TreeMap<Student, Score>();
	}
	
	public void addScore(Student student, Score score) {
		student.setScore(score);
		studentList.put(student, score);
	}

	public void displayAllScore() {
		Iterator<Student> ir = studentList.keySet().iterator();
		while(ir.hasNext()){
			Student student = ir.next(); 
			Score score = studentList.get(student); 
			System.out.println("학생ID : " + student.getStudentNumber() + ", " +
								"이름 : " + student.getName() + ", " +
								"국어  : " + score.getKoreanScore() + ", " + 
								"수학 : " + score.getMathScore() + ", " + 
								"총점 : " + score.getScoreSum());
		}
	}
	
}

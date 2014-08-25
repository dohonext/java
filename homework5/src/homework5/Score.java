package homework5;

public class Score {
	private String studentNumber;
	private int koreanScore;
	private int mathScore;
	
	
	
	public Score(String studentNumber, int koreanScore, int mathScore){
		this.studentNumber = studentNumber;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
	}
	
	public String getStudentNumber(){
		return this.studentNumber;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public int getScoreSum(){
		return this.koreanScore + this.mathScore;
	}
	

	
	
}

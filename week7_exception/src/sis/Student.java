package sis;

import sis.util.MyLogger;

public class Student {
	private String name;
	Score score;
	
	
	MyLogger myLogger = MyLogger.getInstance();
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setScore(Score score){
		this.score = score;
	}

}

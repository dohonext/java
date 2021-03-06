package homework;

import java.io.InputStreamReader;

public class BirthDayMain {

	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		day.setYear(2000);
		day.setMonth(2);
		day.setDay(29);
		System.out.println(day.checkValidate());  //true
		
		BirthDay day2 = new BirthDay(2014,7,10);
		System.out.println(day2.checkValidate()); //true
		
		BirthDay day3 = new BirthDay();
		day3.setDate(2100,2,29);
		System.out.println(day3.checkValidate()); //false
	}
}

class BirthDay {
	private int year;
	private int month;
	private int day;
	
	public BirthDay(){};
	public BirthDay(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public void setDate (int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public boolean checkValidate(){
		boolean leapYear = false;
		
		if (month > 12){
			return false;
		}
		
		if (day > 31) {
			return false;
		}
		
		if (month == 4 || month == 6 || month == 9 || month ==11 ) {
			if (day > 30){
				return false;
			}
		}
		
		if (year % 4 == 0){ 
			if (year % 100 == 0){
				if (year % 400 == 0){
					leapYear = true;
				}
				else{
					leapYear = false;
				}	
			}
			else {
				leapYear = true;
			}
		}
		
		if(leapYear == true) {
			if (month == 2){
				if (day > 29){
					return false;
				}
			}
			else {
				return true;
			}
		}
		else{
			if (month == 2){
				if (day > 28){
					return false;
				}
			}
			else {
				return true;
			}
		}
		return true;
	}
}

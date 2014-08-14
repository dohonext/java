package interfacetest2;

public class MyDate {

	int day;
	int month;
	int year;
	int date;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.date= Integer.parseInt(Integer.toString(day)+Integer.toString(month)+Integer.toString(year));
	}
	
	public boolean equals(int date){
		if (this.date == date){
			return true;
		}
		else {
			return false;
		}
	}
	
	public int hashCode(MyDate myDate){
		return date;
	}

}

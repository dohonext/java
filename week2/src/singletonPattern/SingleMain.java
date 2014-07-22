package singletonPattern;

import java.util.Calendar;

public class SingleMain {

	public static void main(String[] args) {
		//Singleton single1 = Singleton.getInstance();
		//String companyName = single1.getCompanyName();
		String companyName = Singleton.getInstance().getCompanyName();
		
		Calendar calendar = Calendar.getInstance();
	}

}

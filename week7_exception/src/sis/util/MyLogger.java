package sis.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class MyLogger {

	private static MyLogger instance = new MyLogger();
	
	Logger logger = Logger.getLogger("logging");  //singleton
	FileHandler fHandler;
	public static final String FILENAME = "log.txt";
	SimpleFormatter newFormatter = new SimpleFormatter();
	
	private MyLogger() {
		try {
			fHandler = new FileHandler(FILENAME, true);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fHandler.setLevel(Level.FINEST);
		//fHandler.setFormatter(newFormatter);
		logger.addHandler(fHandler);;
	}
	
	public void warning(String mylog){
		logger.warning(mylog);
	}
	
	public void fine(String mylog){
		logger.fine(mylog);   // == logger.log(Level.FINE, mylog);
	}
	
	public static MyLogger getInstance(){
		if(instance == null)
			instance = new MyLogger();
		return instance;
	}
}

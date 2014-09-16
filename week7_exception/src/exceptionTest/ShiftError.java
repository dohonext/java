package exceptionTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ShiftError {

	public URL makeUrl(String url, String filename) throws FileNotFoundException, MalformedURLException{
		FileReader fr = new FileReader(filename);
		return new URL(url);
	}
	
	public static void main(String[] args){
		ShiftError sh = new ShiftError();
		try {
			sh.makeUrl("http://www.naver.com", "a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();			
		}
	}
}

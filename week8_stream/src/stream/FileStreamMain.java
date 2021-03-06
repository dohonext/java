package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileStreamMain {

	public static void main(String[] args) throws IOException {
		/*FileOutputStream fos = new FileOutputStream("./bin/a.txt", true);  //뒤에 true는 덮어쓰기 말고 붙여쓰기 하라는 표시. 지우면 그냥 덮어쓴다.
		
		
		fos.write(72);
		fos.write(101);
		fos.write(108);
		fos.write(108);
		fos.write(111);
		
		fos.close();
		
		System.out.println("끝");
		
		FileInputStream fis = new FileInputStream("./bin/a.txt");
		int i=0;
		while( (i=fis.read()) != -1){
			System.out.print((char)i);
		}
		if(fis != null)
			fis.close();
		
		//System.out.println((char)fis.read());  */
		
		
		
		//FileOutputStream fos = new FileOutputStream("./bin/a.txt"); 
		FileOutputStream fos = new FileOutputStream(args[0]); 
		
		InputStreamReader isr = new InputStreamReader(System.in);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		int i;  //아스키 코드니까 인트로 만듦
		while( (i= isr.read()) != '끝'){
			System.out.print((char)i);
			osw.write((char)i);
		}
		
		osw.close();
	}

}

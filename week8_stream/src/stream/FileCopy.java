package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]); 
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//InputStreamReader isr = new InputStreamReader(System.in);
		//OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		int i;
		int len = 0;
		long psecond = System.currentTimeMillis();
		//byte[] bytes = new byte[1024];
		
		while( (i=bis.read()) != -1){
			bos.write(i);
			len++;
		}
		
		psecond = System.currentTimeMillis() -psecond;
		
		System.out.println("len=" + len + "," + psecond + "milliseconds");
		
		fis.close();
		fos.close();
		
		//System.out.println((char)fis.read());  */
		
		
		
		//FileOutputStream fos = new FileOutputStream("./bin/a.txt"); 
		/*FileOutputStream fos = new FileOutputStream(args[0]); 
		
		InputStreamReader isr = new InputStreamReader(System.in);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		int i;  //아스키 코드니까 인트로 만듦
		while( (i= isr.read()) != '끝'){
			System.out.print((char)i);
			osw.write((char)i);
		}
		
		osw.close();*/

		
		
		
		
		FileReader fr = new FileReader("a.doc");
		BufferedReader br = new BufferedReader(fr);
		System.out.print(br.readLine());
	}

}
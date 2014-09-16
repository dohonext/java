package stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInoutStream {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("data.out");
		DataOutputStream dos = new DataOutputStream(fos);
		FileInputStream fis = new FileInputStream("data.out");
		DataInputStream dis = new DataInputStream(fis);
		
		
		dos.write(100);
		dos.writeInt(100);;
		dos.writeFloat(3.14f);
		dos.writeChar('A');
		
		dos.close();
		
		
		int i = dis.read();
		int i2 = dis.readInt();
		float f = dis.readFloat();
		char c = dis.readChar();     // 파일 아웃풋 데이터 타입 순서대로 인풋 해야한다.
		
		System.out.println(i + "," + i2 + "," + f + "," + c);
		dis.close();
		
		
	}

}

package train;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* customer.csv 파일을 읽어서 ','로 스플릿 하여 arrayList에 String 타입으로 저장 */

public class FileIO {
	private ArrayList<ArrayList <String>> info = new ArrayList<ArrayList<String>>();
	private String fileName;
	
	public FileIO(){};
	public FileIO(String filename) throws IOException {
		this.setFile(filename);
	}
	
	public void setFile(String fileName) throws IOException {
		this.fileName = fileName;
		this.read();
	}

	public String getFileName() {
		return fileName;
	}

	public void read() throws IOException {
		if(this.fileName != null){
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(this.fileName), "UTF-8"));
			
			String line;
			StringTokenizer st;
			
			while((line = br.readLine()) != null){
				
				st = new StringTokenizer(line, ",");
				ArrayList<String> row = new ArrayList<String>();
				
				while(st.hasMoreTokens()) row.add(st.nextToken());			
				info.add(row);
			};
			
			if(br != null) br.close();
		}else{
			throw new FileNotFoundException();
		}
	}
	
	public ArrayList<ArrayList<String>> getData() {
		return info;
	}
}

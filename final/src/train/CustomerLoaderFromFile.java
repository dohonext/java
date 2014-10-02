package train;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CustomerLoaderFromFile {
	public ArrayList<Customer> customerList;
	
	public CustomerLoaderFromFile() throws FileNotFoundException, IOException{
		customerList = new ArrayList<Customer>();
		
		FileInputStream fis = new FileInputStream("CustomerData.csv");
		BufferedInputStream bip = new BufferedInputStream(fis);
		BufferedOutputStream bop = new BufferedOutputStream(new FileOutputStream("result1.csv"));
		BufferedReader br = new BufferedReader(new InputStreamReader(fis, "EUC-KR"));
		
		String data = new String();
		
		while((data = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(data, ",");
			String[] parsedData = new String[10];
			Customer customer = new Customer();
			
			for(int i=0; st.hasMoreTokens(); i++){
				parsedData[i] = st.nextToken();
			}
			
			customer.setId(parsedData[0]);
			customer.setName(parsedData[1]);
			customer.setStationReachTime(parsedData[2]);
			customer.setTicketingTime(parsedData[3]);
			customer.setDepartureStation(parsedData[4]);
			customer.setArrivalStation(parsedData[5]);
			
			customerList.add(customer);
		}
		
		bip.close();
		bop.close();
		br.close();
		
	}
}

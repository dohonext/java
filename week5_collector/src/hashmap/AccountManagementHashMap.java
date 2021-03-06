package hashmap;

import java.util.HashMap;
import java.util.Iterator;



public class AccountManagementHashMap {

	private HashMap<String, Account> accounts;
	
	public AccountManagementHashMap(){
		accounts = new HashMap<String, Account>();
		
	}

	public void insertAccount(int balance, String accountNumber, String accountName) {
		accounts.put(accountNumber,  new Account(balance, accountNumber, accountName));
	}

	public void setDeposit(int money, String accountNumber) {
		if(accounts.containsKey(accountNumber)){
			Account account = accounts.get(accountNumber);
			account.deposit(money);;
			return;
		}
		System.out.println(accountNumber + "계좌가 없습니다.");
		
	}

	public void accountAllDisplay() {
		Iterator<String> ir = accounts.keySet().iterator();
		while(ir.hasNext()){
			String accountNumber = ir.next();
			System.out.println(accounts.get(accountNumber));
		}
		
	}
}

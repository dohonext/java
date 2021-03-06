package treemap;

import hashmap.Account;

import java.util.Iterator;
import java.util.TreeMap;

public class AccountManagementTreeMap {

	private TreeMap<AccountNumber, Account> accounts;
	
	public AccountManagementTreeMap(){
		accounts = new TreeMap<AccountNumber, Account>();
	}
	
	
	
	public void insertAccount(float money, AccountNumber accountNumber, String accountName) {
		accounts.put(accountNumber,  new Account(money, accountNumber.getAccountNumber(), accountName));
		
	}

	public void setDeposit(float amount, AccountNumber accountNumber) {
		if(accounts.containsKey(accountNumber)){
			Account account = accounts.get(accountNumber);
			account.deposit(amount);;
			return;
		}
		System.out.println("Error");
		
	}

	public void accountAllDisplay() {
		// TODO Auto-generated method stub
		Iterator<AccountNumber> ir = accounts.keySet().iterator();
		while(ir.hasNext()){
			Account account = accounts.get(ir.next());
			System.out.println(account);
		}
		
	}

}

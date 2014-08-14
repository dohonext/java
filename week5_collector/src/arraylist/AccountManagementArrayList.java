package arraylist;

import java.util.ArrayList;
import java.util.Iterator;



public class AccountManagementArrayList {

	private ArrayList<Account> accounts;
	
	
	public AccountManagementArrayList(){
		this(10);
	}
	
	public AccountManagementArrayList(int size){
		accounts = new ArrayList<Account>(size);
	}
	
	public void insertAccount(float money, String accountNumber, String accountName) {
		Account account = new Account(money, accountNumber, accountName);
		accounts.add(account);	
	}

	public void setDeposit(float amount, String accountNumber) {
		/*for(int i=0; i<accounts.size(); i++){
			Account account = accounts.get(i);
			String tempNumber = account.getAccountNumber();
			if(accountNumber.equals(tempNumber))
			{
				account.deposit(amount);
				return;
			}
		}*/
		
		Iterator ir = accounts.iterator();
		while(ir.hasNext()){
			Account account = (Account)ir.next();
			String tempNumber = account.getAccountNumber();
			if(accountNumber.equals(tempNumber))
			{
				account.deposit(amount);
				return;
			}
		}
		System.out.println( accountNumber + " 계좌가 없습니다.");
		return;
	}

	public void accountAllDisplay() {
		
		/*for(int i=0; i<accounts.size(); i++){
			System.out.println(accounts.get(i));
		}*/
		Iterator ir = accounts.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
	}

}

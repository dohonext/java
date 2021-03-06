package treeset;

import java.util.Iterator;
import java.util.TreeSet;



public class AccountManagementTreeSet {

	private TreeSet<Account> accounts;
	
	public AccountManagementTreeSet(){
		this(10);
	}
	
	public AccountManagementTreeSet(int size){
		accounts= new TreeSet<Account>(new Account());
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
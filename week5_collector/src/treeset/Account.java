package treeset;

import java.util.Comparator;

public class Account implements Comparator<Account> {

	private float balance;
	private String accountNumber;
	private String accountName;
	
	public Account() {}
	public Account(float balance, String accountNumber, String accountName) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	public void withdraw(float amount){
		if(amount > balance){
			System.out.println("잔고 부족!!");
		}else{
			balance -= amount;
		}
	}
	public void deposit(float amount){
		if(amount <= 0){
			System.out.println(amount +  "로는 입금 불가");
		}else{
			balance += amount;
		}
	}
	@Override
	public String toString(){
		return accountName + "님의 계좌번호는" + accountNumber + "이며, " + "현재 잔고는" + balance + "입니다."; 
	}
	public float getBalance() {
		return balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	/*@Override   이건 comparable 을플리먼트했을때. 이경우에는 AccountManagementTreeSet 17번째줄 마지막 괄호에 new Account()를 안 넣어도 된다 
	public int compareTo(Account acc) {
		return((int)acc.getBalance() - (int)this.getBalance());
	}*/
	@Override
	public int compare(Account acc1, Account acc2) {
		// TODO Auto-generated method stub
		return ((int)acc1.getBalance() -(int)acc2.getBalance());
	}
}
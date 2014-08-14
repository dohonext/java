package treemap;

public class AccountNumber implements Comparable<AccountNumber>{
	private String accountNumber;
	
	public AccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return accountNumber;
	}

	@Override
	public int compareTo(AccountNumber acc) {
		return acc.getAccountNumber().compareTo(this.getAccountNumber());
	}
}

package treemap;

public class AccountTreeMapTest {

	public static void main(String[] args) {
		AccountManagementTreeMap aManager = new AccountManagementTreeMap();
		
		AccountNumber accountNumber1 = new AccountNumber("12345_1");
		AccountNumber accountNumber2 = new AccountNumber("12345_2");
		AccountNumber accountNumber3 = new AccountNumber("12345_3");
		AccountNumber accountNumber4 = new AccountNumber("12345_4");
		AccountNumber accountNumber5 = new AccountNumber("12345_5");
		
		aManager.insertAccount(15000, accountNumber1, "Tomas");
		aManager.insertAccount(95000, accountNumber2, "James");
		aManager.insertAccount(75000, accountNumber3, "Jenny");
		aManager.insertAccount(35000, accountNumber4, "Edward");
		aManager.insertAccount(65000, accountNumber5, "Pororo");
		
		aManager.setDeposit(50000, accountNumber1);
		aManager.setDeposit(50000, accountNumber2);
		aManager.setDeposit(50000, accountNumber3);
		aManager.setDeposit(50000, accountNumber4);
		aManager.setDeposit(50000, accountNumber5);
		
		aManager.accountAllDisplay();
		
		
		
	}

}

package hashmap;



public class AccountHashMapTest {

	public static void main(String[] args) {
		AccountManagementHashMap accountManagement = new AccountManagementHashMap();
		
		accountManagement.insertAccount(15000, "123451", "Thomas");
		accountManagement.insertAccount(25000, "123452", "James");
		accountManagement.insertAccount(35000, "123453", "Edward");
		accountManagement.insertAccount(45000, "123454", "Phoby");
		accountManagement.insertAccount(55000, "123455", "Jenny");
		accountManagement.insertAccount(35000, "123453", "Toto");
		
		accountManagement.setDeposit(50000, "123451");
		accountManagement.setDeposit(50000, "123452");
		accountManagement.setDeposit(50000, "123453");
		accountManagement.setDeposit(50000, "123454");
		accountManagement.setDeposit(50000, "123455");
		
		accountManagement.accountAllDisplay();
		

	}

}

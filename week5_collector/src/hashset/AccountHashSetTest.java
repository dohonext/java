package hashset;

import java.util.HashSet;

public class AccountHashSetTest {

	public static void main(String[] args) {
		AccountManagementHashSet accountManagement = new AccountManagementHashSet(10);
		
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
		
		
		HashSet set = new HashSet();
		set.add(111);
		set.add(222);
		set.add(111);
		
		System.out.println(set);
	}

}

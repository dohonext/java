package lab4_Sync;

class Bank{
	
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void saveMoney(int save){
		int m= this.getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setMoney(m + save);
	}
	
	public void minusMoney(int minus){
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setMoney(m - minus);
	}
}

class Park extends Thread{
	
	public void run(){
		
		synchronized(SyncMain.myBank){
			SyncMain.myBank.saveMoney(3000);
			System.out.println("saveMoney(3000):" + SyncMain.myBank.getMoney());
		}
	}
}

class ParkWife extends Thread{
	
	public void run(){
		synchronized(SyncMain.myBank){
			SyncMain.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000):" + SyncMain.myBank.getMoney());
		}
	}
}

public class SyncMain {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		
		Park p = new Park();
		ParkWife pw = new ParkWife();
		
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pw.start();
		
		
	}

}

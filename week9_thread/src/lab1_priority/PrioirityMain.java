package lab1_priority;

public class PrioirityMain {

	public static void main(String[] args) {
		for(int i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++){
			PriorityThread p = new PriorityThread();
			p.setPriority(i);
			p.start();
		}

	}

}

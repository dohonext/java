package interfacetest;

public class CalcMain {

	public static void main(String[] args){
			
		//Calculator c = new Calculator();   둘다 쓸수 있지만 아래걸로 하면 여러개로 쓰일 수 있음 
		ICalc c = new Calculator();
		
		System.out.println(c.add(3,5));
		System.out.println(c.sub(3,5));
		System.out.println(c.multi(3,5));
		System.out.println(c.divide(3,5));
	}
}

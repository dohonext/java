package casting;

import java.util.ArrayList;

class Servant{
	
	public void washCar(){
		System.out.println("세차 합니다");
	}

	public void cleaningHouse(){
		System.out.println("청소 합니다");
	}
}

class Master{
	public void manage(Object obj){     //s를 오브젝트로 받아서 서번트로 형변환 시켜준것임. 
		if (obj instanceof Servant) {
			Servant s = (Servant)obj;
			s.washCar();
			s.cleaningHouse();
		}
		else{
			System.out.println("입력하신 오브젝트는 Servant가 될 수 없습니다");
		}
	}
}

public class ServantTest {

	public static void main(String[] args) {
		
		Master m = new Master();
		Servant s = new Servant();
		m.manage(s);
		
		String str = new String();
		m.manage(str);
		
		
		
		//여기서부터는 어레이리스트로 
		
		
		ArrayList list = new ArrayList(); //ArrayList<Servant> list = new ArrayList<Servant>();
		list.add(new String("abc"));
		list.add(new Master());
		
		for(int i=0; i<list.size(); i++){
			Object obj = list.get(i);
			if (obj instanceof String){
				String stri = (String)obj;
				System.out.println(stri);
			}
			else if ( obj instanceof Master) {
				Master ma = (Master)obj;
				Servant se = new Servant();
				ma.manage(se);
			}
			else{
				System.out.println("ambiguous type");
			}
		}
		
		
		
	}

}

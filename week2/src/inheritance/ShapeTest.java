package inheritance;

class Shape{
	public void draw(){
		System.out.println("draw shpae");
	}
}

class Circle extends Shape{
	public void draw(){
		System.out.println("draw circle");
	}
}

class Rectangle extends Shape{
	public void draw(){
		System.out.println("draw rectangle");
	}
}

class Triangle extends Shape{
	public void draw(){
		System.out.println("draw triangle");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		ShapeTest st = new ShapeTest();
		st.drawShape(new Circle());
		st.drawShape(new Rectangle());
		st.drawShape(new Triangle());
		
		Shape[] shapeList = new Shape[3];
		shapeList[0] = new Circle();
		shapeList[1] = new Rectangle();
		shapeList[2] = new Triangle();
		
		for(int i=0; i<shapeList.length; i++){
			shapeList[i].draw();   //overriding 된 게 불립니다.
			
		Shape s = st.makeShape(0);
		s.draw();
		}
	}

	public void drawShape(Shape s){
		s.draw();
	}
	
	public Shape makeShape(int type) {   //리턴타입이 Shape이다.
		if(type == 0) return new Circle();
		else if(type == 1) return new Rectangle();
		else return new Triangle();
	}
}

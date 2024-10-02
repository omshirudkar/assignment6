package assignment6;



//import assignment6.GeometricShape;
//import assignment6.GeometricShape.Traingle;

public class TestGeometricShape {

	public static void main(String[] args) {
		Traingle t=new Traingle(10, 20, 30);
		t.area();
		t.perimeter();
		
		System.out.println("=======================================");
		
		Rectangle r = new Rectangle();
		r.area();
		r.perimeter();
		
		System.out.println("==================================");
		
		Circle c = new Circle();
		c.area();
		c.perimeter();

	}

}

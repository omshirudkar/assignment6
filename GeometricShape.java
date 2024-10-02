package assignment6;

abstract public class GeometricShape {
	final double PI=3.14;
	
	abstract public void area();
	abstract public void perimeter();
}
class Circle extends GeometricShape{
	
	public void area()
	{
		double area;
		int r=10;
		area = PI * r * r;
//	    return area;
		
	}
	
	public void perimeter()
	{
		int r=10;
		double perimeter=2 * PI * r;
//		return perimeter;
	}
}

class Rectangle extends GeometricShape{
	
	public void area()
	{
		double area;
		int l=10;
		int b=20;
		System.out.println("area is" +(area = l * b));
   //     return area;
		
	}
	
	public void perimeter()
	{
		int l=10;
		int b=20;
		double perimeter= l + b;
//		return perimeter;
	}
}
	
class Traingle extends GeometricShape{
	int a;
	int b;
	int c;


	public Traingle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void area() {
		System.out.println("area = "+(0.5 * b * c));
	}
	public void perimeter()
	{
		System.out.println("area = "+(a* b * c));
		
	}
}
	




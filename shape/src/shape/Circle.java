package shape;

public class Circle {
	
	
	final double PI = 3.14;
	double radius ;
	String color;
	
	
	Circle(double radius,String color)
	{
		this.radius = radius;
		this.color = color;
	}
	
	double calculatePerimeter()
	{
		return 2 * PI * this.radius;
	}
	
	double calculateArea()
	{
		return PI * this.radius * this.radius; 
	}
	

}

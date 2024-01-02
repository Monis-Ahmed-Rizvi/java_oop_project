package shape;

public class Rectangle implements Ishape {

	double length,width;
	String color;
	
		
	Rectangle(double length,double width,String color)
	{
		this.color = color;
		this.length = length;
		this.width = width;
	}
	
	
	@Override
	public double calculatePerimeter() {
		
		return 2 *(this.length + this.width);
	}

	@Override
	public double calculateArea() {
		
		return this.length * this.width;
	}
	
	

}

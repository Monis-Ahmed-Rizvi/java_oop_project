package shape;
import java.util.*;
import java.math.*;

public class triangle implements Ishape{

	
	double height;
	double base;
	String color;
	
	triangle(double height,double base, String color)
	{
		this.height = height;
		this.base = base;
		this.color = color;
		
	}
	
	@Override
	public double calculatePerimeter()
	{
		return this.height + this.base + Math.sqrt(Math.pow(this.height,2) + Math.pow(this.base,2));
	}
	
	@Override
	public double calculateArea()
	{
		return this.height * this.base;
		
	}
	
	
}

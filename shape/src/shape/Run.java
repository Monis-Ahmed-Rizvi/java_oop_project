package shape;

public class Run {

	
	public static void main(String[] args)
	{
		
		Rectangle RObj = new Rectangle(4,4,"Yellow");
		
		System.out.println("Area:"+RObj.calculateArea());
		System.out.println(RObj.calculatePerimeter());
		RObj.render.draw();
		RObj.render.draw("Rectangle");
		
		
		System.out.println("");
		
       square SObj = new square(4,"Yellow");
		
		System.out.println("Area:"+SObj.calculateArea());
		
		SObj.render.draw();
		SObj.render.draw("Square");
		
		
		System.out.println("");
		
		
		
		
		triangle tObj = new triangle(5,5,"red");
		
		System.out.println("Area:"+tObj.calculateArea());
		System.out.println(tObj.calculatePerimeter());
		tObj.render.draw();
		tObj.render.draw("Triangle");
		
		
		System.out.println("");
		
		
		
        Circle CObj = new Circle(5,"red");
		
		System.out.println("Area:"+CObj.calculateArea());
		System.out.println(CObj.calculatePerimeter());
		tObj.render.draw();
		tObj.render.draw("Cricle");
		
		
		System.out.println("");
		
	}
	
}

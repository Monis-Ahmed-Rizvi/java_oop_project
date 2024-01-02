package shape;

public class square extends Rectangle {
      square(double side,String color)
      {
    	super(side,side,color);
    	
      }
      
      @Override
      public double  calculateArea()
      {
    	  return super.length * super.width;
      }
}



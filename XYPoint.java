public class XYPoint
{
  //instance variables (attributes)
  private double x;
  private double y;
  
  //method (operations)
  //Constructors (we can have more than 1, always need to have the same name of the class)
  public XYPoint()
  {
    x= 0;
    y= 0;
    
    
  }
  
  //other method
  public void setX(double newX)
  {
  
  }
  public void setXY(double newX, double newY))
  {
    x= newX;
    y= newY;
  }
  
  //toString
  public String toString()
  {
    String result = "("+ x + ", " + y + ")";
    return result;
    
  }
  
}

package Class21;
 // Create 1 class in which create a methods tha will calculate the area of Method name must be called CalculateArea
public class Area {

  void calculateArea(double length,double width){
   System.out.println("Area of rectangle is "+(length*width));
  }

  void calculateArea(double side){
   System.out.println("Area of rectangle is "+(side*side));
  }

  public static void main(String[] args) {

   Area area=new Area();
   area.calculateArea(10);
   area.calculateArea(10,20);
  }





}

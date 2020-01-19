public class Circle extends Shape{           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   // private String color;
	protected double radius;
  
   
   // 1st constructor, which sets both radius and color to default
   public Circle() {
      radius = 1.0;
      //color = "red";
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double r) {
      radius = r;
      //color = "red";
   }
   
   public Circle(double r, String color, boolean filled) {
	   super(color, filled);   
	   radius = r;
	      
	   }
   
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   public double getPerimeter() {
	     return radius*2*Math.PI; 
	   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
      
   public void setRadius(double r) {
	   radius = r;
   }
	 
   /*public void setColor(String c) { 	
		this.color = c;		
   }
   
   public String getColor() {
	 return color;
   }*/
	
   public String toString() {
		   return "Circle: radius=" + radius + " where " + super.toString();
   }
	
}
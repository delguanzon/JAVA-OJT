package OOP;

public class MyCircle {

	MyPoint center;
	int radius;
	
	public MyCircle(int x, int y, int radius){
		
		this.center = new MyPoint(x,y);
		this.radius = radius;
		
	}
	
	public MyCircle(MyPoint center, int radius){
		
		this.center = center;
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public MyPoint getCenter() {
		return center;
		
	}
	
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
	public int getCenterX() {
		return center.x;
	}
	
	public int getCenterY() {
		return center.y;
	}
	
	public void setCenterXY(int x, int y) {
		center.x = x; center.y = y;
	}
	
	public String toString()
	{
		return "Circle @ ("+center.x+","+center.y+") radius= " +radius;
	}
	
	public double getArea()
	{
		return 2*Math.PI*radius;
	}
	
}

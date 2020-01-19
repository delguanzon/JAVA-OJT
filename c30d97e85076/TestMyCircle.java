package OOP;

public class TestMyCircle {

	public static void main(String args[])
	{
		
		MyCircle circle = new MyCircle(new MyPoint(2,2), 12);
		System.out.println(circle);
		System.out.println(circle.getArea());
		circle.setRadius(4);
		circle.setCenter(new MyPoint(1,1));
		System.out.println(circle);
		System.out.println(circle.getArea());
		
		
	}
	
}

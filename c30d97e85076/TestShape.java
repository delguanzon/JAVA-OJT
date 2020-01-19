
public class TestShape {

	public static void main(String args[])
	{
		Shape shape = new Shape();
		Shape shape2 = new Shape("blue", false);
		
		System.out.println(shape.toString());
		System.out.println(shape2.toString());
		
		Rectangle rect = new Rectangle(10,10,"green", false);
		System.out.println(rect.toString());
		
		
		Square square = new Square(10,"black",true);
		System.out.println(square.toString());
	}
}

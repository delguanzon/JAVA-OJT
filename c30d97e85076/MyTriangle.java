package OOP;

public class MyTriangle {

	MyPoint a;
	MyPoint b;
	MyPoint c;
	
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.a = new MyPoint(x1, y1);
		this.b = new MyPoint(x2, y2);
		this.c = new MyPoint(x3, y3);
	}
	
	public MyTriangle(MyPoint a, MyPoint b, MyPoint c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String toString()
	{
	return "Triangle @ (" + a.x + ',' + a.y +"), ("+ b.x + b.y + ") ("+ c.x +','+ c.y+")";
	}
	
	public double getPerimeter()
	{
		return a.distance(b) + b.distance(c) + c.distance(a);
	}
	
		
}

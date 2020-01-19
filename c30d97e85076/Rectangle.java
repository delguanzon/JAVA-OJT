
public class Rectangle extends Shape{
	
	protected double width = 1.0;
	protected double length = 1.0;
	
	public Rectangle(){		
	}
	
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled){
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getLength(){
		return length;
	}
	
	public void setLength(double l){
		this.length = l;
	}
	
	public void setWidth(double w){
		this.width = w;
	}
	
	public double getArea()	{
		return length * width;
	}
	
	public double getPerimeter()	{
		return (length * 2) + (width * 2);
	}
	
	public String toString()
	{
		return "A rectangle with width="+width+"and length="+length+" which is a subclass of "+super.toString();
	}

}

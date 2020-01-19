
public abstract class Shape {

	protected String color = "red";
	protected boolean filled = true;
	
	public Shape(){
		
	}
	
	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor(){
		return color;
	}
	
	public boolean isFilled(){
		return filled;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setFileld(boolean filled){
		this.filled = filled;
	}
	
	public String toString(){
		String f;
		if(filled == true)
			f = "filled";
		else f = "not filled";
		
		return "A Shape with color of "+color+" and "+f;
	}
	
	abstract double getArea();	
	abstract double getPerimeter();
	//abstract double getLength();
	//abstract double getSide();
	//abstract double getRadius();
		
	
	
}

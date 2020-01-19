
public class Square extends Rectangle{
	
	public Square(){
		
	}
	
	public Square(double side){
		super(side,side);
	}
	
	public Square(double side, String color, boolean filled){
		super(side,side,color,filled);
	}
	
	@Override
	public double getPerimeter(){
		return 4 * super.getLength();
	}
	
	@Override
	public double getArea(){
		return super.getLength() * super.getLength();
	}
	
	public void setLength(double side){
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setWidth(double side){
		super.setLength(side);
		super.setWidth(side);
	}	
	
	@Override
	public String toString(){		
		return "A Sqaure with side="+super.getLength() +", which is a subclass of " + super.toString();
	}
	
	

}

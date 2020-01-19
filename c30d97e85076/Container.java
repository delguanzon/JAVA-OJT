
public class Container {

	int x1; int y1; int x2; int y2;
	
	public Container(int x, int y, int width, int height) {
		
		this.x1 = x;
		this.y1 = y;
		x2 = x1+width-1;
		y2 = y1+height-1;
	}
	
	public boolean collidesWith(BouncingBalls ball){
		if (ball.getX() - ball.getRadius() <= this.x1 ||
			       ball.getX() - ball.getRadius() >= this.x2) {
			ball.reflectVertical();
			return true;	}			 
		if (ball.getY() - ball.getRadius() <= this.y1 ||
			       ball.getY() - ball.getRadius() >= this.y2) {
		ball.reflectHorizontal();	
		return true;
		}
		else return false;
	}
	
	public String toString()
	{		
		return "Container at ("+x1+", "+y1+ ") to ("+x2+", "+y2+")";
	}
	
}

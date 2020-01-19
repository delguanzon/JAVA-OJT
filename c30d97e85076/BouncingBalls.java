
public class BouncingBalls {

	
	float x;
	float y;
	int radius;
	float xDelta;
	float yDelta;
	
	public BouncingBalls(int x, int y, int radius, int speed, int direction){
		
		this.xDelta = (float) (speed * Math.cos(direction));
		this.yDelta = (float) (speed * Math.sin(direction));
		this.x = (float) x;
		this.y = (float) y;
		this.radius = radius;
				
		//xDelta = d × cos(angle)
		//yDelta = -d × sin(angle)		
	}
	
	public float getX()	{
		return x;
	}
	
	public float getY()	{
		return y;
	}
	
	public float getDeltaX() {
		return xDelta;
	}
	
	public float getDeltaY() {
		return yDelta;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public void setDeltax(float xDelta) {
		this.xDelta = xDelta;
	}
	
	public void setDeltaY(float yDelta) {
		this.yDelta = yDelta;
	}
	
	public void setDeltaXY(int xDelta, int yDelta){		
		this.xDelta = (float)xDelta;
		this.yDelta = (float)yDelta;
		
	}	
	
	public void setXY(int x, int y){		
		this.x = (float)x;
		this.y = (float)y;
		
	}
	
	public void move()
	{
		x += yDelta;
		y += yDelta;
	}
	
	public void reflectHorizontal()
	{
		xDelta = xDelta * (-1);
	}
	
	public void reflectVertical()
	{
		yDelta = yDelta * (-1);
	}
	
	public String toString()
	{
		return "Ball at (" +x+", "+y+") of velocity ("+ xDelta +", "+ yDelta+")";
	}
	
	
	
}

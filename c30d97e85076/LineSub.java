package OOP;

	
	public class LineSub extends MyPoint {
		   // A line needs two points: begin and end.
		   // The begin point is inherited from its superclass Point.
		   // Private variables
		   MyPoint end;               // Ending point
		   
		   // Constructors
		   public LineSub (int beginX, int beginY, int endX, int endY) {
		      super(beginX, beginY);             // construct the begin Point
		      this.end = new MyPoint(endX, endY);  // construct the end Point
		   }
		   public LineSub (MyPoint begin, MyPoint end) {  // caller to construct the Points
		      super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
		      this.end = end;
		   }
		   
		   // Public methods
		   // Inherits methods getX() and getY() from superclass Point
		   public String toString() { 
			   return "begin = "+super.toString()+"\nend = " + this.toString();
		   }
		   
		   public MyPoint getBegin() {
			   return this;
		   }
		   public MyPoint getEnd() { 
			   return end;
		   }
		   public void setBegin(MyPoint begin) {
			   super.setXY(begin.getX(), begin.getY());
		   }
		   public void setEnd(MyPoint end) {
			   this.end = end;
		   }
		   
		   public int getBeginX() { 
			   return super.getX();
		   }
		   public int getBeginY() { 
			   return super.getY();
		   }
		   public int getEndX() { 
			   return end.getX();
		   }
		   public int getEndY() {
			   return end.getY();
		   }
		   
		   public void setBeginX(int x) { 
			   super.setX(x);
		   }
		   public void setBeginY(int y) {
			   super.setY(y);
		   }
		   public void setBeginXY(int x, int y) {
			   super.setXY(x, y);
		   }
		   public void setEndX(int X) {
			   this.setX(x);			   
			   
		   }
		   public void setEndY(int x, int y) {
			   this.setY(y);
		   }
		   public void setEndXY(int x, int y) {
			   this.setXY(x, y);
		   }
		   
		   public int getLength() {
			  return (int)super.distance(this);
		   }       // Length of the line
		   public double getGradient() { 
			  return Math.atan2(super.y - this.y,super.x - this.x);
		   }  // Gradient in radians
		   
		}
	
	


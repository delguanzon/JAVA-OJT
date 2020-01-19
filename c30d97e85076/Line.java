package OOP;

public class Line {

	private MyPoint begin;
	private MyPoint end;
	
	public Line(MyPoint begin, MyPoint end){
		this.begin = begin;
		this.end = end;
	}
	
	 public Line (int beginX, int beginY, int endX, int endY) {
	      begin = new MyPoint(beginX, beginY);   // construct the Points here
	      end = new MyPoint(endX, endY);
	   }
	   
	   // Public methods
	   public String toString() { 
		   return "begin = "+begin.toString()+"\nend = " + end.toString();
	   }
	   
	   public MyPoint getBegin() {
		   return begin;
	   }
	   public MyPoint getEnd() { 
		   return end;
	   }
	   public void setBegin(MyPoint begin) {
		   this.begin = begin;
	   }
	   public void setEnd(MyPoint end) {
		   this.end = end;
	   }
	   
	   public int getBeginX() { 
		   return begin.x;
	   }
	   public int getBeginY() { 
		   return begin.y;
	   }
	   public int getEndX() { 
		   return end.x;
	   }
	   public int getEndY() { 
		   return end.y;
	   }
	   
	   public void setBeginX(int x) {
		   begin.x = x;
	   }
	   public void setBeginY(int y) { 
		   begin.y = y;
	   }
	   public void setBeginXY(int x, int y) { 
		   begin.y = y;
		   begin.x = x;
	   }
	   public void setEndX(int x) { 
		   end.x = x;
		   
	   }
	   public void setEndY(int y) {
		   end.y = y;
		   
	   }
	   public void setEndXY(int x, int y) {
		   end.x = x;
		   end.y = y;
	   }
	   
	   public int getLength() {
		  return (int)begin.distance(end);
	   } // Length of the line
	                                     // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
	   public double getGradient() {
		   
		  return Math.atan2(begin.y - end.y,begin.x - end.x);
	   } // Gradient in radians
	                                          // Math.atan2(yDiff, xDiff)
}

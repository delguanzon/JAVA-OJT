package OOP;

public class TestLine {
	
	public static void main(String[] args) {
	      Line l1 = new Line(0, 0, 3, 4);
	      System.out.println(l1);
	   
	      MyPoint p1 = new MyPoint(0,0);
	      MyPoint p2 = new MyPoint(10,10);
	      Line l2 = new Line(p1, p2);
	      System.out.println(l2);
	      System.out.println(l2.getLength());
	      
	   }

}


public class TestBalls {

	
	public static void main(String args[])
	{
				

		BouncingBalls ball = new BouncingBalls(50, 50, 5, 10, 30);
	/*	System.out.println(ball.toString());
		ball.move();
		System.out.println(ball.toString());
		ball.reflectHorizontal();
		ball.move();
		System.out.println(ball.toString());
		ball.reflectVertical();
		ball.move();
		System.out.println(ball.toString());*/
		
		
		Container box = new Container(0, 0, 100, 100);
		for (int step = 0; step < 100; ++step) {
		   ball.move();
		   box.collidesWith(ball);
		   System.out.println(ball); // manual check the position of the ball
		}
	}
	
	
	
	
}

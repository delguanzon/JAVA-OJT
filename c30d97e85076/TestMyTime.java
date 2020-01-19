package OOP;

public class TestMyTime {

	public static void main(String args[])
	{
		MyTime time= new MyTime(23,00,00);
		System.out.println(time);
		//time.nextSecond();
		//time.nextMinute();
		//time.nextHour();
		time.previousSecond();
		System.out.println(time);
		
	}
	
}

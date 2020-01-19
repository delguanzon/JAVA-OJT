import java.util.Scanner;

public class KeyboardInputs {

	public void run()
	{
		
		      int num1;
		      double num2;
		      String name;
		      double sum;
		    
		      // Setup a Scanner called in to scan the keyboard (System.in)
		      Scanner in = new Scanner(System.in);
		      System.out.print("Enter an integer: ");
		      num1 = in.nextInt();     // use nextInt() to read int
		      System.out.print("Enter a floating point number: ");
		      num2 = in.nextDouble();  // use nextDouble() to read double
		      System.out.print("Enter your name: ");
		      name = in.next();        // use next() to read String
		   
		      // Display
		      System.out.print(num1+" "+num2+" "+name);
		      
		      
		      System.out.println("\nEnter a radius: ");
		      double rad = in.nextDouble();     
		   
		      // Display
		      System.out.println("The perimeter of the circle is: " + 2*rad*Math.PI);
		      System.out.println("The area of the circle is: " + rad*rad*Math.PI);
		      
		      
		      
		
	}
}

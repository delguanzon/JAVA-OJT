
public class ExtractingDigits {
	
	public void run()
	{
		int n = 123554;
		
		while (n > 0) {
		   int digit = n % 10;  // Extract the last digit
		   System.out.print(digit);
		   n = n / 10;
		   if(n !=0)
		   {
			   System.out.print(",");
		   }
		  
		             // Drop last digit and repeat the loop
		}
	}

}

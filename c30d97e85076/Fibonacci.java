
public class Fibonacci {

	public void run()
	{
		  int n = 3;          // the index n for F(n), starting from n=3
	      int fn;             // F(n) to be computed
	      int fnMinus1 = 1;   // F(n-1), init to F(2)
	      int fnMinus2 = 1;   // F(n-2), init to F(1)
	      int nMax = 20;      // maximum n, inclusive
	      
	   
	 
	      System.out.println("The first " + nMax + " Fibonacci numbers are:");
	      
	      System.out.printf(" " + fnMinus1 + " " + fnMinus2);
	      while (n <= nMax) {
	         // Compute F(n), print it and add to sum
	          
	         fn = fnMinus1 + fnMinus2;
	         fnMinus2 = fnMinus1;
	         fnMinus1 = fn; 
	         // Adjust the index n and shift the numbers\
	         n++;
	         System.out.print(" "+fn);
	      }
	 
	      // Compute and display the average (=sum/nMax)
	     
	}
}


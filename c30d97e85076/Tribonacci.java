
public class Tribonacci {

	public void run()
	{
		  int n = 3;          // the index n for F(n), starting from n=3
	      int fn;             // F(n) to be computed
	      int fnMinus1 = 1;   
	      int fnMinus2 = 1;  
	      int fnMinus3 = 2;   
	      int nMax = 20;      // maximum n, inclusive
	     
	      
	      System.out.println("The first " + nMax + " Fibonacci numbers are:");
	      
	      System.out.printf(" " + fnMinus1 + " " + fnMinus2 + " " + fnMinus3);
	      while (n <= nMax) {
	         // Compute F(n), print it and add to sum
	          
	         fn = fnMinus1 + fnMinus2 + fnMinus3;
	         fnMinus1 = fnMinus2;
	         fnMinus2 = fnMinus3;
	         fnMinus3 = fn;
	         
	          
	         // Adjust the index n and shift the numbers\
	         n++;
	         System.out.print(" "+fn);
	      }
	 
	      // Compute and display the average (=sum/nMax)
	     
	}
}

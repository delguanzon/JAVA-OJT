
public class ComputePi {

	
	public void run()
	{
		double sum = 0;
		int maxDenom = 10000000;
		for (int denom = 1; denom <=maxDenom ; denom = denom + 2) {
		   if (denom % 4 == 1) {
		      sum += (1.0 / (double)denom) ;
		   } else if (denom % 4 == 3) {
		      sum -= (1.0 / (double)denom) ;
		   } else {
		      System.out.println("The computer has gone crazy?!");
		   }
		}
		 System.out.println(sum*4);
		 System.out.println(Math.PI);
	}
	
}

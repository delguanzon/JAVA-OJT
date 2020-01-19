//import java.text.DecimalFormat;




public class HarmonicSum {
	
	public void run() {
		
		  //DecimalFormat df = new DecimalFormat("#.###############");
	      int maxDenominator = 50000;
	      double sumL2R = 0.0;    // sum from left-to-right
	      double sumR2L = 0.0;    // sum from right-to-left
	   
	      // for-loop for summing from left-to-right
	      for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
	         sumL2R += (1.0/(double)denominator);
	      }
	      System.out.println("The sum from left to right is: " +sumL2R);
	      // for-loop for summing from right-to-left   
	      
	      int minDenominator = 1;
	      for (int denominator = 50000; denominator >= minDenominator; --denominator) {
		     sumR2L += (1.0/(double)denominator);
		  }
	      
		      System.out.println("The sum from right to left is: " +sumR2L);
		      double diff = sumR2L - sumL2R;
		      System.out.printf("Their difference is: %1$.15f",diff); 
	   }

}

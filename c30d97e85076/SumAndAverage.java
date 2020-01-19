import java.text.DecimalFormat;


public class SumAndAverage {

	public void run()
	{
		      int sum = 0;          // store the accumulated sum, init to 0
		      double average;       // average in double
		      int lowerbound = 1;   // the lower bound to sum
		      int upperbound = 100; // the upper bound to sum
		      DecimalFormat df = new DecimalFormat("#.##");

		      for (int number = lowerbound; number <= upperbound; ++number) { // for loop
		         sum += number;     // same as "sum = sum + number"
		      }
		      // Compute average in double. Beware that int/int produces int.
		      average = (double)sum/ (double)upperbound;
		      // Print sum and average.
		      System.out.println("The sum is:" +sum);
		      System.out.println("The average is:" +average);
		      
		      //1
		      System.out.println("\n #1");
		      int number = lowerbound;
		      sum = 0;
		      while (number <= upperbound) {
		         sum += number;
		         ++number;
		      }
		      System.out.println("The sum is:" +sum);
		      System.out.println("The average is:" +average);
		      
		      //2
		      System.out.println("\n #2");
		      number = lowerbound;
		      sum = 0;
		      do {
		         sum += number;
		         ++number;
		      } while (number <= upperbound);
		      average = (double)sum/ (double)upperbound;
		      // Print sum and average.
		      System.out.println("The sum is:" +sum);
		      System.out.println("The average is:" +average);
		      
		      //3
		      System.out.println("\n #3");
		      System.out.println("They have differences when it comes to spelling");
		      
		      //4
		      System.out.println("\n #4");
		      int count = 0;   // count the number within the range, init to 0
		      sum = 0;
		      lowerbound = 111;   
		      upperbound = 8899;
		      for (number = lowerbound; number <= upperbound; ++number) {
		         sum += number;
		         ++count;
		      }
		      average = (double)sum/ (double)count;
		      // Print sum and average.
		      System.out.println("The sum is:" +sum);
		      System.out.println("The average is:" +df.format(average));
		      System.out.println("The range is:" +count);
		      
		      
		      //5
		      System.out.println("\n #5");
		      sum = 0;
		      lowerbound = 1;   
		      upperbound = 100;
		      count = 0;
		      for (number = lowerbound; number <= upperbound; ++number) {
		    	 if(number%2 != 0)
		    	 {
		    		 sum += number;
		    		 ++count;
		    	 }
		      }
		      average = (double)sum/ (double)count;
		      // Print sum and average.
		      System.out.println("The sum is:" +sum);
		      System.out.println("The average is:" +df.format(average));
		      
		      
		      //6
		      System.out.println("\n #6");
		      sum = 0;
		      count = 0;
		      for (number = lowerbound; number <= upperbound; ++number) {
		    	 if(number%7 == 0)
		    	 {
		    		 sum += number;	
		    		 ++count;
		    	 }
		      }
		      average = (double)sum/ (double)count;
		      // Print sum and average.
		      System.out.println("The sum is:" +sum);
		      System.out.println("The average is:" +df.format(average));
		      
		      
		      //7
		      System.out.println("\n #7");
		      sum = 0;
		      for (number = lowerbound; number <= upperbound; ++number) {
		    	 
		    		 sum += (number*number);
		    	 
		      }
		      average = (double)sum/ (double)upperbound;
		      // Print sum and average.
		      System.out.println("The sum is:" +sum);
		      System.out.println("The average is:" +df.format(average));
		      
	}         
		   
}

//System.out.println(number);

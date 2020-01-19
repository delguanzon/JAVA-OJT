
public class CozaLozaWoza {

	public void run()
	{
	
			      int lowerbound = 1;
			      int upperbound = 110;
			      for (int number = lowerbound; number <= upperbound; ++number) {
			    	  
			    	  
			    	 	 
					         // Print "Coza" if number is divisible by 3
					         if (number % 3 == 0) {   
					            System.out.print("Coza");
					         }
					         // Print "Loza" if number is divisible by 5
					         else if (number % 5 == 0) {
					            System.out.print("Loza");
					         }
					         // Print "Woza" if number is divisible by 7
					         else if (number % 7 == 0) {
						            System.out.print("Woza");
						         }
					         // Print the number if it is not divisible by 3, 5 and 7
					         else{
					        	 System.out.print(number);
					         }
					         
					         
					if (number % 11 == 0) System.out.print("\n");
					else System.out.print(" "); 
						    	 
			      }
			   
			
	}
}

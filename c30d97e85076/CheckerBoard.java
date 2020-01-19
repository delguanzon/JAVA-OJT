
public class CheckerBoard {

	public void run()
	{
		  

	      for (int row = 1; row <= 7 ; row++ ) {
	    	  System.out.println(); 
	         if ((row % 2) == 0) { 
	        	 System.out.print(" ");	            
	         }
	         for (int col = 1; col<= 7 ; col++ ) {
	        	 System.out.print("# ");
	         }
	        
	      }
	   }
	}


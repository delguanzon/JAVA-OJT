
public class TimeTable {

	public void run()
	{
		 for (int row = 1; row<=9; row++) {
	    	  System.out.println();
	         for (int col = 1; col <= 9 ; col++) {
	            System.out.print(" " +(row*col));	            
	         	}	 
	         }
		 
		 System.out.println("\n From 1 to 12:\n");
		 for (int row = 1; row<=12; row++) {
	    	  System.out.println();
	         for (int col = 1; col <= 12 ; col++) {
	            System.out.print(" " +(row*col));	            
	         	}	 
	         }
		 
	}	
}

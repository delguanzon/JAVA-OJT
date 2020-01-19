import java.util.Scanner;


public class Bin2Dec {

	public void run() {
	      String binStr;    // input binary string
	      int binStrLen;    // length of the input string
	      int dec = 0;      // equivalent decimal number
	      int ctr = 0;
	      char binChar;     // each individual char in the binary string
	    
	      System.out.println("Enter a Binary string: ");	      
	      binStr = new Scanner(System.in).next();
	      binStrLen = binStr.length();	 
	      
	      for(int x = binStrLen - 1; x >= 0 ; x--)
	      {
	    	  binChar = binStr.charAt(x);
	    	 if(binChar == '1' || binChar == '0')
	    	 {
	    	  dec += (binChar - '0') * Math.pow(2, ctr);
	    	  ctr++;
	    	 }
	    	 else
	    	 {
	    	   System.out.print("Error: Invalid Binary String "+binStr);
	    	 }
	      }
	      // Convert binary string into Decimal
	      System.out.print("The equivalent decimal number for binary " + binStr + " is "+ dec);
	      
	      
	       
	      
	      
	   }
}

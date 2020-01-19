import java.util.Scanner;


public class Hex2Dec {
	
	public void run() {
	      String hexStr;    // input binary string
	      int hexStrLen;    // length of the input string
	      int dec = 0;      // equivalent decimal number
	      int ctr = 0;
	      char hexChar;     // each individual char in the binary string
	      String res = "";
	    
	      System.out.println("Enter a Hexadecimal string: ");	      
	      hexStr = new Scanner(System.in).next();
	      hexStrLen = hexStr.length();	 
	      
	      for(int x = hexStrLen - 1; x >= 0 ; --x)
	      {
	    	 hexChar = hexStr.charAt(x);
	    	 
	    	 if(hexChar >= '0' && hexChar <= '9')
	    	 {	    	            
	    	  dec += (hexChar - '0') * Math.pow(16, ctr);
	    	  ctr++;
	    	  res = "The equivalent decimal number for binary " + hexStr + " is "+ dec;
	    	 }
	    	 else if(hexChar >= 'a' && hexChar <= 'f')
	    	 {	    	            
	    	  dec += (hexChar - 'a' + 10) * Math.pow(16, ctr);
	    	  ctr++;
	    	  res = "The equivalent decimal number for binary " + hexStr + " is "+ dec;
	    	 }
	    	 else if(hexChar >= 'A' && hexChar <= 'F')
	    	 {
	    	  dec += (hexChar - 'A' + 10) * Math.pow(16, ctr);
		      ctr++;
		      res = "The equivalent decimal number for binary " + hexStr + " is "+ dec;
	    	 }
	    	 else
	    	 {
	    		res =  "Error: Invalid Binary String "+hexStr;
	    		
	    	 }
	      }
	      System.out.print(res);
	      
	      
	       
	      
	      
	   }

}

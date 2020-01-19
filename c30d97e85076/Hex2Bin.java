import java.util.Scanner;


public class Hex2Bin {

	public void run()
	{
	
		String[] hexBits = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
		
		String hexStr;    // input binary string
	    int hexStrLen;    // length of the input string
	    int dec = 0;      // equivalent decimal number
	    int ctr = 0;
	    char hexChar;     // each individual char in the binary string
	    String res;
	    
	    System.out.println("Enter a Hexadecimal string: ");	      
	    hexStr = new Scanner(System.in).next();
	    hexStrLen = hexStr.length();	 
	    res = "The equivalent binary for hexadecimal " +hexStr+ " is ";
	    		
	    for(int x = 0; x <= hexStrLen - 1 ; ++x)   {
	    	 hexChar = hexStr.charAt(x);
	    	 
		     if(hexChar >= '0' && hexChar <= '9')     {	    	            
		      res += hexBits[hexChar - '0'] + " ";
		      ctr++;
		     }
		     else if(hexChar >= 'a' && hexChar <= 'f')    {	    	            
		      res += hexBits[hexChar - 'a' + 10] + " ";
		      ctr++;		      
		     }
		     else if(hexChar >= 'A' && hexChar <= 'F')   {
		    	 res += hexBits[hexChar - 'A' + 10] + " ";
			     ctr++;
		     }
		     else    {
		    	res =  "Error: Invalid Hexadecimal String "+hexStr;	    	
		     }
				
		
	    }
	    System.out.print(res);
	}
}

import java.util.Scanner;


public class ReverseString {
	
	public void run()
	{
		
		      String inStr;        // input String
		      int inStrLen;
		      int n=0; // length of the input String
		   
		      Scanner in = new Scanner(System.in);
		      System.out.print("Enter a String: ");
		      inStr = in.next();   // use next() to read String
		      inStrLen = inStr.length();
		      
		      
		      while(inStrLen != 0)
		      {
		       System.out.print(inStr.charAt(inStrLen-1));  
		       inStrLen--;
		      }
		   
		      // Use inStr.charAt(index) to extract character at 'index' from inStr
		      
		   
	}

}

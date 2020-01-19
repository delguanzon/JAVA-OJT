
public class SumDigits {

	public static void main (String[] args) {
	    int operand1;
	    int sum = 0;
	    String res = "The sum of digits ";
	  
	    
	    if (args.length != 1) {
	      System.err.println("Usage: java Arithmetic int");
	      return;
	    }
	   
	    for(int x = 0; x <= args[0].length() - 1; x++){
		    sum += args[0].charAt(x) - '0';
		    res += args[0].charAt(x);
		    if(x < args[0].length() - 1)
		    {
		    	res += " + ";
		    }
	    }
	   
	    System.out.print(res + " = " + sum);
	   
	  }
	
}

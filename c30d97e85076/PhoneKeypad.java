import java.util.Scanner;


public class PhoneKeypad {
	
	public void run()
	{
	 
	 Scanner in = new Scanner(System.in);
	 System.out.print("Enter a String: ");
	 String word = in.next().toLowerCase();
	 String inStr;        // input String
     int inStrLen;
	 char c;
	 
	 
	 //inStr = in.next();   // use next() to read String
     inStrLen = word.length();
	 while(inStrLen != 0)
     {
      c = word.charAt(inStrLen-1);
     if(c =='a' || c=='b' || c=='c')
 		 System.out.print("2");
 	 if(c=='d' || c=='e' || c=='f')
 		 System.out.print("3");
 	 if(c=='g' || c=='h' || c=='i')
 		 System.out.print("4");
 	 if(c=='j' || c=='k' || c=='l')
 		 System.out.print("5");
 	 if(c=='m' || c=='n' || c=='o')
 		 System.out.print("6");
 	 if(c=='p' || c=='q' || c == 'r' || c == 's')
 		 System.out.print("7");
 	 if(c=='t' || c=='u' || c=='v')
 		 System.out.print("8");
 	 if(c=='w' || c=='x' || c == 'y' || c == 'z')
 		 System.out.print("9");
 	 
      inStrLen--;
     }
	 
	 
	 
	}

}

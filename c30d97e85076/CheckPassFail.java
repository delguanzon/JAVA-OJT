/**
 * 
 */

/**
 * @author Yodel Guanzon
 *
 */
import java.util.*;

	
public class CheckPassFail { // saved as "CheckPassFail.java"
	
	
	
	
		   public static void main(String[] args) {
			   
			
		      int mark = 49;         // set the value of mark here!
		      System.out.println("The mark is " + mark);
		      
		      if (mark >= 50) {
		         System.out.println("PASS");
		      } else {
		         System.out.println("FAIL" );
		      }
		      
		      //System.in.read()
		    
		      Scanner c = new Scanner(System.in);
		      System.out.println("Select");
		      int x = c.nextInt();
		      switch(x)
		      {
		      	case 1: { 
		      		CheckOddEven yo = new CheckOddEven();
		      		yo.run();			  
		      	}break;
		      	case 2: { 
		      		PrintNumberInWord yo = new PrintNumberInWord();
		      		yo.run();			  
		      	}break;
		      	case 3: { 
		      		SumAndAverage yo = new SumAndAverage();
		      		yo.run();			  
		      	}break;
		      	case 4: { 
		      		Product1toN yo = new Product1toN();
		      		yo.run();			  
		      	}break;
		      	
		      	case 5: { 
		      		HarmonicSum yo = new HarmonicSum();
		      		yo.run();			  
		      	}break;
		      	case 6: { 
		      		ComputePi yo = new ComputePi();
		      		yo.run();			  
		      	}break;
		      	case 7: { 
		      		CozaLozaWoza yo = new CozaLozaWoza();
		      		yo.run();			  
		      	}break;
		      	case 8: { 
		      		Fibonacci yo = new Fibonacci();
		      		yo.run();			  
		      	}break;
		      	case 9: { 
		      		Tribonacci yo = new Tribonacci();
		      		yo.run();			  
		      	}break;
		      	case 10: { 
		      		ExtractingDigits yo = new ExtractingDigits();
		      		yo.run();			  
		      	}break;
		      	case 11: { 
		      		SquareBoard yo = new SquareBoard();
		      		yo.run();			  
		      	}break;
		      	
		      	case 12: { 
		      		CheckerBoard yo = new CheckerBoard();
		      		yo.run();			  
		      	}break;
		      	case 13: { 
		      		TimeTable yo = new TimeTable();
		      		yo.run();			  
		      	}break;
		      	
		      	case 14: { 
		      		KeyboardInputs yo = new KeyboardInputs();
		      		yo.run();			  
		      	}break;
		      	case 15: { 
		      		FileScanner yo = new FileScanner();
		      		yo.run();	
		      	}break;	
		      	case 16: { 
		      		ReverseString yo = new ReverseString();
		      		yo.run();	
		      	}break;
		      	case 17: { 
		      		PhoneKeypad yo = new PhoneKeypad();
		      		yo.run();	
		      	}break;
		      	
		      	case 18: { 
		      		PalindromicWord yo = new PalindromicWord();
		      		yo.run();	
		      	}break;
		      	
		      	case 19: { 
		      		Bin2Dec yo = new Bin2Dec();
		      		yo.run();	
		      	}break;
		      	
		      	case 20: { 
		      		Hex2Dec yo = new Hex2Dec();
		      		yo.run();	
		      	}break;
		      	
		      	case 21: { 
		      		GradesAverage yo = new GradesAverage();
		      		yo.run();	
		      	}break;
		      	
		      	case 22: { 
		      		Hex2Bin yo = new Hex2Bin();
		      		yo.run();	
		      	}break;
		      	
		      	case 23: { 
		      		GradeStatistics yo = new GradeStatistics();
		      		yo.run();	
		      	}break;
		      	
		      	default: break;
		      }
		      
		      
		   }
		}



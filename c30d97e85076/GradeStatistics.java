import java.text.DecimalFormat;
import java.util.Scanner;


public class GradeStatistics {
	
	static int[] grades;
	public void run()
	{
		readGrades();
		
		
	    System.out.println("The average is " + average());
	    System.out.println("The minimum is " + min());
	    System.out.println("The maximum is " + max());
	    System.out.println("The standard deviation is " + stdDev()); 
	}
	
	
	public static void readGrades() { 
		
		
		//DecimalFormat df = new DecimalFormat("#.##");
				
		System.out.print("Enter number of students: ");
		int ctr = new Scanner(System.in).nextInt();
		grades = new int[ctr];
		
		for(int x = 0; x <= ctr-1; x++)
		{
			
			
			System.out.print("Enter grade of Student " + (x+1) + " ");
			int grade=0;
			do
			{
			grade = new Scanner(System.in).nextInt();
			if(grade <=100 && grade >= 0){			
			grades[x] = grade;
			}
			else{
			 grade = 0;
			 System.out.print("Invalid Grade. Try Again!");
			 }
			}while(grade == 0);
		}
		
	}
	   
	   // Return the average value of int[] grades
	public static double average() { 
		
		double sum=0;
		
		for(int a : grades)
		{
			sum += a; 
		}
		
		return sum/grades.length;
		
	}
	   
	   // Return the maximum value of int[] grades
	public static int max() { 
		
		int _t = 0;
		for(int a: grades)
		{
			if(a != _t)
			{
				if(a > _t){
					_t = a;
				}
			
			}
		}
		
		return _t;
		
	}
	   
	   // Return the minimum value of int[] grades
	public static int min() { 
		int _t = 0;
		for(int a: grades)
		{
			if(_t == 0){
				_t = a;
			}
			else if(a < _t){
				_t = a;
			}
			
		}
		
		return _t;
	}
	   
	   // Return the standard deviation of the int[] grades
	public static double stdDev() { 
		double stsum = 0;
		for(int a : grades){
			
			stsum += Math.pow(average() - a, 2);
			
		}
			
		
		return Math.sqrt(stsum/grades.length);
		}
		
	}
	



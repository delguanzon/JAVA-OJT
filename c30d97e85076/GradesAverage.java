import java.text.DecimalFormat;
import java.util.Scanner;


public class GradesAverage {

	
	public void run()
	{
		
		int[] grades;
		int sum = 0;
		int ave = 0;
		DecimalFormat df = new DecimalFormat("#.##");
				
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
			if(grade <=100 && grade >= 50){			
			grades[x] = grade;
			}
			else{
			 grade = 0;
			 System.out.print("Invalid Grade. Try Again!");
			 }
			}while(grade == 0);
		}
		
		for(int a : grades)
		{
			sum += a; 
		}
		System.out.print("The average is: " + df.format((double)(sum/ctr)));
	}
	
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class GradesHistogram {

 public static int[] grades;
     // Declare an int array of grades, to be allocated later
  public static int[] bins = {0,0,0,0,0,0,0,0,0,0};
     // Declare and allocate an int array for histogram bins.
     // 10 bins for 0-9, 10-19,...., 90-100
  
  public static void main(String[] args) {
     readGrades("grades.in");
     computeHistogram();
     printHistogramHorizontal();
     printHistogramVertical();
  }
  
  // Read the grades from "filename", store in "grades" array.
  // Assume that the inputs are valid.
  public static void readGrades(String filename) {
	 
	  
	  try{
	  Scanner in = new Scanner(new File(filename));
	  int ctr = in.nextInt();	  
	  grades = new int[ctr];
	  	
	 for(int x = 0; x <= ctr-1; x++){
						
		  grades[x] = in.nextInt();
	  	}
	  }
	  catch(FileNotFoundException Ex){
			System.out.print("File Not Found!");
	  }
	  
	  
	  
	  
  }

  // Based on "grades" array, populate the "bins" array.  
  public static void computeHistogram() { 
	  for(int a: grades)
	  {
		  if(a>=0 && a<=9) bins[0] += 1;
		  else if(a>=10 && a<=19) bins[1] += 1;
		  else if(a>=20 && a<=29) bins[2] += 1;
		  else if(a>=30 && a<=39) bins[3] += 1;
		  else if(a>=40 && a<=49) bins[4] += 1;
		  else if(a>=50 && a<=59) bins[5] += 1;
		  else if(a>=60 && a<=69) bins[6] += 1;
		  else if(a>=70 && a<=79) bins[7] += 1;
		  else if(a>=80 && a<=89) bins[8] += 1;
		  else if(a>=90 && a<=100) bins[9] += 1;  		  
	  }
  }

  // Print histogram based on the "bins" array.
  public static void printHistogramHorizontal() { 
	  
	  int min = 0;
	  int max = 9;
	  for(int a: bins)	
	  {
		  
		  if(max < 99)		  {
			  System.out.print("\n" + min + " - " + max + ": " );
			  min += 10; max +=10;
		  }
		  else		  {
			  System.out.print("\n" + min + " - " + (max+1) + ": " ); 
		  }
		  for(int x=1; x<=a; x++)	{
			  
			  System.out.print("*");
		  }
	  }
	  
  }

  // Print histogram based on the "bins" array.
  public static void printHistogramVertical() {
	  
	  
	  int min = 0;
	  int max = 9;
	  int _t = 0;
	  int[] _tbin = bins;
	  for(int a: bins)	
	  {
		  
		  if(a != _t)
			{
				if(a > _t){
					_t = a;
				}
			
			}
	  }
	  
	  
	  
	  for(int rows = 0; rows<=_t; rows++){
		  System.out.println();
		  for(int a = 0; a< _tbin.length; a++){ 
				 			  
			  if(_tbin[a] < 1)
			  {
				  System.out.print(" ");
			  }
			  else
			  {
				  System.out.print("*");
				  _tbin[a]--;
			  }
			  
		  }
	   
	  }
	  System.out.print("\n");
	  for(int a = 0; a< _tbin.length; a++){ 
		  
		  System.out.print("" + min + "-" + max + " " );
		  min += 10; max +=10;
	  }
		 /* if(max < 99)		  {
			  System.out.print("\n" + min + " - " + max + ": " );
			  min += 10; max +=10;
		  }
		  else		  {
			  System.out.print("\n" + min + " - " + (max+1) + ": " ); 
		  }
		  for(int x=1; x<=a; x++)		  {
			  
			  System.out.print("*");
		  }*/
	  
	  
  }
  
  /*public static String printv(String str){
		if (str == null || str.equals(""))
	    {
	       return str;
	    }
	    else
	    {
	        System.out.println(str.charAt(0));
	        return printv(str.substring(1, str.length()));
	    }
	} */
	
}

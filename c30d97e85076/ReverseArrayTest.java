import java.util.Scanner;


public class ReverseArrayTest {

	public static void main(String args[])
	{
		System.out.print("Enter a set of integers separated: ");
		int[]set = new int[4];
		
		for(int x=0; x<4; x++)
		{
			set[x] = new Scanner(System.in).nextInt();
		}
		
		reverseArray(set);
	}
	
	public static void reverseArray(int[] intArray)
	{
		int temp = 0;
		
		//for(int a: intArray){
			for(int x = 0; x < intArray.length-1; x++)
			{
				
				temp = intArray[x];
				intArray[x] = intArray[intArray.length - 1 - x];
				intArray[intArray.length - 1 - x] = temp;
				
			}
		//}
		
		for(int a: intArray)
		{   System.out.print(a);
		
		}
	}
	
	
	
}



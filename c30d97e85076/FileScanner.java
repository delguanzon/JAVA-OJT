import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileScanner {
	
	public void run()
	{
		int num1;
		double num2;
		String name;
		double sum;
		try
		{
		
		Scanner in = new Scanner(new File("in.txt"));
		num1 = in.nextInt();
		num2 = in.nextDouble();
		name = in.next();
		System.out.print(num1+" "+num2+" "+name);
		}
		catch(FileNotFoundException Ex)
		{
			System.out.print("File Not Found!");
		}
		
		
		
	}

}

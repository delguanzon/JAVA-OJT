import java.util.Scanner;


public class PalindromicWord {
	
	
	public void run()
	{
		System.out.println("Enter a word");
		String word = extracted().next();
		this.run2(word);
		
	}

	private Scanner extracted() {
		return new Scanner(System.in);
	}
	
    public void run2(String word)
    {
    	char first = word.charAt(0);
		char last = word.charAt(word.length() -1);
		if(first == last)
		{
			try
			{
			this.run2(word.substring(1,word.length()-1));
			}
			catch(StringIndexOutOfBoundsException ex)
			{
			System.out.println("This is a palindrome");
			}			
		}
		else
		{
			System.out.println("This is not a palindrome.");
		}
		
    }
}

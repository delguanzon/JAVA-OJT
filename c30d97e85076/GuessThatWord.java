import java.util.Scanner;


public class GuessThatWord {
	
	
	public static void main(String args[])
	{
		String word = args[0];
	//	String word = args[0];
		char[] temp= word.toCharArray();
		String incognito = String.valueOf(hide(temp));
		temp = incognito.toCharArray();
		System.out.print(incognito);
		read(word.toCharArray(), temp);
		
		
	}
	
	public static String read(char[] c, char[] d)
	{
		

		int ctr =0;
		String g;
		boolean b;
			System.out.print("\n Enter a character: ");			
			do
			{
			g = new Scanner(System.in).next();			
			b = condition(c,g);			
			}while(b !=  true);		
			System.out.print(String.valueOf(reveal(c, g, d)));
		
		return "temp";
	}
	
	
	public static boolean condition(char[] temp, String g)
	{
		boolean b = false;
		
			for(int x = 0; x < temp.length ;x++){
				if(temp[x] == g.charAt(0))
					{
						b = true; break;
					}
					else b = false;
				
			}
	
		
		return b;
	}
	
	public static char[] reveal(char[] secret, String g, char[] temp)
	{
		int ctr = secret.length;
		//int index = 0;
			
		for(int x = 0; x < ctr ;x++){
			if(secret[x] == g.charAt(0))
				{
					temp[x] = g.charAt(0);
				}		
			
		}
		
		
		return temp;
	}

	public static char[] hide(char[] secret)
	{
		int ctr = secret.length;
		int index = 0;
		while(ctr >= 0)
		{
			
			index = (int) (Math.random()*secret.length);			
		    secret[index] = '_';
		    --ctr;
		}
		
		return secret;
	}
}

package OOP;

public class TestAuthor {

	public static void main(String args[])
	{
		Author author = new Author("Yods Guanzon", "yods@email.com" ,'m');
		System.out.println(author);
		author.setEmail("new@email.com");
		System.out.println(author);
	}
	
}

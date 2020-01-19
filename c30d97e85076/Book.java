package OOP;

public class Book {

	String name;
	Author[] author = new Author[2];
	double price;
	int qtyInStock = 0;
	
	public Book (String name, Author author, double price) {
		
	}
	
	public Book (String name, Author[] author, double price, int qtyInStock) {
	
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
		
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthor() {
		return author;
	}
	
	public String[] getAuthorName() {
		String[] a = new String[2];
		for(int x = 0; x<=author.length -1; x++){
			a[x] = author[x].name;
		}
		return a;
	}
	
	
	public void printAuthors()
	{
		for(String a : getAuthorName())
			System.out.println(a);
	}
	
	public char[] getAuthorGender() {
		char[] a = new char[2];
		for(int x = 0; x<=author.length -1; x++){
			a[x] = author[x].gender;
		}
		return a;
	}
	
	public String[] getAuthorEmail() {
		String[] a = new String[2];
		for(int x = 0; x<=author.length -1; x++){
			a[x] = author[x].email;
		}
		return a;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQtyInStock() {
		return qtyInStock;
	}
	
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
		
	public String toString()
	{
		System.out.print( "\""+name+ "\" by ");
		String[] a = new String[2];
		for(int x = 0; x<=author.length -1; x++){
			a[x] = author[x].toString();
			System.out.print(" " + a[x]);
		}
		return "";
		
	}
	
}

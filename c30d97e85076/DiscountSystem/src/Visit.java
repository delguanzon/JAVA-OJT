import java.util.Date;


public class Visit extends DiscountRate{

	protected Customer customer;
	protected Date date = new Date();
	protected double serviceExpense;
	protected double productExpense;
	protected double productPrice;
	protected double servicePrice;
	
	public Visit(Customer customer, Date date){
		this.customer = customer;
		this.date = date;
		
	}
	
	
	public String getName()
	{
		return customer.name;
	}
	
	public double getServiceExpense()
	{
		
		return serviceExpense;
	}
	
	public void setServiceExpense()
	{
		this.serviceExpense = servicePrice - (servicePrice * getServiceDiscountRate(customer.getMemberType()));
	}
	
	public double getProductExpense()
	{
		return productExpense;
	}
	
	public double getProductPrice(int qty, int prodType)
	{
		switch(prodType){
		case 1: return 150.00 * qty; 
		case 2: return 200.00 * qty; 
		case 3: return 100.00 * qty; 
		default: return 0;
		}	
		
	}
	
	public double getServicePrice(int qty, int prodType)
	{
		switch(prodType){
		case 1: return 350.00 * qty; 
		case 2: return 250.00 * qty; 
		case 3: return 400.00 * qty; 
		default: return 0;
		}	
		
	}
	
	
	public void setProductPrice(double productPrice){
		this.productPrice += productPrice;
	}
	
	
	public void setServicePrice(double servicePrice){
		this.servicePrice += servicePrice;
	}
	
	public void setProductExpense()
	{		
		this.productExpense = productPrice - (productPrice * getProductDiscountRate(customer.getMemberType()));
	}
	
	public double getTotalExpense() {
		return this.getProductExpense() + this.getServiceExpense(); 
	}
	
}

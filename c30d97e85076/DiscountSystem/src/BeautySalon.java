import java.util.Date;
import java.util.Scanner;


public class BeautySalon {

	static Date d = new Date();
	static Visit visit;
	
	public static void main(String[] args){
	
		System.out.println("Enter Customer Name:");
		String name = new Scanner(System.in).next();
		Customer customer = new Customer(name);
		visit = new Visit(customer, d );
		String ch = "t";
		
		do {
			
			
			System.out.println("Place Order: [1]Product [2]Service \n");
			int choice = new Scanner(System.in).nextInt();
			
			if(choice == 1) {
				
				System.out.println("Select Product: [1]Product1 [2]Product2 [3]Product3 \n");
				int prodc = new Scanner(System.in).nextInt();
				System.out.println("Enter Amount: ");
				int prodq = new Scanner(System.in).nextInt();
				visit.setProductPrice(visit.getProductPrice(prodq, prodc));
				System.out.println("Total Price: " + visit.productPrice);
						
			}
			
			else if(choice == 2) {
				
				System.out.println("Select Service: [1]Service1 [2]]Service2 [3]]Service3 \n");
				int prodc = new Scanner(System.in).nextInt();
				System.out.println("Enter Amount: ");
				int prodq = new Scanner(System.in).nextInt();
				visit.setServicePrice(visit.getServicePrice(prodq, prodc));
				System.out.println("Total Price: " + visit.servicePrice);
						
			}
			
			System.out.println("Do you want to place another transaction? y/n \n");
			ch = new Scanner(System.in).next();
		}while(ch.toLowerCase().equals("y"));
		
		
		System.out.println(ch.toLowerCase());
		if(customer.isMember() == false){
			System.out.println("Customer is not yet a member, do you want to register as a new member? Y/N" );
			String c = new Scanner(System.in).next();
			
			if(c.toLowerCase().equals("y"))
			{
				
				System.out.println("Select membership type: [1]Premium [2]Gold [3]Silver" );
				int x = new Scanner(System.in).nextInt();
				switch(x){
				case 1: { customer.setMemberType("premium"); break; }				
				case 2: { customer.setMemberType("gold"); break; }
				case 3: { customer.setMemberType("silver"); break; }
				default: customer.setMemberType("silver");
				
				}
				customer.setMember(true);
				System.out.println(customer.toString());
				computeExpenses();
			}
			else{ System.out.println(customer.toString()); 
			computeExpenses();}
			
		}
		else{
			computeExpenses();}
		
	}
	
	public static void computeExpenses()
	{		
		visit.setProductExpense();
		visit.setServiceExpense();
		System.out.println("Total Product Expense: " + visit.getProductExpense() );
		System.out.println("Total Service Expense: " + visit.getServiceExpense() );
		System.out.println("Total Expense: " + visit.getTotalExpense() );
	}
	
}

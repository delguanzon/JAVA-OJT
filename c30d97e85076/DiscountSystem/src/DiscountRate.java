
public class DiscountRate {

	protected static double serviceDiscountPremium = 0.2;
	protected static double serviceDiscountGold = 0.15;
	protected static double serviceDiscountSilver = 0.1;
	protected static double productDiscountPremium = 0.1;
	protected static double productDiscountGold= 0.1;
	protected static double productDiscountSilver= 0.1;
	
	protected static double getServiceDiscountRate(String type) {
		
		switch(type.toLowerCase()){
			case "premium": return serviceDiscountPremium; 
			case "gold": return serviceDiscountGold;
			case "silver":return serviceDiscountSilver;
			default: return 0.00;
		}
		
	}
	
	protected static double getProductDiscountRate(String type) {
		switch(type.toLowerCase()){
			case "premium": return productDiscountPremium; 
			case "gold": return productDiscountGold;
			case "silver":return productDiscountSilver;
			default: return 0.00;
			}		
	}
}

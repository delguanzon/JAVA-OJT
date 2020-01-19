
public class Customer {

	protected String name;
	protected boolean member = false;
	protected String memberType = "N/A";
	
	public Customer(String name) {
		this.name = name;
	}
	
	public String getName()	{
		return name;
	}
	
	public boolean isMember() {
		return member;
	}
	
	public void setMember(boolean member){
		
		this.member = member;
	}
	
	public String getMemberType()
	{
		return memberType;
	}
	
	public void setMemberType(String memberType) {
		
		this.memberType = memberType;
	}
	
	public String toString()
	{
		return " " + isMember() + "Customer name: " + name + "\n Membership Type: " + memberType;
	}
	
}

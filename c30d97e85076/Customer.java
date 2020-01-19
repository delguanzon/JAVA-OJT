package DiscountSystem;
import java.util.*;



public class Customer {
 
	String name;
	boolean member = false;
	String memType;
	
	public Customer(String name){	
	
	}
	
	public String getName(){
		return name;
	}
	
	public boolean isMember(){
		return member;
	}
	
	public void setMember(boolean member){
		this.member = member;
	}
	
	public boolean getMember(){
		return member;
	}
	
	public void setMemberType(String memType){
		this.memType = memType;
	}
	
	public boolean getMemberType(){
		return member;
	}
	
	
	public String toString(){
		return "Customer: " + name + "\nMembership Type: " + memType;
	}
}

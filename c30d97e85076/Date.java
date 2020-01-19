
public class Date {

	
	int year;
	int month;
	int day;
	
	String[] strMonths = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31 , 30, 31};
	
	public boolean isLeapYear(int year) {
		return true;
	}
	
	public boolean isValidDate(int year, int month, int day){
		return true;
	}
	
	public int getDayOfWeek(int year, int month, int day){
		
		return 0;
	}
	
	public Date(int year, int month, int day){
		
	}
	
	public void setDate(int year, int month, int day) {
		
	}
	
	public int getYear( ) {
		return year;
	}
	
	public int getMonth( ) {
		return month;
	}
	
	public int getDay( ) {
		return day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public String toString() {
		return "";
	}
	
}

package OOP;

import java.text.DecimalFormat;

public class MyTime {

	int hour;
	int minute;
	int second;
	DecimalFormat df = new DecimalFormat("00");
	
	public MyTime(int hour, int minute, int second)	{
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	
	public void setTime(int hour, int minute, int second){
		
		if(hour >= 0 && hour<=23) { this.hour = hour;
			if(minute >= 0 && minute<=59) { this.minute = minute;
				if(second >= 0 && second<=23) this.second = second;
				else System.out.println("IllegalArgumentException: Invalid hour, minute or second!");
		}	else System.out.println("IllegalArgumentException: Invalid hour, minute or second!");
		}else System.out.println("IllegalArgumentException: Invalid hour, minute or second!");
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setHour(int hour) {
		if(hour >= 0 && hour<=23) { 
			this.hour = hour;
		}else System.out.println("IllegalArgumentException: Invalid hour!");
	}
	
	public void setMinute(int minute) {
		if(minute >= 0 && minute<=59) { 
			this.minute = minute;
		}else System.out.println("IllegalArgumentException: Invalid minute!");
	}
	
	public void setSecond(int second) {
		if(second >= 0 && second<=59) { 
			this.second = second;
		}else System.out.println("IllegalArgumentException: Invalid second!");

	}
	
	public String toString() {
		return df.format(hour) + ":" + df.format(minute) + ":" + df.format(second);
	}
	
	public MyTime nextSecond(){
		
		if(second == 59)
		{
			
			if((minute+=1) == 60){
			minute = 0;
			if((hour +=1)== 24)
				{
				hour=0;
				}
			}
			second = 00;
		}
		else
		{
			second+=1;
		}
		return this;
		
	}
	
	public MyTime nextMinute(){
		

		if(minute == 59)
		{
			minute=00;
			hour += 1;
		}
		else
		{
			minute+=1;
		}
		return this;
		
	}

	public MyTime nextHour(){
		

		if(hour == 23)
		{
			hour = 00;
		}
		else
		{
			hour+=1;
		}
		return this;
		
	}
	
	public MyTime previousSecond(){
		
		if(second == 00)
		{	
			if((minute-=1) <= 00){
				minute = 59;
				if((hour -=1)<= 00)
					{
					hour=23;
					}
				}
			
			second = 59;
		}
		else
		{
			second-=1;
		}
		return this;
		
	}
	
	public MyTime previousMinute(){
	
		if(minute == 00)
			{
				second = 59;
				hour -= 1;
			}
			else
			{
				minute-=1;
			}
			return this;
		
	}

	public MyTime previousHour(){
	
		if(hour == 00)
			{
			
				hour = 23;
			}
			else
			{
				hour-=1;
			}
			return this;
		
	}
}

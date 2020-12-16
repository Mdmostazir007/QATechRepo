package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Print_date {
	
	

	public static void main(String[] args) {
 
	LocalDate todayDate =  LocalDate.now();
	System.out.println("Today date is :" + todayDate);
	
	
	LocalTime currentTime = LocalTime.now();
	System.out.println("Current Time is " + currentTime);
	
	
	LocalDateTime dateTime = LocalDateTime.now();
	System.out.println("Today Date & Time :"+dateTime );
		
		
		
		
	}

}

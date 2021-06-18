package p1.p2;
import java.time.LocalDateTime;


/*
 * Assignment-1 : Convert String to LocalDateTime
 * Assignment-2 : Convert LocalDateTime to String
 * Assignment-3 : Write a regular expression to validate vehicle Registration number of any state
 *                TS08HN9999
 *                KA08KL1234
 * Assignment-4 : Authenticate username and password using String
 *  
 */

public class DateTimeDemo {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		int hour=ldt.getHour();
		
		System.out.println("Hour :"+hour);
		
		
		
	}

}

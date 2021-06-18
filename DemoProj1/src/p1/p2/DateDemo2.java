package p1.p2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo2 {

	public static void main(String[] args) {
    
		//Gives LocalDate reference
		LocalDate ld = LocalDate.now();
		LocalDate ld3=ld.minusDays(1);
		LocalDate ld4=ld.plusDays(1);
		System.out.println("Todays Date:" + ld);
		System.out.println("Yesterdays Date:" + ld3);
		System.out.println("Tomorrows Date:" + ld4);

		//Gives current month
		int month = ld.getMonthValue();
		System.out.println("Current Month :" + month);

		//Gives Current Year
		int year = ld.getYear();
		System.out.println("Current Year :" + year);

		//Gives day of year
		int dayOfYear = ld.getDayOfYear();
		System.out.println("Day of year :" + dayOfYear);

		//Gives day of month
		int dayOfMonth = ld.getDayOfMonth();
		System.out.println("Today is :"+dayOfMonth);
		
		
		//Converting String to LocalDate
		String dob="09-17-1990";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM-dd-yyy");
		LocalDate ld1=LocalDate.parse(dob, formatter);
		
		System.out.println(ld1);
		
		System.out.println("******************************************");
		
		
		//Converting LocalDate to String 
		LocalDate ld2=LocalDate.now();
		DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		String s1=ld2.format(f);
		System.out.println(s1);
		
		
		
	}

}

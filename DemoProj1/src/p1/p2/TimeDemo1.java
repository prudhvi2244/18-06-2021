package p1.p2;
import java.time.LocalTime;

public class TimeDemo1 {

	public static void main(String[] args) {
		
		LocalTime lt1=LocalTime.now();
		System.out.println("Current Time:"+lt1);
		
		int hour=lt1.getHour();
		System.out.println("Current Hour:"+hour);
		
		int minute=lt1.getMinute();
		System.out.println("Current Minutes:"+minute);
		
		int second=lt1.getSecond();
		System.out.println("Current Second:"+second);
	}

}

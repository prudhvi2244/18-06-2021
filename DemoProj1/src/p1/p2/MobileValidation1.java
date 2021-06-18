package p1.p2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidation1 {

	public static void validateMobileNumber(String mobile) {
		//09346450004
		//919346450004
		//9346450004
		Pattern p = Pattern.compile("(91|0)?[6789][0-9]{9}");
		Matcher m = p.matcher(mobile);
		if (m.find() && m.group().equals(mobile)) {
			System.out.println("Mobile Number Valid:" + mobile);
		} else {
			System.out.println("Invalid Mobile Number:" + mobile);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Mobile:");
		String mobile = sc.next();

		MobileValidation1.validateMobileNumber(mobile);

	}

}

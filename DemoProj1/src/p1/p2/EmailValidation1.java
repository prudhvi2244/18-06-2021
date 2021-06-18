package p1.p2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation1 {

	public static void validateEmail(String email) {
		//raj.rajeev@capgemini.com
		Pattern p = Pattern.compile("[\\w._-]*[@]capgemini[.]com");
		Matcher m = p.matcher(email);
		if (m.find() && m.group().equals(email)) {
			System.out.println("Email is Valid:" + email);
		} else {
			System.out.println("Email is Invalid:" + email);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Email:");
		String email = sc.next();

		EmailValidation1.validateEmail(email);

	}

}

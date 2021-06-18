package p1.p2;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String city="Gangalore";
		System.out.println(city);
		
		String s1=city.replace('G','B');
		
		System.out.println(s1);
		
		String company=new String("capgemini");
		System.out.println("Company :"+company);
		
		String c1=company.substring(3);
		String c2=company.substring(3,8);
		System.out.println(c1);
		System.out.println(c2);
		
		String password="1234";
		String confirmpassword="1234";
		
		System.out.println(password.equals(confirmpassword));
		
		String username="Rajeev";
		String firstName="rajeev";
		
		System.out.println(username.equalsIgnoreCase(firstName));
		
		
		
		
	}
}

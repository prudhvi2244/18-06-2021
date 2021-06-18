package p1.p2;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String s1=new String();
		String s2=new String("Prudhvi");
		
		char[] ch= {'R','A','J'};
		
		String s3=new String(ch);
		
		byte[] b= {65,66,67,68};
		
		String s4=new String(b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("Length of String s1 :"+s1.length());
		
		System.out.println("Length of String s2 :"+s2.length());
		
		System.out.println("Length of String s3 :"+s3.length());
		
		System.out.println("Length of String s4 :"+s4.length());
		
		
		String n1=s3.toLowerCase();
		
		System.out.println("name is :"+n1);
		
		String s5=new String("capgemini");
		System.out.println(s5);
		
		String n2=s5.toUpperCase();
		System.out.println((n2));
		
		
		System.out.println("Character at index position :2 is:"+s5.charAt(2));
		
		
		String firstName="Raj";
		String lastName=" Prudhvi";
		
		String fullName=firstName.concat(lastName);
		System.out.println("First Name:"+firstName);
		System.out.println("Last Name:"+lastName);
		System.out.println("FullName:"+fullName);
		
		
		
		

	}

}

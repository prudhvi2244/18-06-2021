package p1.p2;

public class Student extends Person {
	
	public static void main(String[] args) {
		System.out.println("Student Details");
		Student s1=new Student();
		s1.id=1;
		s1.name="Prudhvi";
		s1.city="Bangalore";
		
		s1.details();
		
	}

}

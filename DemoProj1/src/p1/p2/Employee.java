package p1.p2;

public class Employee {

	public Employee() {

	}

	public Employee(int eid) {

	}

	public Employee(int eid, String ename) {

	}

	public Employee(int eid, String ename, String ecity) {

	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee(1);
		Employee e3 = new Employee(1, "Prudhvi");
		Employee e4 = new Employee(1, "Prudhvi", "Bangalore");

	}
}

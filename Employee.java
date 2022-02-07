package assignment;

public class Employee {
	int eid;
	String ename;

	public Employee() {
		eid = 105;
		ename = "priyanka";
	}

	public Employee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	public static void main(String[] args) {
		Employee obj = new Employee();
		System.out.println("User 1");
		System.out.println("Id: " + obj.eid);
		System.out.println("Name: " + obj.ename);
		Employee obj2 = new Employee(130, "sravani");
		System.out.println("User 2");
		System.out.println("Id: " + obj2.eid);
		System.out.println("Name: " + obj2.ename);
	}
}

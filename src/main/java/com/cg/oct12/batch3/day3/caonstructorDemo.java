package com.cg.oct12.batch3.day3;
public class caonstructorDemo {
	int eid;
	String name;
	double salary;

	public caonstructorDemo() {
		System.out.println("zero-args constructor");

	}

	public caonstructorDemo(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		System.out.println("parameterized constructor");
	}

}

 class ConstructorDemo {

	public static void main(String[] args) {

		caonstructorDemo emp = new caonstructorDemo();
		emp.eid = 101;
		emp.name = "Jeevan";
		emp.salary = 10.5;
		System.out.println(emp.eid + " " + emp.name + " " + emp.salary);

		caonstructorDemo emp2 = new caonstructorDemo();
		emp2.eid = 102;
		emp2.name = "Ajeet";
		emp2.salary = 10.6;
		System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);

		caonstructorDemo emp3 = new caonstructorDemo(103, "Sonu", 12.75);
		System.out.println(emp3.eid + " " + emp3.name + " " + emp3.salary);
	}


}

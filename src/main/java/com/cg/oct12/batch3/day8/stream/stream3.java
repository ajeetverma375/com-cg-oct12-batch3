package com.cg.oct12.batch3.day8.stream;

public class stream3 {

	public static void main(String[] args) 
	{  String str="abc",str1="abc";

		Employee emp = new Employee(101, "Sonu", 10.5);
		Employee emp2 = new Employee(102, "Tonu", 10.4);
		Employee emp3 = new Employee(101, "Sonu", 10.5);
 
		System.out.println(emp.equals(emp));
		System.out.println(emp.equals(emp2));
		System.out.println(emp.equals(emp3));
		System.out.println(emp==emp3);
		System.out.println(str.compareTo(str1));

//		System.out.println(emp.hashCode());
//		System.out.println(emp2.hashCode());
//		System.out.println(emp3.hashCode());

	}
}

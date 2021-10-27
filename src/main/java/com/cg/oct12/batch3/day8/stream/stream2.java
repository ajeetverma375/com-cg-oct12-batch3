package com.cg.oct12.batch3.day8.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class stream2 
{
	public static void main(String[] args) {

		// create a List of employees
		List<Employee> empList = new ArrayList<>();

		// create employees' data to process
		empList.add(new Employee(101, "Vaman", 10000));
		empList.add(new Employee(102, "Raman", 18000));
		empList.add(new Employee(103, "Soman", 12000));
		empList.add(new Employee(104, "Suman", 15000));
		empList.add(new Employee(105, "Lakshman", 20000));

		// print the list
		System.out.println(empList);

		Iterator<Employee> it = empList.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//1. covert list stream
		System.out.println("1. covert list stream");
		Stream<Employee> empStream=empList.stream();

		//using filter() to get specified data
		System.out.println("using filter() to get specified data");
		
		Stream<Employee> employeeWithMoreSalary= empStream.filter(e -> e.salary>15000);
		employeeWithMoreSalary.forEach(e -> System.out.println(e));
		
		// using collect(), convert to List
     //	System.out.println(empStream.collect(Collectors.toList()));
//
//   	// using filter() to get specified data
//   	System.out.println("\nUsing filter() to get specified data ");
//   	Stream<Employee> empWithMoreSal = empList.stream().filter(emp -> emp.salary > 15000);
//   	empWithMoreSal.forEach(emp -> System.out.println(emp.toString()));

//   	// using limit() to get limited data
//   	System.out.println("\nUsing limit() to get limited data");
//   	Stream<Employee> firstThreeEmp = empList.stream().limit(3);
//   	firstThreeEmp.forEach(emp -> System.out.println(emp.toString()));

//   	// using skip() to skip specified data - opposite of limit
//   	System.out.println("\nUsing skip() to skip specified data");
//   	Stream<Employee> skipFirstThreeEmp = empList.stream().skip(2L);
//   	skipFirstThreeEmp.forEach(emp -> System.out.println(emp.toString()));

//   	// using map() to increase salary
//   	System.out.println("\nUsing map() to increase salary");
//   	List<Double> salaryHike = empList.stream().map(emp -> emp.salary += 100).collect((Collectors.toList()));
//   	salaryHike.forEach(emp -> System.out.println(emp.toString()));

//   	// using map() to change case
//   	System.out.println("\nUsing map() to change case");
//   	List<String> nameInUpperCase = empList.stream().map(emp -> emp.name.toUpperCase()).collect((Collectors.toList()));
//   	nameInUpperCase.forEach(emp -> System.out.println(emp.toString()));
//   	
//   	// using IntStream to work with int values
//   	System.out.println("\nUsing IntStream to work with int values");
//   	IntStream myInts = IntStream.of(10, 20, 30);
//   	myInts.forEach(System.out::println);
//   	
//   	IntStream myInts2 = IntStream.rangeClosed(6, 10);
//   	myInts2.forEach(System.out::println);
//	
	}
}

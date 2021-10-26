package com.cg.oct12.batch3.day5;

public class EncapsulationDemo
{

	public static void main(String[] args) {
		
		Employee emp=new Employee();
	//	emp.salary=10000;
		System.out.println(emp.getSalary()+"\n"+emp.getFirstName()+"\n"+emp.getEid());
		emp.setSalary(10000);
		emp.setFirstName("akash");
		emp.setEid(201);
		System.out.println(emp.getSalary()+"\n"+emp.getFirstName()+"\n"+emp.getEid());
	}
}

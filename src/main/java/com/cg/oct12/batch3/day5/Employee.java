package com.cg.oct12.batch3.day5;

public class Employee 
{
	private int eid;
	private String firstName;
	private  double salary =8000;  
	// to make this field readable and writable we use  getter and setter method
		
	public double getSalary()				   	  {	return this.salary;	}
	public int getEid()  					      {	return eid;     	}
	public void setEid(int eid)                   {	this.eid = eid;	}
	public String getFirstName()                  {	return firstName;	}
	public void setFirstName(String firstName)    {	this.firstName = firstName;	}
	public void setSalary(double salary)          {	this.salary = salary;	}
	
public Employee()
{}


public Employee(int eid, String firstName, double salary)
{	super();
	this.eid = eid;
	this.firstName = firstName;
	this.salary = salary;
}

@Override
public String toString() 
{
	return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
}
}



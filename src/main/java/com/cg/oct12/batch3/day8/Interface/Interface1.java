package com.cg.oct12.batch3.day8.Interface;

// interface can contain- 0 or more abstract,static and default methods
interface FunIn
{
	public abstract void abstractMethod();
	public default void defaultMethod()
	{
		System.out.println("defaultMethod");
	}
	public default void anotherdefaultMethod()    //it is nonstatic mehod with concrete body
	{
		System.out.println("anotherdefaultMethod");
	}
	public static void staticMethod()
	{
		System.out.println("staticMethod");
	}
	public static void anotherstaticMethod()
	{
		System.out.println("anotherstaticMethod");
	}
}


public class Interface1 implements FunIn
{
public static void main(String[] args) {
	FunIn.staticMethod();
	Interface1 a=new Interface1();
	a.abstractMethod();
	a.anotherdefaultMethod();
	a.defaultMethod();
}
public void abstractMethod()
{
	System.out.println("abstarctmethods");}
}

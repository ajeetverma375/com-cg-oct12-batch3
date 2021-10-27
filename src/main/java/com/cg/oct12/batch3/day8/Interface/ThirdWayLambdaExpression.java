package com.cg.oct12.batch3.day8.Interface;
// 3 abstarct method usage - using lambda expression(only with function interface)
// fuctional interface  is one which contains only one abstract method and 
// that abstract method can used using lambda expression.

interface FunctionalInterface
{
	void abstractMethod();
	public static void staticmethod()
	{
		System.out.println("static method");
	}
}

public class ThirdWayLambdaExpression
{

	public static void main(String[] args)
	{
		FunctionalInterface obj=() -> 
		{
			System.out.println("functional interface");
		};
		obj.abstractMethod();
		FunctionalInterface.staticmethod();
	}
	
}

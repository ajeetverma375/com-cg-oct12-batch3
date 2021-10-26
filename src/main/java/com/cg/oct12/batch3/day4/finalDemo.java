package com.cg.oct12.batch3.day4;

public class finalDemo 
{
	public static final int num=10;
	private static int num2=90;

	public static void main(String[] args) 
	{System.out.println("start");

	System.out.println(finalDemo.num);
	System.out.println(finalDemo.num2);
//	finalDemo.num=30;   //ce as final cant be reinitialised
	finalDemo.num2=80;
	System.out.println(finalDemo.num2);
	
	}

}

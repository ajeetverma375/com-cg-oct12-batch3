package com.cg.oct12.batch3.day3;

import java.lang.reflect.Method;

public class p1day3 {

	public static void main(String[] args) 
	{
	System.out.println("start");
    p1day3 ref=new p1day3();
    ref.test(50,20);
    System.out.println(p1day3.text(10,20));
    System.out.println("end");
	}
  void test(int i,int j)
  {
	  System.out.println(i+j);
  }
  static int text(int i,int j)
  {
	  System.out.println("static test method");
  return i+j;
  }
//  static Method getObject()
//  {	  return Method;  }
}

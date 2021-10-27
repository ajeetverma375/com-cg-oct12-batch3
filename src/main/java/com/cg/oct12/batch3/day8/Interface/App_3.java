package com.cg.oct12.batch3.day8.Interface;


interface Funin5
{
	public abstract int getNum(int i,int j);
	
}
interface Funin3
{
	public abstract int getNum(int i);
	
}
interface Funin4
{
	public abstract int getNum();
	
}

public class App_3 {
	static int i=25;
public static void main(String[] args) {
	Funin5 obj = (int i,int j) -> i+j;
	Funin3 obj3 = (int i) -> i+10;
	Funin4 obj4 = () -> i;
	System.out.println(obj.getNum(10,20));
	System.out.println(obj3.getNum(10));
	System.out.println(obj4.getNum());
	
}
}

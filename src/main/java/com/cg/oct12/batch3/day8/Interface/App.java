package com.cg.oct12.batch3.day8.Interface;
//it is way 2 to use abstarct methods 
 interface FunIn {

	public abstract void abstractMethod();

	public abstract void anotherAbstractMethod();

}

public class App
{
	public static void main(String[] args) {

		FunIn obj = new FunIn() {
			@Override
			public void anotherAbstractMethod() {
				System.out.println("anotherAbstractMethod");
			}

			@Override
			public void abstractMethod() {
				System.out.println("abstractMethod");
			}
		};

		obj.abstractMethod();
		obj.anotherAbstractMethod();

	}
}

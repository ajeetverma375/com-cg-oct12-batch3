package com.cg.oct12.batch3.day8.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class DemoClass implements Callable<Integer> {

	private int num;

	public DemoClass() {
		super();
	}

	public DemoClass(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int localbariable = this.num;
		return localbariable;
	}

}

public class CallableWithArguments {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("Start");
		DemoClass demoClass = new DemoClass(10); //class object
		demoClass.setNum(15);                    // setting value with help of setter
		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future<Integer> f = ex.submit(demoClass); // constructor injection
		Integer result = f.get();// setter injection
		System.out.println(result);
		ex.shutdown();
		System.out.println("End");
	}
}
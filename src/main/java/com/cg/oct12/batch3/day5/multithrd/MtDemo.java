package com.cg.oct12.batch3.day5.multithrd;

public class MtDemo extends Thread    //class  currentThread
{
	public void myLoop()
	{
		for (int i = 1; i <= 10; i++)
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	
	public void demo()
	{
		System.out.println("demo");
	}
	@Override
	public void run() {
		this.myLoop();
		this.demo();
	}

	public static void main(String[] args) 
	{
         System.out.println("sacdsh   "+Thread.currentThread().getPriority());
         
         
         
         
         
		MtDemo obj = new MtDemo();
//		obj.myLoop();
		obj.start();
		try {
			obj.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		MtDemo obj2 = new MtDemo();
//		obj2.myLoop();
		obj2.start();
		MtDemo obj3 = new MtDemo();
//		obj2.myLoop();
		obj3.start();


	}
}

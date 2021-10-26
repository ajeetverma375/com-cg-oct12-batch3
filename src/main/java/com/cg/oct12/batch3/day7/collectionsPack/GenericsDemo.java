package com.cg.oct12.batch3.day7.collectionsPack;

import java.util.ArrayList;
import java.util.Iterator;
interface a
{
static void run()
{	
System.out.println("run interface");
}
}


public class GenericsDemo implements a
{
 public static void main(String[] args) 
 {
     String str1 = "Hello";

     String str2 = new String(str1);
     System.out.println(str1 + " equals " + str2 + " -> " +  str1.equals(str2));
     System.out.println(str1 + " == " + str2 + " -> " + (str1 ==str2));

	a b=new GenericsDemo();
	a.run();
	 ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
	     	a.add(20); 
	
		 a.add(40);
		System.out.println(a);
		Iterator<Integer> it=a.iterator();
		while(it.hasNext())
		{
			try {		
				Thread.sleep(500);
				System.out.println(it.next());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}
}

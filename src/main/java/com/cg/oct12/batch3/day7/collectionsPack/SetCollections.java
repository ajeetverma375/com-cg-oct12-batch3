package com.cg.oct12.batch3.day7.collectionsPack;

import java.util.HashSet;
import java.util.Iterator;

public class SetCollections {

	public static void main(String[] args)
	{
		HashSet h=new HashSet();
		h.add(-5);
		h.add(500);
		h.add(null);
		h.add("HI");
		h.add(0);
		h.add(-5);
		System.out.println(h);
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}

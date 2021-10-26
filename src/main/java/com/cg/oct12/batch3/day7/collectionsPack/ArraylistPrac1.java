package com.cg.oct12.batch3.day7.collectionsPack;

import java.util.ArrayList;

public class ArraylistPrac1 
{public static void main(String[] args) {
	

	ArrayList a = new ArrayList();
	a.add(10);
	a.add(null);
	a.add("abc");
	a.add("bcd");
	a.add("kl");
	a.add("zcv");
	a.add(new CollecPrac1());
	System.out.println(a);
	System.out.println(a.add(2));
	System.out.println(a.get(2));
	ArrayList MyList2 = new ArrayList();
	MyList2.add("ajeet");
	MyList2.addAll(a);
	System.out.println(MyList2);
	System.out.println(MyList2.removeAll(a));
	System.out.println(MyList2);
	System.out.println(MyList2.remove(0));
	System.out.println(MyList2);
	MyList2.add(0,"ajeet");
	System.out.println(MyList2);

}
}
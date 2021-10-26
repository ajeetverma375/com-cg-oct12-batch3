package com.cg.oct12.batch3.day7.collectionsPack;

import java.util.ArrayList;

public class CollecPrac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}

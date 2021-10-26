package com.cg.oct12.batch3;


import java.util.LinkedHashSet;

public class dublihash {

	public static void main(String[] args) {
     int[] a= {1,3,34,23,5,7,4,5,23,21};
     LinkedHashSet<Integer> b=new LinkedHashSet<Integer>();
     {for(int i=0;i<a.length;i++)
    	 b.add(a[i]);
     }
     for(int i:b)
     {System.out.print(i+" ");}
	}

}

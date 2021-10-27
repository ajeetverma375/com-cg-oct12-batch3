package com.cg.oct12.batch3.day8.Interface;

interface funin2
{
int addnums(int i,int j);	
}


public class app2 
{ public static void main(String[] args) {
//	funin2 obj = (int i,int j) ->
//	{
//		return i+j;
//	};
//   OR
	funin2 obj = (int i,int j) -> i+j;
	
	System.out.println(obj.addnums(10,20));
 }

}

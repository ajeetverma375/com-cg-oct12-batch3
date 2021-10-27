package com.cg.oct12.batch3.day8.Interface;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpresForeachLoop
{
	  public static void main(String[] args) 
	   {        
	        List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	          
	        list.forEach( (n)->System.out.println(n)  );  
	    }  
}

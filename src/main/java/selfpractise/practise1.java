package selfpractise;

import java.util.Scanner;

public class practise1 
{
	
	
	
	
	
  public static void main(String[] args)
 {Scanner sc=new Scanner (System.in);
	String str ="helloworld";
	String str1="world";
	System.out.println(str.replace(str1,""));
	System.out.println(str.contains(str1));  
	 
	  try
	  { String operator =sc.nextLine();
		  if (operator!="+")
		  {
			  throw new NullPointerException("dfjsd");
		  }
	  }catch (Exception e) 
	  {
	System.out.println(e);
	}
	  
}
  
    
}

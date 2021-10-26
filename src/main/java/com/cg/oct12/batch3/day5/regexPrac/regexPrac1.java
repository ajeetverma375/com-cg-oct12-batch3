package com.cg.oct12.batch3.day5.regexPrac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexPrac1 
{
	public static void main(String[] args)
	{
      String regex="[a-zA-Z0-9]{5}",input="a58bD"; //regex is pattern u want to match  input is value u want to test
      Pattern pattern =Pattern.compile(regex);  //static method
 //             var
      
      Matcher matcher = pattern.matcher(input);  //non static method
   //          var       ref.var.(matcher class)
      System.out.println(matcher.matches());
   //                    ref.var.(matches class)
    //  System.out.println(matcher.start());
      System.out.println(matcher.lookingAt()   );
      System.out.println(matcher.find());
      System.out.println(6-2+10%4+7);
	}
}

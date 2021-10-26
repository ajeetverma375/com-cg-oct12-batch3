package selfpractise;

import java.util.Scanner;

public class ScannerDelimiterExample1 
{
	 public static void main(String args[])
	 {   String str ="Hello! This is JavaTpoint." ;  
         Scanner scan = new Scanner(str);  
      //  System.out.println("" + scan.nextLine());  
         System.out.println("" +scan.delimiter()); 
     //    System.out.print("");  
         
         while (scan.hasNext()) 
 		{
 			System.out.println(scan.next());   // Printing the tokenized Strings
 		}
         scan.close();  
  }   

}

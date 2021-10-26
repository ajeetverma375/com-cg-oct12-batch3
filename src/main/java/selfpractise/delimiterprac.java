package selfpractise;

import java.util.Scanner;

public class delimiterprac
{
	public static void main(String args[]) 
	{	Scanner scan = new Scanner("Hello World!");
		System.out.println("Delimiter:" + scan.delimiter());
		while (scan.hasNext()) 
		{
			System.out.println(scan.next());   // Printing the tokenized Strings
		}
		scan.close();     	// Closing the scanner
	}

}

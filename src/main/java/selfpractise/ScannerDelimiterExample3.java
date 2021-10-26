package selfpractise;

import java.util.Scanner;

public class ScannerDelimiterExample3 
{
	public static void main(String args[])
	{
		System.out.print("Enter Your Number: ");
		Scanner scanner = new Scanner(System.in);
		Integer i = scanner.nextInt();
		System.out.println("Delimiter:" + scanner.delimiter());
		System.out.println("Number: " + i);
		scanner.close();
		System.out.println("Scanner Closed.");
	}

}

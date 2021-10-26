package com.cg.oct12.batch3;

public class OPER {
	public static void main(String[] args) {

		// arithmetic operators + - * / %
		// relational operators == != > >= < <=
		// && || !
		// ++ --
		// += -= *= /= %=

		int overs = 20;
		int remainingOvers = overs;
		
		remainingOvers = remainingOvers - 1;
		
		// remainingOvers -= 1;
		System.out.println(remainingOvers);

		// ternary operator : ?

		int num1 = 99, num2 = 10, largest;

//		if (salary1 > salary2) 
//			mySalary = salary1;
//		else 
//			mySalary = salary2;

		largest = (num1 > num2) ? num1 : num2;

		System.out.println(largest);
				

	}
}

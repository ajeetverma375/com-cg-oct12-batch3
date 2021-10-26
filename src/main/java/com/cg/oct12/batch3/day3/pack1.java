package com.cg.oct12.batch3.day3;

public class pack1 {
	public static int publicMember = 10;
	protected static int protectedMember = 20;
	static int packageMember = 30;
	private static int privateMember = 40;

	public static void main(String[] args) {

		System.out.println(pack1.publicMember);
		System.out.println(pack1.protectedMember);
		System.out.println(pack1.packageMember);
		System.out.println(pack1.privateMember);

	}
}

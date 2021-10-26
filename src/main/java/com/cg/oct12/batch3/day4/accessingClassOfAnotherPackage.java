package com.cg.oct12.batch3.day4;

import com.cg.oct12.batch3.day3.pack1;
import com.cg.oct12.batch3.day3.pack2;

public class accessingClassOfAnotherPackage {

public static void main(String[] args) {

	System.out.println(pack1.publicMember);
//	System.out.println(pack1.protectedMember);
//	System.out.println(pack1.packageMember);
//	System.out.println(pack1.privateMember);
	System.out.println(pack2.name);
}


}

package com.cg.oct12.batch3.day3;

public class p1day3bnk 
{ static String ifsc;
  double balance;
  void checkbalance()
  {
	  System.out.println(balance);
  }
  
  public static void main(String[] args) {
	
	  p1day3bnk ref= new p1day3bnk();
	  ref.balance=2000;
	  ref.checkbalance();
	  p1day3bnk.ifsc="hdfc93842";
	  System.out.println(p1day3bnk.ifsc);
}

}

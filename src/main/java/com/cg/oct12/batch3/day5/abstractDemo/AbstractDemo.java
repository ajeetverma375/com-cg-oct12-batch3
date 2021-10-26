package com.cg.oct12.batch3.day5.abstractDemo;

abstract class Rbibank {
	abstract public void kyc();
}

class Hdfc extends Rbibank {
	public void kyc() {
		System.out.println("aadhar ");
	}

	
}

class Sbi extends Rbibank{
	public void kyc() {
		System.out.println("pancard ");
	}
}

public class AbstractDemo {

	public static void main(String[] args) 
	{
      Hdfc obj=new Hdfc();
      obj.kyc();
      Sbi obj1=new Sbi();
      obj1.kyc();
      
      
	}

}

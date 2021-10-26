package com.cg.oct12.batch3.day5.inherit;

public class Samsung extends Smartphone {

	public static void main(String[] args) {
    Samsung obj=new Samsung();
    obj.sms();
    obj.call();
    obj.camera();
    obj.internet();
 //   obj.mms();
    obj.music();
    
    phone ref= new Smartphone();
    ref.sms();
    ref.call();
  //  ref.camera();
  //  ref.internet();
    ref.sms();
   // ref.music();
    Smartphone ref1=(Smartphone) ref;
    ref1.call();
    ref1.camera();
    ref1.internet();
    ref1.sms();
    ref1.music();
	}

}

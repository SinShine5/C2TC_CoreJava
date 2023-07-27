package com.cg.class2;

class Heptathlon{
	void displayclass() {
		System.out.println("This is Heptathlon Class");
	}
}
class HighJump extends Heptathlon{
	void event1() {
		System.out.println("This is HighJump Class");
	}
}
class Hurdles extends Heptathlon{
	void event2() {
		System.out.println("This is Hurdles Class");
	}
}
public class Hierarchy {

	public static void main(String[] args) {
		HighJump hj= new HighJump();
		Hurdles hr=new Hurdles();
		hj.displayclass();
		hj.event1();
		hr.displayclass();
		hr.event2();	
	}
}


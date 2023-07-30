package com.cg.day5;

class Heptathlon{
	void displayclass() {
		System.out.println("This is Heptathlon(Parent Class) class");
	}
}
class HighJump extends Heptathlon{
	void event1() {
		System.out.println("This is HighJump(Sub class 1) Class");
	}
}
class Hurdles extends Heptathlon{
	void event2() {
		System.out.println("This is Hurdles(Sub class 1) Class");
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


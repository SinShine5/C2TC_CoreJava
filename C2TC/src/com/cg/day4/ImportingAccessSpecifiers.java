package com.cg.day4;

public class ImportingAccessSpecifiers {
	public static void main(String []args) {
		Specifiers s = new Specifiers();
		AccessSpecifiers a = new AccessSpecifiers();
		
		//s.down();
		s.up();
		s.right();
		s.left();
	System.out.println("This is private variable : "+a);
	}
	
}

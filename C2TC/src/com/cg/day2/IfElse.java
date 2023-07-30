package com.cg.day2;

public class IfElse {

	public static void main(String[] args) {
		char a= 'A',b='S';
		int x=a,y=b;//type conversion
		if(a!=b) {
			System.out.println("Ascii value of : "+x);
			System.out.println("Ascii value of b : "+y);
			System.out.println("Ascii value of a+b : "+(a+b));
		}
		else {
			System.out.println("Ascii value of a-b : "+(a-b));
		}
	}

}

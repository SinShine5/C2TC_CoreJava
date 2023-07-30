package com.cg.day2;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		if(b==20) {
			System.out.println("If statement is executed");
		
		if(a<20) {
			System.out.println("Nested if in if statement is exectued");
		}
		else {
			System.out.println(" Nested else in if statement is executed");
		}
		}
		else {
			if(c>20) {
				System.out.println("Nested if in else statement is exectued");
			}
			else {
				System.out.println(" Nested else in else statement is executed");
			}
		}
	}

}

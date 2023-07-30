package com.cg.day2;

public class ContinueStatement {
	public static void main(String args[]) {
		int i;
	for(i=1;i<=5;i++) {
		System.out.println("FOR LOOP for Continue");
		System.out.println("The incremented"
				+ " value after each loop : "+i);
		while(i==3) { 
			continue;
		}
}
	}
}
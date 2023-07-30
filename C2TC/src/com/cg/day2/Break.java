package com.cg.day2;

public class Break{

	public static void main(String[] args) {
		int i;
		for(i=1;i<=5;i++) {
			System.out.println("FOR LOOP for a break");
			System.out.println("  *   *");
			System.out.println(";(_____) ;");
			System.out.println("The incremented value after each loop : "+i);
			System.out.println("  ");
			
		if(i==3){
			break;
		}
		}
		System.out.println(" ");
		System.out.println("The print statement after break");

}
}
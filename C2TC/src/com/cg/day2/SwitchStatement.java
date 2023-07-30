package com.cg.day2;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String []args) {
		char oper;
		int i=5,j=5,ans;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any operator : ");
		oper=sc.next().charAt(0);
		switch(oper) {
		case '+':
			ans=i+j;
			System.out.println("The added value of i and j is : "+ans);
			break;
		case '-':
			ans=i-j;
			System.out.println("The subtracted value of i and j is : "+ans);
			break;
		case '/':
			ans=i/j;
			System.out.println("The divided value of i and j is : "+ans);
			break;
		case '*':
			ans=i*j;
			System.out.println("The multiplied value of i and j is : "+ans);
			break;
		case '%':
			ans=i%j;
			System.out.println("The modulo value of i and j is : "+ans);
			break;
		default:
			System.out.println("Invalid Operator");
		}
	}

}

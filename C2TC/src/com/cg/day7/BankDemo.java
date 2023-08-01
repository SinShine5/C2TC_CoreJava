package com.cg.day7;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAmount sa =new SavingsAmount("Sin","Cuddalore",111,455567);
		System.out.println(sa);
		sa.deposit(111000);
		System.out.println(sa);
		sa.withdraw(5000);
		System.out.println(sa);
		sa.withdraw(7000);
		System.out.println(sa);
		sa.deposit(5000);
		System.out.println(sa);

	}

}
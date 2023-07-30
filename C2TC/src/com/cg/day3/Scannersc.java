package com.cg.day3;

import java.util.Scanner;
public class Scannersc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner("HI this is Scanner class...");
		int mark1 = s.nextInt();
		int mark2 = s.nextInt();
		int Avg = (mark1+mark2)/2;
		System.out.println("Average of two marks"+Avg);
		System.out.println(ss);
		s.close();
		ss.close();
	}
}
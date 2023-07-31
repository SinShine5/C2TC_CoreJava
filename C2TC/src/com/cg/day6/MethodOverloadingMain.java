package com.cg.day6;

import com.cg.day6.MethodOverloading;

public class MethodOverloadingMain {
	public static void main(String []args) {
		MethodOverloading m = new MethodOverloading();
		System.out.println("int add(int a,int b, int c) : "+(MethodOverloading.add(12,13,11)));
		System.out.println("float add(float a,float b) : "+(MethodOverloading.add(11.5f, 12.54f)));
		System.out.println("float add(float a,float b) : "+(MethodOverloading.add(10.5f, 14)));
		System.out.println("float add(float a,float b) : "+(MethodOverloading.add(15, 15.54f)));
	}
}

package com.cg.day5;

class AppleIPhone{
	void launchedearly() {
		System.out.println("128 Mega Pixel 32GB Storage"
				+ " (Parent class)");
	}
}
class AppleIPhonePro extends AppleIPhone{
	void launchedthen() {
		System.out.println("128 Mega Pixel 64GB Storage"
				+ "(Sub class1 of parent class)");
	}
}
class AppleIPhoneProMax extends AppleIPhonePro {
	void launchednow() {
		System.out.println("128 Mega Pixel 128GB Storage"
				+ "(Sub class2 of sub class1)");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		AppleIPhoneProMax m=new AppleIPhoneProMax();
		m.launchedearly();
		m.launchedthen();
		m.launchednow();
		
	}
}

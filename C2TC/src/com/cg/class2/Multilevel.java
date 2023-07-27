package com.cg.class2;

class AppleIPhone{
	void launchedearly() {
		System.out.println("128 Mega Pixel 32GB Storage");
	}
}
class AppleIPhonePro extends AppleIPhone{
	void launchedthen() {
		System.out.println("128 Mega Pixel 64GB Storage");
	}
}
class AppleIPhoneProMax extends AppleIPhonePro {
	void launchednow() {
		System.out.println("128 Mega Pixel 128GB Storage");
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

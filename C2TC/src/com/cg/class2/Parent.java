package com.cg.class2;
class OutdoorGames{
	void select() {
		System.out.println("This is Outdoor Games Class");
	}
}
class Badminton extends OutdoorGames{
	void play() {
		System.out.println("This is Badminton Class");
	}
}
public class Parent {

	public static void main(String[] args) {
		Badminton b=new Badminton();
		b.select();
		b.play();	
	}

}

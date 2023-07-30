
package com.cg.day5;

class OutdoorGames{
	void select() {
		System.out.println("This is Outdoor"
				+ " Game Class(Parent class");
	}
}
class Badminton extends OutdoorGames{
	void play() {
		System.out.println("This is Badminton"
				+ " Class(Sub class)");
	}
}
public class Single {

	public static void main(String[] args) {
		Badminton b=new Badminton();
		b.select();
		b.play();	
	}

}
package com.cg.day4;

import com.cg.day4.ImportingAccessSpecifiers;


    public class AccessSpecifiers {
		private int a=78;
		public int b=12;
		int c=37;
		protected int d=27;
}	
}

class Specifiers{
private void down() {
	System.out.println("This is a private method");

}

public void up() {
	System.out.println("This is a public method");

}

 void right() {
	System.out.println("This is a default method");

 }
 
protected void left() {
	System.out.println("This is a protected method");
}

}
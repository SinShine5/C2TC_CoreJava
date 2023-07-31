package com.cg.day4;

//import com.cg.day4.ImportingAccessSpecifiers;

     public class AccessSpecifiers {
		private int a;
		public int b;
		int c;
		protected int d;
		
     AccessSpecifiers(){
    	 a=78;
 		 b=12;
 		c=37;
 		d=27;
    	 
     }
     AccessSpecifiers(int a, int b,int c,int d){
    	this.a = a;
 		 this.b = b;
 		this.c = c;
 		this.d = d;
    	 
     }

@Override
public String toString() {
	return " output [This is private variable "
			+ "a=" + a + ",This is public variable b="
			+ b + ",This is default variable c=" 
			+ c + ",This is protected variable d=" 
			+ d + "]";
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

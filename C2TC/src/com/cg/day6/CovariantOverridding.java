package com.cg.day6;

class ColorCovariant{
	 ColorCovariant getColor() {
     System.out.println("Color Covatiant Class");
     ColorCovariant c = new ColorCovariant();
	 return c;
	}
}
class RedCovariant extends ColorCovariant{
		 RedCovariant getColor() {
		 System.out.println("Red Covariant Class");
		 RedCovariant r = new RedCovariant();
		 return r;
		
		 }
		}


public class CovariantOverridding {
	public static void main(String []args) {
		ColorCovariant c = new ColorCovariant();
		RedCovariant r = new RedCovariant();
		c.getColor();
		r.getColor();
		
		
	}

}

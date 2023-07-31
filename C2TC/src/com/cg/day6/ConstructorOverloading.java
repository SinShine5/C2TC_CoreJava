package com.cg.day6;
import com.cg.day6.Point;

public class ConstructorOverloading {
public static void main(String []args) {
	Point p = new Point();
	System.out.println(p);
	p = new Point(5.16f,12.3f);
	System.out.println(p);
	p = new Point(33.16f,55.6f);
	System.out.println(p);
	
	}
}

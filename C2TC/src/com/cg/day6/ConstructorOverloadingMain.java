package com.cg.day6;
import com.cg.day6.ConstructorOverloadingPoint;

public class ConstructorOverloadingMain {
public static void main(String []args) {
	ConstructorOverloadingPoint p = new ConstructorOverloadingPoint();
	System.out.println(p);
	p = new ConstructorOverloadingPoint(5.16f,12.3f);
	System.out.println(p);
	p = new ConstructorOverloadingPoint(33.16f,55.6f);
	System.out.println(p);
	
	}
}

package com.cg.day3;
//encapsule class
import com.cg.day3.Encapsulation;

public class Encapsule {

	public static void main(String[] args) {
		Encapsulation e= new Encapsulation();
		e.setName("Sindhu");
		e.setId(111);
		e.setEmail("sindhu@gmail.com");
		e.setNum(987654321);
		System.out.println(e.toString());
	}
}
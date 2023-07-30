package com.cg.day3;

public class Constructors {
	String name ;
	int age;
	Constructors(){
		super();
		System.out.println("This is "
				+ "the default Constructor..");	
	}
	Constructors(String name, int age){
		super();
		System.out.println("This is parametrized "
		  + "Constructor and the name is : "+(name));
		System.out.println("This is parametrized "
		  + "Constructor and the age is : "+(age));
	}
	public static void main(String[] args) {
		Constructors cons = new Constructors();
		Constructors cc = new Constructors("Sindhu",20);
	}
	
	}


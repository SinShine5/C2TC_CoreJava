package com.cg.day7;

class Str{
	String s="SinDHu";
	String s1=s;
	String sr = new String("SUchIel");
	public void Str(){
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.toCharArray());
		System.out.println(s.length());
		System.out.println(s.hashCode());
		System.out.println(sr.equals(s1));
		System.out.println(sr.equalsIgnoreCase(s1));
		System.out.println(sr.toUpperCase());
		System.out.println(sr.toLowerCase());
		System.out.println(sr.toCharArray());
		System.out.println(sr.length());
		System.out.println(sr.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(sr.hashCode());
		System.out.println(s.codePointAt(5));
		System.out.println(sr.codePointAt(4));
		System.out.println(s.trim());
		
	}
}
public class StringsMethods {
	public static void main(String[]args) {
		Str ss = new Str();
		ss.Str();
	}

}

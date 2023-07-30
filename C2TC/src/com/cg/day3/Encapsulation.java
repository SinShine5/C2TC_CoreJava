package com.cg.day3;

public final class Encapsulation {
	private String name;
	private int id;
	private String email;
	private int num;
	
public Encapsulation() {
	super();
}
public Encapsulation(String name, int id, String email, int num) {
	super();
	this.name = name;
	this.id = id;
	this.email = email;
	this.num = num;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}

@Override
public String toString() {
	return "Encapsuled [name=" + name + ", id=" + id + ", email=" + email + ", num=" + num + "]";
}
}
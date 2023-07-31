package com.cg.day6;

public class Point {
	private float x;
	private float y;
	
Point(){
	x=34.5f;
	y=32.4f;
}
Point(float x){
	this.x = x;
	this.y = y;
}
Point(float x,float y){
	this.x = x;
	this.y = y;
}
@Override
public String toString() {
	return "Point [x=" + x + ", y=" + y + "]";
}
}
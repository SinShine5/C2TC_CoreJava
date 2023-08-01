package com.cg.day6;

class ConstructorOverloadingPoint {
	private float x;
	private float y;
	
ConstructorOverloadingPoint(){
	x=34.5f;
	y=32.4f;
}
ConstructorOverloadingPoint(float x){
	this.x = x;
	this.y = y;
}
ConstructorOverloadingPoint(float x,float y){
	this.x = x;
	this.y = y;
}
@Override
public String toString() {
	return "ConstructorOverloadingPoint [x=" + x + ", y=" + y + "]";
}
}
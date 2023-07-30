package com.cg.day2;

public class Foreachloop {

	public static void main(String[] args) {
		//used for only arrays and collections 
		 int a[] = {1,5,7,9,8,4,};
		 int b[] = {3,11,5};
		for (int i : a) {
			for (int j : b){
				System.out.print(j);
			}
			System.out.println(i);

		}
	}

}

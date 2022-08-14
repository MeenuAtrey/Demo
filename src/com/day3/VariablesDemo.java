package com.day3;

public class VariablesDemo {
	
	static int x=100; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(x);

	}
	
	static {
		System.out.println("Inside static block1");      // static code block which gets called before main method
	}
	
	static {
		System.out.println("Inside static block2");
	}

}

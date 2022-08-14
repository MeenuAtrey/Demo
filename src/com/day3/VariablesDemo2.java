package com.day3;

public class VariablesDemo2 {
	
	static int x=100;
	{
		System.out.println("Inside non static block1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(x);
	VariablesDemo2 obj = new VariablesDemo2();
	System.out.println(obj.x);
	System.out.println(new VariablesDemo2().x);

	}

}

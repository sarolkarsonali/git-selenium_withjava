package com.pack;

public class A {
	private int x=56;
	
	public void mgs() {
		System.out.println("variable"+x);
		testDemo();
	}
	
	 private void testDemo() {
		System.out.println("it cant be access to another class");
	}
	 
	 int getX() {
		 return x;
	 }
	 
}

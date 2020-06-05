package com.hello;
import com.javabykiran.corejava.D;
public class C {

	public void m1() {
		System.out.println("hello");
		D d= new D();
		d.m2();
		
	}
	
	public static void main(String[] args) {
		C c= new C();
		c.m1();
	}
}

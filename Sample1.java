package com.xyz;

public class Sample1 {
	String name;
	
	void display() {
		System.out.println(name);
	}
	public static void main (String args[]) {
		Sample1 s = new Sample1();
		s.name="Aditi";
		s.display();
	}
}
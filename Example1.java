package com.xyz;

public class Example1 {
	
	int x;
	int y;
	String name;
	static long count;  // class variable
	
	public static void main(String args[]) {
		int z=0;
		
		Example1 e1 = new Example1();
		
		e1.name = "ABC";
		  System.out.println(e1.name);
		  
		count = 1;
		System.out.println(count);
		
		e1.name = "XYZ";
		System.out.println(e1.name);
		
		count =2;
		System.out.println(count);   // static variables are the class variables and are global in nature.
		
		
		
	    System.out.println(e1.name);
		System.out.println(z);
		System.out.println(count);
		
		
	}
	
	
	

}

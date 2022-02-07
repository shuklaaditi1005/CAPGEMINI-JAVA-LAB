package com.xyz;

public class PolyExample {
		
	//Method overloading
	
	public static void main(String args[]) {
		//PolyEx e = new PolyEx();  // parent object
		Exam e1 = new Exam();       // child
		System.out.println(e1.add(1, 1));
		System.out.println(e1.add(1, 1.0f));
		System.out.println(e1.add("abc", "1"));
		System.out.println(e1.add(1.0f, 2f));	
		System.out.println(e1.add(1.0f, 2f, (int)3f));	// casting in java
		
		
		// at line 14, we passed int to an float...
		short s=1;
		
		// Casting happens in 2 ways
		// upcasting and downcasting
		
		// upcasting: means the smaller primitive data type moving to upper end data type..//this happens automatically
		
		// downcasting:
		// moving a bigger primitive type to a smaller one...example float moving to short..
		// double moving to int or float
		
		// (specify the type to which you cast to)
		
		
	}
	

}


class PolyEx{
	
	// The return type is not considered!
	
		int add(int a, int b) {
			return a+b;
		}
		
		
		float add(int a, float b) {
			
			return a + b;
		}
		
		
		String add(String a, String b) {
			return a + b;
		}
		
		
	
}



 class Exam extends PolyEx{

	 //override
	 int add(int a, int b) {  // Signature
		 System.out.println("in child");
		 return a+b;
	 }
	 
	 
	// overload
	float add(float a, float b, int c) {
			 return a + b + c;
		 }
		
	 
	 
	 // overload
	 float add(float a, float b) {
		 return a + b;
	 }
	
}


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
	 
	 float add(float a, float b) {
		 return a + b;
	 }
	
}


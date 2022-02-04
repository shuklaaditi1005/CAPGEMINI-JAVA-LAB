package com.xyz;

//import com.abc.Student;


// public, private, protected, default : these are the 4 access modifiers we have!

public class Student {
	
	// instance variables
	String name;   
	int age;
	String address;
	
	
	
	// your object is an instance of the class. It means it is a blueprint of your class.
	
	public static void main(String args[]) {
		
		Student s = new Student();  // Constructor
		s.address = "Kanpur";
		s.age = 25;
		s.name = "CapG";
		
		System.out.println(s.address + " " + s.name);
		
				
				
				
	}
	
	

}

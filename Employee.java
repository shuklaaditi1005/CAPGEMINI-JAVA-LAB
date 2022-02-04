package com.xyz;

// implicitly this Employee is inheriting Object class.
public class Employee extends Object {

	 public static void main(String args[]) {
			
			EmployeeCheck e = new EmployeeCheck();  // Its a constructor - default one supplied by JVM
			
		//	EmployeeCheck e = new EmployeeCheck("Avijit", 30, 15000f, "xyz");
			// they are the arguments 
			
			e.display();
			
		
			
		}

	
}



 class EmployeeCheck{
	
	 
		// what is an import statement?
		// to import classes from other package  // java provides default package java.lang.*
		
		// what is a package? // namespace?
		
		
		private String name = "Vivek";
		private int age = 25;
		private float salary = 20000f;
		private String address = "ABCDE";
		
		//private String promotionInfo;    // contains data whether employee is promoted or not!
		
		EmployeeCheck(String n, int a, float s, String add){   // parameters
			name = n;
			age = a;
			salary = s;
			address = add;
			
			
		}
		
		
		EmployeeCheck(){
			name = "abc";
		}
		
		
		
		
		void display() {
			
			System.out.println(name + " " + age + " " + salary);
		}

	 
	 
}



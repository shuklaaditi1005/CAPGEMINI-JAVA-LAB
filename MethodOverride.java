package com.xyz;


// Method overriding is associated with Inheritance.
// Final methods cannot be overridden
// The access modifiers when overriding cannot become more strict..
// private methods cannot be overridden
// When overriding the return type or the SIGNATURE of the method should be same. Again the return type can go
// hierarchial but not stricter or should be subtypes only.
// There is one more associated to the exception handling



public class MethodOverride {
	
	public static void main(String args[]) {
		
	}
	

}


class M1 {
	
	protected M1 display(String s) {
		System.out.println(s);
		return new M1();
	}
	
	
	
}


//Access modifiers:
// public - protected - default - private


class M2 extends M1{
	
	// overriding
	public M2 display(String s) {
		System.out.println(s);
		return new M2();
	}
	
	
	
}
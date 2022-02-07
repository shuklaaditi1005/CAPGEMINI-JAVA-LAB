package com.xyz;

class Fruit1{}
class Vehicle1{}

public class Day2_19 {
	public static void main(String[] args)
	{
		Fruit1 apple = new Fruit1();
		Vehicle1 car = new Vehicle1();
		
		System.out.println("car IS A Fruit: " + (car instanceof Vehicle1));
	}
}


package com.naver;

public class MainEx {
	
	int c;
	
	public MainEx() {
		boolean b = false;
		System.out.println(b);
		c=44;
		
	}
	
	public static void main(String[] args) {
		
		char c = 6;
		System.out.println(c);
		System.out.println("::::::::::");
		long longVa = 3000000000L;
		System.out.println(longVa);
		System.out.println("::::::::::");
		Dog dog = new Dog(); 
		System.out.println(dog);
		
		int i = 56;
		System.out.println(i);
		System.out.println("::::::::::::");
		boolean b = false;
		System.out.println(b);
		
		System.out.println("#############");
		Test test = new Test();
		System.out.println(test);
	}
}
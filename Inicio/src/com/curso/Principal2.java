package com.curso;

public class Principal2 {

	public static void main(String[] args) {

		String x = "Hello";
		String y = "Hello";
		String z = "Hello";
		
		// ==
		
		System.out.println(x == y); //true

		String w = new String("Hello");
		
		System.out.println(x == w); //false

		String v = new String("Hello");

		System.out.println(w == v); //false

		StringBuilder sb1 = new StringBuilder("Hola");
		StringBuilder sb2 = new StringBuilder("Hola");
	
		Integer i1 = 500;
		Integer i2 = 500;
		
		System.out.println(i1 == i2); //false
		
		Integer i3 = 100;
		Integer i4 = 100;
		
		System.out.println(i3 == i4); //true

	
	}

}

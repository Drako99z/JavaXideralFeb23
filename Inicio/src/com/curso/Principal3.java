package com.curso;

public class Principal3 {

	public static void main(String[] args) {

		//INMUTABLE
		String x = "Hello";
		
		x = "World";
		
		System.out.println(x);
		
		//x = null;
		
		//MUTABLE
		StringBuilder sb1 = new StringBuilder("Hola");
		
		sb1 = sb1.append(" Mundo");
		
		System.out.println(sb1); 
		
	
	}

}

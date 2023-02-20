package com.curso;

public class Principal5 {

	public static void main(String[] args) {

			StringBuilder sb1 = new StringBuilder("Hola");
			StringBuilder sb2 = new StringBuilder("Hola");

			System.out.println(sb1.equals(sb2));
			
			String s1 = sb1.toString();
			String s2 = sb2.toString();
			
			System.out.println(s1.equals(s2));
			
			System.out.println(s1==s2);
			
	}

}

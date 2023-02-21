package com.curso;

public class Principal {

	public static void main(String[] args) {
		String one, two;
		//0
		one = new String("a");
		two = new String("b");
		//2
		one = two;
		System.gc();
		//2 //1
		String three = one;
		one = null;
		//2 //1 
	}

}

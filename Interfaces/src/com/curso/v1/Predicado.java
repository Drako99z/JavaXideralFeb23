package com.curso.v1;

public interface Predicado {
	
	//public static final
	
	int x = 5;
	String cadena = "Hola";
	StringBuilder sb = new StringBuilder("Hello");
	
	//abstract public
	boolean probar(String s);
	
	//VERSION 8 
	//METODOS CON COMPORTAMIENTO public
	static void and() {
		System.out.println("and");
	}
	
	default void or() {
		System.out.println("or");
	}
	
	//VERSION 9
	//METODOS PRIVADOS CON COMPORTAMIENTO
	private void otroAnd() {
		System.out.println("otro and");
	}
	
	private static void otroOr() {
		System.out.println("otro or");
	}

}

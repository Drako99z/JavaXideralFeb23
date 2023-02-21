package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		String cadena = "Hola"; //INMUTABLE
		StringBuilder sb = new StringBuilder("Hello"); //MUTABLE
		int x = 5; //PRIMITIVO
		
		System.out.println(Integer.toHexString(cadena.hashCode()));
		
		transforma(cadena,sb,x);
		
		
	}

	static void transforma(String cadena, StringBuilder sb, int x) {
		
		cadena.concat(" Mundo");
		sb.append(" World");
		x += 5;
		
				
	}

}

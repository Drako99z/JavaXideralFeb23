package com.curso;

public class Principal2 {
	
	public static void main (String... patitos) {

		StringBuilder nombre = new StringBuilder("Tercio");

		for(int x = 1; x<9; x++) {
			nombre.delete(6, 7).append(x);
			System.out.println(nombre);
		}
	
	}

}

package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Alumno a1 = new Alumno("Patrobas");
		System.out.println(a1.nombre);
		System.out.println(a1.contador);
		
		Alumno a2 = new Alumno("Andronico");
		a2.contador = 999;
		System.out.println(a2.nombre);
		System.out.println(a2.contador);

		Alumno a3 = new Alumno("Epeneto");
		System.out.println(a3.nombre);
		System.out.println(a3.contador);

		
	}

}

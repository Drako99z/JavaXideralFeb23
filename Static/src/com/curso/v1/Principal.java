package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Alumno.contador); //0

		Alumno a1 = new Alumno("Patrobas");
		System.out.println(Alumno.contador);
		
		Alumno a2 = new Alumno("Andronico");
		System.out.println(Alumno.contador);

		Alumno a3 = new Alumno("Epeneto");
		System.out.println(Alumno.contador);
		
		System.out.println("*********");
		
		System.out.println(Alumno.contador); 
		System.out.println(Alumno.contador);
		System.out.println(Alumno.contador);
		
	}

}

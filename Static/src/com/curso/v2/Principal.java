package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		

		Alumno a1 = new Alumno("Patrobas");
		Alumno.contador = 500;
		
		Alumno a2 = new Alumno("Andronico");

		Alumno a3 = new Alumno("Epeneto");
		
		
		System.out.println(Alumno.contador); //500
		
		
		
	}

}

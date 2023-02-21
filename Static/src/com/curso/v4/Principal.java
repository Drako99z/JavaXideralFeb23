package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Patrobas");
		a1.setPromedio(9.9);
		
		Alumno a2 = new Alumno("Andronico");

		Alumno a3 = new Alumno("Epeneto");
		
		System.out.println(Alumno.getContador());
		
		System.out.println(a1.getPromedio());
		
		System.out.println(a2.getOtroContador());
		
	}

}

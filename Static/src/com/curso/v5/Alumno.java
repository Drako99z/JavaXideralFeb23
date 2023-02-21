package com.curso.v5;

public class Alumno {
	
	{
		System.out.println("PASO BLOQ INIC 1");
	}
	
	static {
		System.out.println("PASO BLOQ INIC STATIC 1");
	}
	
	
	String nombre;
	
	Alumno(String nombre){
		System.out.println("Paso por Constructor");
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}
	
	{
		System.out.println("PASO BLOQ INIC 2");
	}
	
	static {
		System.out.println("PASO BLOQ INIC STATIC 2");
	}

	
}

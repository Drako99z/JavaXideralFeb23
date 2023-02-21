package com.curso.v2;

public class Alumno {
	
	//ATRIBUTOS DE CADA OBJETO ó DE INSTANCIA DE CLASE
	String nombre; //null
	
	//ATRIBUTOS DE LA CLASE
	static int contador; //0
	
	Alumno(String nombre){
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}
	
}

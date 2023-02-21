package com.curso.v0;

public class Alumno {
	
	//ATRIBUTOS DE CADA OBJETO ó DE INSTANCIA DE CLASE
	String nombre; //null
	int contador; //0
	
	Alumno(String nombre){
		this.nombre = nombre;
		//++contador;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}
	
}

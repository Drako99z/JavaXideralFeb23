package com.curso.v3;

public class Alumno {
	
	//ATRIBUTOS DE CADA OBJETO ó DE INSTANCIA DE CLASE
	String nombre; //null
	
	//ATRIBUTOS DE LA CLASE
	private static int contador; //0
	
	Alumno(String nombre){
		this.nombre = nombre;
		contador++;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}
	
	//Método de Clase
	static public int getContador() {
		return contador;
	}
	
	//Método de la instancia de Clase
//	public int getContador() {
//		return contador;
//	}
	
}

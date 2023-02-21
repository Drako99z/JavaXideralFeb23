package com.curso.v4;

public class Alumno {
	
	//ATRIBUTOS DE CADA OBJETO ó DE INSTANCIA DE CLASE
	String nombre;
	private double promedio;
	
	//ATRIBUTOS DE LA CLASE
	private static int contador; 
	
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
	
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	//UN METODO static NO PUEDE INVOCAR ATRIBUTOS DE 
	//INSTANCIA DE CLASE
	public double getPromedio() {
		return promedio;
	}
	
	//UN METODO NO static SI PUEDE INVOCAR ATRIBUTOS DE
	//CLASE (static)
	public int getOtroContador() {
		return contador;
	}
}

package com.curso.v0;

//Objeto es sinónimo de Instacia de Clase
public class Pato {
	
	//HAS A (TIENE UN)
	//ATRIBUTOS, PROPIEDADES, ESTADO
	String nombre;
	int edad;
	
	
	//CONSTRUCTORES
	//OVERLOADING (SOBRECARGA)
	Pato(){
	}
	
	Pato(String nombre){
		this.nombre = nombre;
	}
	
	Pato(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//METODOS, COMPORTAMIENTO, ACCIONES
	
	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}

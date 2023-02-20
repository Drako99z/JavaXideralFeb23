package com.curso.v1;

//Objeto es sinónimo de Instacia de Clase
public class Pato {
	
	//HAS A (TIENE UN)
	//ATRIBUTOS, PROPIEDADES, ESTADO
	String nombre;
	int edad;
	
	
	//CONSTRUCTORES
	//OVERLOADING (SOBRECARGA)
	Pato(){
		this("Sin nombre",5);
	}
	
	Pato(String nombre){
		super();
		this.nombre = nombre;
	}
	
	public Pato(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	//METODOS, COMPORTAMIENTO, ACCIONES
	
	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}

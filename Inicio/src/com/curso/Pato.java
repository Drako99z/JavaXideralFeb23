package com.curso;

//CLASE MUTABLE
public class Pato{
	
	String nombre;
	int edad;
	
	public Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public boolean equals(Object o) {
		Pato p = (Pato)o;
		if (this.nombre == p.nombre &&
			this.edad == p.edad) {
			return true;
		}
		return false;
	}

}

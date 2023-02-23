package com.curso.v2;

public class Becario {
	
	String nombre;
	//BAJO ACOPLAMIENTO
	Computadora computadora;

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderComputadora() {
		System.out.println(nombre);
		computadora.encender();
	}
	
}

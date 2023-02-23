package com.curso.v4;

public class Becario {
	
	private String nombre;
	//BAJO ACOPLAMIENTO
	private Computadora computadora;

	//INYECCION POR CONSTRUCTOR
	public Becario(String nombre, Computadora computadora) {
		this.nombre = nombre;
		this.computadora = computadora;
	}
	
	void encenderComputadora() {
		System.out.println(nombre);
		computadora.encender();
	}

	public Computadora getComputadora() {
		return computadora;
	}

	//INYECCION POR SETTER
	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}
	
}

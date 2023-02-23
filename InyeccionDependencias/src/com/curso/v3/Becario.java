package com.curso.v3;

public class Becario {
	
	private String nombre;
	//BAJO ACOPLAMIENTO
	private Computadora computadora;

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderComputadora() {
		System.out.println(nombre);
		computadora.encender();
	}
	
	public Computadora getComputadora() {
		return computadora;
	}

	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}

	
}

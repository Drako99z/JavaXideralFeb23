package com.curso.v0;

public class Becario {
	
	String nombre;
	//ALTO ACOPLAMIENTO
	CompuWindows compuWin = new CompuWindows("Vista");

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderComputadora() {
		System.out.println(nombre);
		compuWin.encender();
	}
	

}

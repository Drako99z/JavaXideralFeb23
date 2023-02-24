package com.accenture.v2;

public class Empleado {
	
	//HAS-A
	String nombre;
	Transporte  transporte;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	void conducir() {
		System.out.println(nombre+": Empezar a conducir "
				+ transporte.getClass().getSimpleName());
		transporte.encender();
	}
	
	

}

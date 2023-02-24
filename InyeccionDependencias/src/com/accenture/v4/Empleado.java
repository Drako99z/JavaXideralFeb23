package com.accenture.v4;

public class Empleado {
	
	//HAS-A
	String nombre;
	Transporte  medioTransporte;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	void conducir() {
		System.out.println(nombre+": Empezar a conducir "
				+ medioTransporte.getClass().getSimpleName());
		medioTransporte.encender();
	}
	
	

}

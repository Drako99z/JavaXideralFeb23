package com.accenture.v5;

public class Empleado {
	
	//HAS-A
	private String nombre;
	private Transporte  medioTransporte;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	void conducir() {
		System.out.println(nombre+": Empezar a conducir "
				+ medioTransporte.getClass().getSimpleName());
		medioTransporte.encender();
	}

	public Transporte getMedioTransporte() {
		return medioTransporte;
	}

	public void setMedioTransporte(Transporte medioTransporte) {
		this.medioTransporte = medioTransporte;
	}
	
	

}

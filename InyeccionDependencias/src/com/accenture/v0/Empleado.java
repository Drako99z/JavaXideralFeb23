package com.accenture.v0;

public class Empleado {
	
	//HAS-A
	String nombre;
	//Automovil  auto = new Automovil();
	Automovil  auto;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		//auto = new Automovil();
	}
	
	void conducir() {
		if (auto==null)
			auto = new Automovil();
		System.out.println(nombre+": Empezar a conducir");
		auto.endencer();
	}
	
	

}

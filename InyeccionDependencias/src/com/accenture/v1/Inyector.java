package com.accenture.v1;

public abstract class Inyector {
	
	static Transporte tran1 = new Automovil();
	
	static void inyectaTransporte(Empleado e) {
		e.transporte = tran1;
	}

}

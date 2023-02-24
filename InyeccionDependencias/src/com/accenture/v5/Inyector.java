package com.accenture.v5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public interface Inyector {
	
	static List<Transporte> listaTransporte = Arrays.asList(
			new Automovil(),
			new Moto(),
			new Avion()
			);
	
	static void inyectaTransporte(Empleado e) {
		//INYECTAR
		int r = new Random().nextInt(listaTransporte.size());
		Transporte t = listaTransporte.get(r);
		e.setMedioTransporte(t);
		
	}

}

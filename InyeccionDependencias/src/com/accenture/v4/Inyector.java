package com.accenture.v4;

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
		e.medioTransporte = 
				listaTransporte.get(new Random().nextInt(listaTransporte.size()));
	}

}

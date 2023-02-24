package com.accenture.v2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Inyector {
	
	static List<Transporte> listaTransporte = Arrays.asList(
			new Automovil(),
			new Moto(),
			new Avion()
			);
	
	static void inyectaTransporte(Empleado e) {
		int aleatorio = new Random().nextInt(listaTransporte.size());
		
		
		//INYECTAR
		e.transporte = listaTransporte.get(aleatorio);
	}

}

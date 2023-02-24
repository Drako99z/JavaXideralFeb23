package com.accenture.v3;

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
		
		Transporte otroTransporte = listaTransporte.get(aleatorio);
		//INYECTAR
		e.medioTransporte = otroTransporte;
	}

}

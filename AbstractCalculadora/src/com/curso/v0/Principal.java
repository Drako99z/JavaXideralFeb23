package com.curso.v0;

import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		List<Operacion> listaOpe = new ArrayList<>();
		
		listaOpe.add(new Division(8,4));
		listaOpe.add(new Suma(8,4));
		listaOpe.add(new Resta(8,4));
		//listaOpe.add(new Operacion(8,4));
		listaOpe.add(new Multi(8,4));
		listaOpe.add(new Potencia(8,4));
		
		showResults(listaOpe);

	}

	private static void showResults(List<Operacion> listaOpe) {
		for(Operacion o:listaOpe) {
			System.out.println(o);
			int res = o.ejecuta();
			System.out.println(res);			
		}
	}

}

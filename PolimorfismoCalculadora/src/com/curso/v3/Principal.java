package com.curso.v3;

import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Operacion ope1 = new Suma(8,4);
		Operacion ope2 = new Resta(8,4);
		Operacion ope3 = new Multi(8,4);
		
		List<Operacion> listaOpe = new ArrayList<>();
		
		listaOpe.add(ope1);
		listaOpe.add(ope2);
		listaOpe.add(ope3);
		
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

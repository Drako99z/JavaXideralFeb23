package com.curso.v2;

import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Suma ope1 = new Suma(8,4);
		Resta ope2 = new Resta(8,4);
		
		List<Operacion> listaOpe = new ArrayList<>();
		
		listaOpe.add(ope1);
		listaOpe.add(ope2);
		
		showResults(listaOpe);

	}

	private static void showResults(List<Operacion> listaOpe) {

//		for (int x=0; x < listaOpe.size(); x++ ) {
//			System.out.println(listaOpe.get(x));
//			int res = listaOpe.get(x).ejecuta();
//			System.out.println(res);
//		}
		
		//forEach
		for(Operacion o:listaOpe) {
			System.out.println(o);
			int res = o.ejecuta();
			System.out.println(res);
		}
		
		//MAS ADELANTE VEMOS JAVA FUNCTIONAL
		//listaOpe.forEach(System.out::println);
		
	}

}

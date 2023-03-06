package com.curso.lambdas;

import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		List<Operacion> listaOpe = new ArrayList<>();
		
		listaOpe.add((x,y)->x/y);
		listaOpe.add((w,z)->w+z);
		listaOpe.add((int1,int2)->int1-int2);
		listaOpe.add((x,y)->x*y);
		listaOpe.add((pato1,pato2)->(int)(Math.pow(pato1, pato2)));

		System.out.println("Con Lambdas");
		showResults(listaOpe);

	}

	private static void showResults(List<Operacion> listaOpe) {
		for(Operacion o:listaOpe) {
			int res = o.ejecuta(8,4);
			System.out.println(res);			
		}
	}

}

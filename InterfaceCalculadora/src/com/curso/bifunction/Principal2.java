package com.curso.bifunction;

import java.util.List;
import java.util.function.BiFunction;
import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {

		List<BiFunction<Double,Double,Double>> listaOpe = new ArrayList<>();
		
		listaOpe.add((x,y)->x/y);
		listaOpe.add((w,z)->w+z);
		listaOpe.add((int1,int2)->int1-int2);
		listaOpe.add((x,y)->x*y);
		listaOpe.add((pato1,pato2)->Math.pow(pato1, pato2));

		System.out.println("Con BiFunction<>");
		showResults(listaOpe);

	}

	private static void showResults(List<BiFunction<Double,Double,Double>> listaOpe) {
		for(BiFunction<Double,Double,Double> o:listaOpe) {
			double res = o.apply(8.0,5.0);
			System.out.println(res);			
		}
	}

}

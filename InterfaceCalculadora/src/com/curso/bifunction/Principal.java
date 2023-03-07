package com.curso.bifunction;

import java.util.List;
import java.util.function.BiFunction;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		List<BiFunction<Integer,Integer,Integer>> listaOpe = new ArrayList<>();
		
		listaOpe.add((x,y)->x/y);
		listaOpe.add((w,z)->w+z);
		listaOpe.add((int1,int2)->int1-int2);
		listaOpe.add((x,y)->x*y);
		listaOpe.add((pato1,pato2)->(int)(Math.pow(pato1, pato2)));

		System.out.println("Con BiFunction<>");
		showResults(listaOpe);

	}

	private static void showResults(List<BiFunction<Integer,Integer,Integer>> listaOpe) {
		for(BiFunction<Integer,Integer,Integer> o:listaOpe) {
			int res = o.apply(8,4);
			System.out.println(res);			
		}
	}

}

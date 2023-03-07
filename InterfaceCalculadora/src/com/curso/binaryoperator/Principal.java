package com.curso.binaryoperator;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		List<BinaryOperator<Double>> listaOpe = new ArrayList<>();
		
		listaOpe.add((x,y)->x/y);
		listaOpe.add((w,z)->w+z);
		listaOpe.add((int1,int2)->int1-int2);
		listaOpe.add((x,y)->x*y);
		listaOpe.add((pato1,pato2)->Math.pow(pato1, pato2));

		System.out.println("Con BinaryOperator<Double>");
		showResults(listaOpe);

	}

	private static void showResults(List<BinaryOperator<Double>> listaOpe) {
		for(BinaryOperator<Double> o:listaOpe) {
			double res = o.apply(8.0,5.0);
			System.out.println(res);			
		}
	}

}

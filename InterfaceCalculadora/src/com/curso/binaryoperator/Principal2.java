package com.curso.binaryoperator;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {

		List<BinaryOperator<Double>> listaOpe = new ArrayList<>();
		
		listaOpe.add((x,y)->x/y);
		listaOpe.add((w,z)->w+z);
		listaOpe.add((int1,int2)->int1-int2);
		listaOpe.add((x,y)->x*y);
		listaOpe.add((pato1,pato2)->Math.pow(pato1, pato2));

		System.out.println("Con BinaryOperator<Double>");
		
		listaOpe.forEach(bo -> System.out.println(bo.apply(8.0,5.0)));
		

	}

	

}

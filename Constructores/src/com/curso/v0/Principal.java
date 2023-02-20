package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Pato pato1 = new Pato();
		System.out.println(pato1);
		
		Pato pato2 = new Pato("Lucas");
		System.out.println(pato2);
		
		Pato pato3 = new Pato("Donald",5);
		System.out.println(pato3);

	}

}

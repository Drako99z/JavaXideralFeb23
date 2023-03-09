package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Zoologico z = new Parque();
		Animal a = z.getAnimal("nombre");
		
		System.out.println(a.getClass().getSimpleName());
		
	}

}

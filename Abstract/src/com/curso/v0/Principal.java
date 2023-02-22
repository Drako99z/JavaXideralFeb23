package com.curso.v0;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		//Clase ABSTRACTA
		Animal animal;
		
		animal = new Gato();
		System.out.println(animal);
		animal.getSound();
		
		animal = new Perro();
		System.out.println(animal);
		animal.getSound();
		
		animal = new Pato();
		System.out.println(animal);
		animal.getSound();
		
		animal = getAnimal();
		System.out.println(animal.getClass().getSimpleName());
		animal.getSound();
	
	}

	private static Animal getAnimal() {
		Animal[] animals = {new Gato(),new Perro(),new Pato(), new Oso()};
		int entero = new Random().nextInt(animals.length);
		return animals[entero];
	}

}

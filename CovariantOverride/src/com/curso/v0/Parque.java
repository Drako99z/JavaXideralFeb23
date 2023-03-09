package com.curso.v0;

public class Parque extends Zoologico {
	
	@Override
	Aguila getAnimal(String nombre) {
		return new Aguila();
	}

}

package com.curso.v3;

public class Aguila extends Ave{
	
	String tipo = "Aguila";
	
	@Override
	void volar() {
		System.out.println("Volar como Aguila");
	}
	
	void volarAguila() {
		System.out.println("Método volarAguila()");
	}

}

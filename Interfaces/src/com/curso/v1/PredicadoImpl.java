package com.curso.v1;

public class PredicadoImpl implements Predicado {
	
	public boolean probar(String s) {
		return s.isBlank();
	}

}

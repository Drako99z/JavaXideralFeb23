package com.curso.v1;

public class Principal {
	
	public static final int x = 5; //CONSTANTE
	
	//EL final NO PERMITE CAMBIAR LA REFERENCIA 
	public static final StringBuilder sb = new StringBuilder("Hello");

	public static final String cadena = "Hola";
	
	public static void main(String[] args) {

		cadena.concat(" Mundo");
		
		System.out.println(x);
		sb.append(" World");
		
		//sb = new StringBuilder("Otro");
		
		System.out.println(sb);
		
		Predicado.and();
		
		Predicado pre = new PredicadoImpl();
		
		pre.or();
		
		
	}

}

package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		int x = 5;
		int y = 0;
		
		int resultado = 0;
		
		try {
			resultado = calculaDiv(x,y);
		}catch(ArithmeticException e) {
			System.out.println("Atrapo la exception ArithmeticException");
		}catch(Exception e) {
			System.out.println("Contacte al Admin");
		}finally {
			System.out.println("Paso por el finally");
		}
	
		
		System.out.println(resultado);
		
		System.out.println("Fin de Programa");
	}

	private static int calculaDiv(int x, int y) {
		return x/y;
	}

}

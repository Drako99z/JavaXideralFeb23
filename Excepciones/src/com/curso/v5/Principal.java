package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		int x = 1500;
		int y = 2;

		int resultado = 0;

		try {
			resultado = calculaDiv(x, y);
			//MULTICATCH
		} catch (CeroException | NegativoException| UnsupportedOperationException e) {
			e.printStackTrace();
		} 
		finally {
			System.out.println("Paso por el finally");
		}

		System.out.println(resultado);

		System.out.println("Fin de Programa");
	}

	private static int calculaDiv(int x, int y) 
			throws CeroException, NegativoException{

		if (y == 0)
			throw new CeroException("No se puede dividir entre cero");
		if (y < 0)
			throw new NegativoException("No se puede dividir entre negativos");
		if (x > 1000)
			throw new UnsupportedOperationException("X no puede ser mayor a 1000");

		return x / y;
	}

}

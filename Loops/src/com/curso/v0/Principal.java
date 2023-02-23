package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		int[][] myComplexArray  = { { 5, 2, 1, 3, 7,9 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 },{ 5, 7} };

		
		PATO: for (int x = 0; x < myComplexArray.length; x++) {

			PERRO: for (int i = 0; i < myComplexArray[x].length; i++) {

				OSO: System.out.print(myComplexArray[x][i] + "\t");

			}
			AGUILA: System.out.println();

		}
		
		GATO: System.out.println("******************");
		
		for (int[] mySimpleArray : myComplexArray) {
			
			for (int i : mySimpleArray)
				
				System.out.print(i+ "\t");
			
			System.out.println();
			
		}


	}

}

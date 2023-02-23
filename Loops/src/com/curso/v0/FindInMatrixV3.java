package com.curso.v0;

public class FindInMatrixV3 {
	
	public static void main(String[] args) {

		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2, 2,2,2 },{ 6, 2, 8} };

		int searchValue = 2; 
		
		int[] resultado = getValorMatriz(searchValue,list);
		
		if (resultado[0] == -1 || resultado[1] == -1) {
			System.out.println("Value " + searchValue + " not found");

		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + resultado[0] + "," + resultado[1] + ")");

		}

	}
	
	
	static int[] getValorMatriz(int searchValue, int[][] list){
		
		int positionX = -1;
		int positionY = -1;

		for (int i = 0; i < list.length; i++) {

			for (int j = 0; j < list[i].length; j++) {

				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					//return new int[]{positionX, positionY};
				}

			}

		}
		
		return new int[]{positionX, positionY};
	}
}
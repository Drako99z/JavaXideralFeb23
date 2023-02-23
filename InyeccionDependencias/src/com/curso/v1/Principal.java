package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Patrobas");
		bec1.encenderComputadora("WINDOWS");
		
		Becario bec2 = new Becario("Tercio");
		//ALTO ACOPLAMIENTO
		bec2.encenderComputadora("LINUX");
		
	}

}

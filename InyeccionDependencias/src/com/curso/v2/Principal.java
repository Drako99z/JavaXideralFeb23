package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Patrobas");
		Inyector.inyectarLin(bec1);
		bec1.encenderComputadora();
		
		Becario bec2 = new Becario("Tercio");
		Inyector.inyectarWin(bec2);
		bec2.encenderComputadora();
		
		Becario bec3 = new Becario("Andronico");
		Inyector.inyectarMac(bec3);
		bec3.encenderComputadora();
		
	}

}

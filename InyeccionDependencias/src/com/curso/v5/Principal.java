package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = Inyector.getBecario("Patrobas",TipoComputadora.LINUX);
		bec1.encenderComputadora();
		
		Becario bec2 = Inyector.getBecario("Tercio",TipoComputadora.WINDOWS);
		bec2.encenderComputadora();
		
		Becario bec3 = Inyector.getBecario("Andronico",TipoComputadora.MAC);
		bec3.encenderComputadora();
		
		Becario bec4 = Inyector.getBecario("Epeneto",TipoComputadora.PATO);
		bec4.encenderComputadora();
		
		Inyector.inyectarWin(bec1);
		bec1.encenderComputadora();
		
	}

}

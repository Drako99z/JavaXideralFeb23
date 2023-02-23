package com.curso.v4;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = Inyector.getBecario("Patrobas","LINUX");
		bec1.encenderComputadora();
		
		Becario bec2 = Inyector.getBecario("Tercio","WINDOWS");
		bec2.encenderComputadora();
		
		Becario bec3 = Inyector.getBecario("Andronico","MAC");
		bec3.encenderComputadora();
		
		Becario bec4 = Inyector.getBecario("Epeneto","PATO");
		bec4.encenderComputadora();
		
		Inyector.inyectarWin(bec1);
		bec1.encenderComputadora();
		
	}

}

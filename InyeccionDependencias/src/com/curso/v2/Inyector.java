package com.curso.v2;

public class Inyector {

	static Computadora cw = new CompuWindows("Vista");
	static Computadora cl = new CompuLinux("Ubuntu 18");
	static Computadora cm = new CompuMac("Ubuntu 18");

	static void inyectarWin(Becario b) {
		b.computadora = cw;
	}
	
	static void inyectarLin(Becario b) {
		b.computadora = cl;
	}
	
	static void inyectarMac(Becario b) {
		b.computadora = cm;
	}
	
	
}

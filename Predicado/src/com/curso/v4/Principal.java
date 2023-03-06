package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Patrobas", 20, 467.89);
		Empleado e2 = new Empleado("Tercio", 17, 167.89);
		Empleado e3 = new Empleado("Andronico", 16, 567.89);
		Empleado e4 = new Empleado("Epeneto", 22, 967.89);

		Empleado[] arrayEmpleados = {e1,e2,e3,e4};
		
		System.out.println("Es mayor de Edad?");
		showEmpleados(arrayEmpleados,e -> e.getEdad()>=18 );
		
		System.out.println("Es rico?");
		showEmpleados(arrayEmpleados,e -> e.getSueldo()>500 );
		
		System.out.println("******************");
		String cadena = "Andro";
		Predicado<String> pre1 = c -> c.length()>8;
		System.out.println(pre1.probar(cadena));
		
		System.out.println("******************");
		int entero = 20;
		Predicado<Integer> pre2 = i -> i == 20;
		System.out.println(pre2.probar(entero));
		
		
	}
	
	static void showEmpleados(Empleado[] arrayEmpleados,
			Predicado<Empleado> pe ) {
		
		for (Empleado e : arrayEmpleados) {
			System.out.println(e);
			System.out.println(pe.probar(e));
		}
		
	}

}

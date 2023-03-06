package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Patrobas", 20, 467.89);
		Empleado e2 = new Empleado("Tercio", 17, 167.89);
		Empleado e3 = new Empleado("Andronico", 16, 567.89);
		Empleado e4 = new Empleado("Epeneto", 22, 967.89);

		Empleado[] arrayEmpleados = {e1,e2,e3,e4};
		boolean resultado;
		
		PredicadoEmpleado pe1 =  e -> e.getEdad()>=18;
		
		resultado = pe1.probar(e1);
		
		System.out.println("isMayor: "+resultado); //TRUE
		
		PredicadoEmpleado pe2 =  e -> e.getSueldo()>500;
		
		resultado = pe2.probar(e1);
		
		System.out.println("isRico: "+resultado); //false

		
		
		
	}

}

package com.curso.v2;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Empleado[] arrayEmpleados = {
				new Empleado("Patrobas", 20, 567.89),
				new Empleado("Tercio", 18, 167.89),
				new Empleado("Andronico", 30, 267.89),
				new Empleado("Epeneto", 22, 967.89)				
		};
		
		Arrays.sort(arrayEmpleados);
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}

		
	}

}

package com.curso.v6;
import java.util.Arrays;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		
		Empleado[] arrayEmpleados = {
				new Empleado("Patrobas", 20, 567.89),
				new Empleado("Tercio", 18, 167.89),
				new Empleado("Andronico", 30, 267.89),
				new Empleado("Epeneto", 22, 967.89)				
		};
		
		System.out.println("-------POR EDAD--------");
		
		Arrays.sort(arrayEmpleados,(o1,o2)->o2.getEdad()-o1.getEdad());
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("-------POR SUELDO--------");
	
		Arrays.sort(arrayEmpleados,(x,y)->(int)(y.getSueldo()-x.getSueldo()));
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("-------POR NOMBRE--------");
		
		Arrays.sort(arrayEmpleados,(emp1,emp2)->emp2.getNombre().compareTo(emp1.getNombre()));
		
		for (Empleado e: arrayEmpleados) {
			System.out.println(e);
		}
		
	}

}

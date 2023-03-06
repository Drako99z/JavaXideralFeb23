package com.curso.v8;
import java.util.Comparator;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		Empleado[] arrayEmpleados = {
				new Empleado("Patrobas", 18, 567.89),
				new Empleado("Tercio", 18, 167.89),
				new Empleado("Andronico", 18, 267.89),
				new Empleado("Epeneto", 16, 967.89)				
		};
		
		System.out.println("-------POR EDAD--------");
		
		Stream.of(arrayEmpleados)
			.sorted(((x,y)->x.getEdad()-y.getEdad()))
			.forEach(System.out::println);
		
		System.out.println("-------POR NOMBRE--------");
		
		Stream.of(arrayEmpleados)
			.sorted(((x,y)->x.getNombre().compareTo(y.getNombre())))
			.forEach(System.out::println);
		
		System.out.println("-------POR SUELDO--------");
		
		Stream.of(arrayEmpleados)
			.sorted(((x,y)->(int)(x.getSueldo()-(y.getSueldo()))))
			.forEach(System.out::println);
		
		
		System.out.println("-------POR EDAD/NOMBRE--------");
		
		//edad comparator
		Comparator<Empleado> compareByAge = Comparator.comparing( Empleado::getEdad );
		 
		//name comparator
		Comparator<Empleado> compareByName = Comparator.comparing( Empleado::getNombre );
		 
		//Compare by first name and then last name (multiple fields)
		Comparator<Empleado> compareByAgeName = compareByAge.thenComparing(compareByName);
		
		Stream.of(arrayEmpleados)
			.sorted(compareByAgeName)
			.forEach(System.out::println);


	}
	
	
}

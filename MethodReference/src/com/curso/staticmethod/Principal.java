package com.curso.staticmethod;

import java.util.function.Consumer;
import java.util.function.BiFunction;

public class Principal {

	public static void main(String[] args) {

		Employee empleado = new Employee(4, "Filologo", 500.0);
		
//		Consumer<Employee> cons = 
//				emp -> Employee.incrementarSalario(emp);
				
		Consumer<Employee> cons = Employee::incrementarSalario;
							
		cons.accept(empleado);
		
		System.out.println(empleado);
		
		System.out.println("*******************");
		
//		BiFunction<Employee,Double,Employee> bi = 
//				(emp,d) -> Employee.decrementarSalario(emp, d);
				
		BiFunction<Employee,Double,Employee> bi = 
				                   Employee::decrementarSalario;
				
		Employee empRes = bi.apply(empleado, 0.20);
		
		System.out.println(empRes);
		
	}

}

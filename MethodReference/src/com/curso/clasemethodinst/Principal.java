package com.curso.clasemethodinst;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Principal {

	public static void main(String[] args) {

		Employee empleado = new Employee(4, "Filologo", 500.0);
		
//		BiConsumer<Employee,Double> bicons = 
//				(e,d) -> e.incrementarSalario(d);
				
		BiConsumer<Employee,Double> bicons = Employee::incrementarSalario;
							
		bicons.accept(empleado,1.15);
		
		System.out.println(empleado);
		
		System.out.println("*******************");
		
//		BiFunction<Employee,Double,Employee> bifun = 
//				(e,d) -> e.decrementarSalario(d);
				
		BiFunction<Employee,Double,Employee> bifun = 
											Employee::decrementarSalario;
				
		Employee empRes = bifun.apply(empleado,0.30);
		
		System.out.println(empRes);
		
	}

}

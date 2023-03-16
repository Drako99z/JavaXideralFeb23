package com.curso.constructor;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Principal {

	public static void main(String[] args) {
		
		//Supplier<Employee> sup = ()-> new Employee();
		Supplier<Employee> sup = Employee::new;
		
		Employee empleado = sup.get();
		
		System.out.println(empleado);
		
		//Function<String,Employee> fun = name -> new Employee(name);
		
		Function<String,Employee> fun = Employee::new;
		
		empleado = fun.apply("Patrobas");
		
		System.out.println(empleado);

//		BiFunction<Integer,String,Employee> bifun = 
//				                 (i,n) -> new Employee(i,n);
				               
	    BiFunction<Integer,String,Employee> bifun =	Employee::new;
	    
	    empleado = bifun.apply(5,"Tercio");
				         		
		System.out.println(empleado);
		
		TriFunction<Integer,String,Double,Employee> triFun = Employee::new;
		
		empleado = triFun.apply(20,"Filologo",1000.0);
 		
		System.out.println(empleado);
	}

}

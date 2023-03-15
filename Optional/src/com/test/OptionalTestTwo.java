package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.Ignore;
import org.junit.Test;

//https://www.baeldung.com/java-optional
public class OptionalTestTwo {

	private Optional<String> getEmpty() {
	    return Optional.empty();
	}

	private Optional<String> getHello() {
	    return Optional.of("hello");
	}

	private Optional<String> getBye() {
	    return Optional.of("bye");
	}

	private Optional<String> createOptional(String input) {
	    if (input == null 
	    	|| "".equals(input) 
	    	|| "empty".equals(input)) {
	    	
	        return Optional.empty();
	    }
	    return Optional.of(input);
	}
	
	@Test
	public void givenThreeOptionals_whenChaining_thenFirstNonEmptyIsReturned() {
		Stream<Optional<String>> streamOptionals = 
				Stream.of(getEmpty(), getHello(), getBye());
		
		Optional<String> resultado = streamOptionals
						.filter(opc -> opc.isPresent())
					    .map(opc -> opc.get()) //Convierte a String
					    .findFirst();
					 
		//System.out.println(resultado);
		
		Optional<String> found = 
				Stream.of(getEmpty(), getHello(), getBye())
	    		.filter(Optional::isPresent)
	    		.map(Optional::get)
	    		.findFirst();
	    
	    assertEquals(getHello(), found);
	}
	
}

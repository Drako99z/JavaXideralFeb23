package com.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

public class OptionalTest {

	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
	    Optional<String> empty = Optional.empty();
	    //EL Optional SE ENCUENTRA VACIO
	    assertFalse(empty.isPresent());
	}
	
	@Test
	public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.of(name);
	    assertTrue(opt.isPresent());
	}
	
	@Test(expected = NullPointerException.class)
	public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
	    String name = null;
	    Optional.of(name);
	}
	
	

}

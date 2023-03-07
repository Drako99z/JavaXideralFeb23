package com.curso.beca.mockitoCalculadora;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestSuma {
	
	@InjectMocks
	Suma suma;
	
	@Mock
	CloudSuma cloudGoogle;
	
	@Before
	public void init() {
		when(cloudGoogle.ejecutaCloudSuma(6,8)).thenReturn(14);
	}
	
	@Test
	public void testSumaCloud() {				
		double resSuma = 14;
		assertEquals(resSuma,suma.ejecuta(6,8),1);
	}
	
}

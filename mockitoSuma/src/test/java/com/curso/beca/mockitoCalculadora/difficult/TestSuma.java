package com.curso.beca.mockitoCalculadora.difficult;

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
	CloudDifficult cloud;
	
	@Before
	public void init() {
		when(cloud.ejecutaCloudDifficult(2,3)).thenReturn(20);
	}
	
	@Test
	public void testSumaCloud() {				
		double resSuma = 13;
		assertEquals(resSuma,suma.ejecuta(5,8),1);
	}
	
}

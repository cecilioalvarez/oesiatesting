package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectanguloTest {

	@Test
	public void calcularAreaTest() {
	
		Rectangulo r= new Rectangulo(2,2);
		assertEquals(4, r.area());
		
	}
	
	@Test
	public void calcularPerimetroTest() {
	
		Rectangulo r= new Rectangulo(2,4);
		assertEquals(12, r.perimetro());
		
	}

}

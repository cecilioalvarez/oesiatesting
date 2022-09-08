package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GastoTest {

	@Test
	void dosCuotasTest() {
		Gasto gasto= new Gasto(200,2);
		assertEquals(100,gasto.getImporte2Cuotas());
		
		
	}

	@Test
	void cuatroCuotasTest() {
		Gasto gasto= new Gasto(200,4);
		assertEquals(60,gasto.getImporte4Cuotas());
		
		
	}
}

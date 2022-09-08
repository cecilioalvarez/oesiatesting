package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GastoTest {

	@Test
	void dosCuotasTest() {
		Gasto gasto= new Gasto(200);
		assertEquals(100,gasto.getImporte2Cuotas());
		
		
	}

	@Test
	void cuatroCuotasTest() {
		Gasto gasto= new Gasto(200);
		assertEquals(60,gasto.getImporte4Cuotas());
		
		
	}
	
	@Test
	void variablesCuotasTest() {
		Gasto gasto= new Gasto(200);
		assertEquals(30.5,gasto.getImporteCuotas(7),0.2);
		
		
	}
}

package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class GestorGastoTest {

	
	@Test
	void dosCuotasTest() {
	
		Gasto g1= mock(Gasto.class);
		Gasto g2= mock(Gasto.class);
		
		GestorGasto gestor= new GestorGasto(g1,g2);
		
		when(g1.getImporte2Cuotas()).thenReturn(50.0);
		when(g2.getImporte2Cuotas()).thenReturn(50.0);
		
		assertEquals(105,gestor.getImporte2Cuotas());
		
		verify(g1).getImporte2Cuotas();
		verify(g2).getImporte2Cuotas();
		
	}
	
	@Test
	void cuatroCuotasTest() {
	
		Gasto g1= mock(Gasto.class);
		Gasto g2= mock(Gasto.class);
		
		GestorGasto gestor= new GestorGasto(g1,g2);
		
		when(g1.getImporte4Cuotas()).thenReturn(50.0);
		when(g2.getImporte4Cuotas()).thenReturn(50.0);
		
		assertEquals(105,gestor.getImporte4Cuotas());
		
		verify(g1).getImporte4Cuotas();
		verify(g2).getImporte4Cuotas();
		
	}
}

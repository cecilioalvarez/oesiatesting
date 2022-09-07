package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NotaTest2 {
	
	@Test
	public void notaFueraDeRangosValidosTest() {
		
		RuntimeException excepcion = Assertions.assertThrows(RuntimeException.class, () -> {
			Nota nota = new Nota("matematicas",-2);
	  });
		RuntimeException excepcion2 = Assertions.assertThrows(RuntimeException.class, () -> {
			Nota nota = new Nota("matematicas",11);
	  });
		
		assertEquals("valor de nota no valido", excepcion.getMessage());
		assertEquals("valor de nota no valido", excepcion2.getMessage());
	}
	
	
	
	@ParameterizedTest
	@DisplayName("Nota insuficiente valor:2 standar valor: 0,3 limites nota")
	@ValueSource (doubles= {2,0,3})
	public void muyDeficienteTest(double valorNota) {
		
		Nota nota2 = new Nota("matematicas",valorNota);
		String calificacion= nota2.getCalificacion();
		assertEquals("MuyDeficiente",calificacion);
		
	
	}
	
	
	@Test
	public void insuficienteTest() {
		
		Nota nota = new Nota("matematicas",4);
		String calificacion= nota.getCalificacion();
		assertEquals("Insuficiente",calificacion);
	}

}

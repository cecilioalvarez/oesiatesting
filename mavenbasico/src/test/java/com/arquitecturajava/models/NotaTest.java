package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotaTest {


	
	
	@Test
	public void notaNoValidaTest() {
		
		
		
		RuntimeException excepcion = Assertions.assertThrows(RuntimeException.class, () -> {
			Nota nota = new Nota("matematicas",-2);
	  });
		
		assertEquals("valor de nota no valido", excepcion.getMessage());
	}
	
	
	
	@Test
	public void muyDeficienteTest() {
		
		
		Nota nota = new Nota("matematicas",2);
		String calificacion= nota.getCalificacion();
		assertEquals("MuyDeficiente",calificacion);
	}
	
	
	@Test
	public void insuficienteTest() {
		
		Nota nota = new Nota("matematicas",4);
		String calificacion= nota.getCalificacion();
		assertEquals("Insuficiente",calificacion);
	}

}

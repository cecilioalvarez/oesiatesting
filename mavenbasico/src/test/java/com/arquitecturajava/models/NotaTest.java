package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NotaTest {

	@Test
	public void muyDeficienteTest() {
		
		Nota nota= new Nota("Matematicas",2);
		String calificacion= nota.getCalificacion();
		assertEquals("MuyDeficiente",calificacion);
	}
	
	
	@Test
	public void insuficienteTest() {
		
		Nota nota= new Nota("Matematicas",4);
		String calificacion= nota.getCalificacion();
		assertEquals("Insuficiente",calificacion);
	}

}

package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotaTest {
	
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
	
	
	
	@Test
	public void muyDeficienteTest() {
		
		
		Nota nota2 = new Nota("matematicas",2);
		String calificacion= nota2.getCalificacion();
		assertEquals("MuyDeficiente",calificacion);
		
		
		Nota notaCero = new Nota("matematicas",0);
		String calificacion2= notaCero.getCalificacion();
		assertEquals("MuyDeficiente",calificacion2);
		
		
		Nota nota3 = new Nota("matematicas",3);
		String calificacion3= nota3.getCalificacion();
		assertEquals("MuyDeficiente",calificacion3);
	}
	
	
	@Test
	public void insuficienteTest() {
		
		Nota nota = new Nota("matematicas",4);
		String calificacion= nota.getCalificacion();
		assertEquals("Insuficiente",calificacion);
	}
	
	@Test
	public void esNotaSobresalienteTest() {
		
		Nota nota = new Nota("matematicas",9);
		String calificacion= nota.getCalificacion();
		assertEquals("SobreSaliente",calificacion);
	}

}

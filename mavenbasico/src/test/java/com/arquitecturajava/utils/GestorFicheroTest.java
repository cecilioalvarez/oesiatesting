package com.arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class GestorFicheroTest {
	
	@Test
	public void numeroLineasTest() {
		
		
		try {
			GestorFichero fichero= new GestorFichero("prueba.txt");
			assertEquals(3,fichero.getNumeroLineas());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	@Test
	public void obtenerLineaTest() {
		
		
		try {
			GestorFichero fichero= new GestorFichero("prueba.txt");
			assertEquals("me llamdo pedro",fichero.getLinea(1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	@Test
	public void contieneTextoTest() {
		
		
		try {
			GestorFichero fichero= new GestorFichero("prueba.txt");
			assertTrue(fichero.contieneTexto("hola"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


}

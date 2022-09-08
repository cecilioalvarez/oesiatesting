package com.arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestorFicheroTest {

	GestorFichero fichero;

	@BeforeEach
	public void setup() {

		try {
			fichero = new GestorFichero("prueba.txt");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void numeroLineasTest() {

		assertEquals(3, fichero.getNumeroLineas());

	}
	
	@Test
	public void obtenerLineaTest() {

		assertEquals("me llamdo pedro", fichero.getLinea(1));

	}

	@Test
	public void contieneTextoTest() {

		assertTrue(fichero.contieneTexto("hola"));

	}

}

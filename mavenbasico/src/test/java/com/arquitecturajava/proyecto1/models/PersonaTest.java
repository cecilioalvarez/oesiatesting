package com.arquitecturajava.proyecto1.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.proyecto1.models.Persona;

public class PersonaTest {

	@Test
	public void estaJubiladoTest() {
		
		Persona p= new Persona("pedro",50);
		boolean estaJubilado= p.estaJubilado();
		assertEquals(false, estaJubilado);
		
		Persona p2= new Persona("pedro",70);
		boolean estaJubilado2= p2.estaJubilado();
		assertEquals(true, estaJubilado2);
		
		Persona p3= new Persona("pedro",65);
		boolean estaJubilado3= p3.estaJubilado();
		assertEquals(false, estaJubilado3);
	}
	
	
	
	@Test
	public void noIgualdadPersonasTetst() {
		
		Persona p= new Persona("pedro",50);
		Persona p2= new Persona("juan",50);
		assertNotEquals(p,p2);
	
	}
	@Test
	public void igualdadPersonasTetst() {
		
		Persona p= new Persona("pedro",50);
		Persona p2= new Persona("pedro",50);
		assertEquals(p,p2);
	
	}
}

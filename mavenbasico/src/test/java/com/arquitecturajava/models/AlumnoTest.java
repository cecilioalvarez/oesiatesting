package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlumnoTest {

	Alumno alumno;
	List<Nota> notas;
	
	// es refactorizar parte de mi codigo
	// a nivel de pruebas unitarias
	@BeforeEach
	public void setUp() {
		
		alumno= new Alumno();
		notas= new ArrayList<Nota>();
		
		Nota nota=new Nota("matematias",2);
		//Nota nota2= new Nota("lengua",3);
		//Nota nota3= new Nota("lengua",0);
		notas.add(nota);
		//notas.add(nota2);
		//notas.add(nota3);
		alumno.setLista(notas);
		
	}
	@Test
	void alumnoAddNotaTest() {
		
		Nota nota= new Nota("matematicas",2);
		assertFalse(alumno.getLista().contains(nota));
		alumno.addNota(nota);
		assertTrue(alumno.getLista().contains(nota));
		
		
	}
	
	@Test
	void alumnoRemoveNotaTest() {
		
		//arrange o preparacion 
		
		
		Nota nota=new Nota("matematias",2);
		
		//assertEquals(2, alumno.getLista().size());
		alumno.removeNota(nota);
		
		assertEquals(1,alumno.getLista().size());
		
		
	}

}

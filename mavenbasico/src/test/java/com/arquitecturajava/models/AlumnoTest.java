package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
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
		alumno.setLista(listaNotasInicial());
		
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
			
		Nota nota=new Nota("matematias",2);
		alumno.removeNota(nota);
		assertFalse(alumno.getLista().contains(nota));
		
		
	}
	@Test
	void alumnoCursoAptoTest() {
			
		List<Nota> notas = listaNotasParaMedia();
		alumno.setLista(notas);
		assertTrue(alumno.apruebaElCurso());
		
		
	}
	@Test
	void alumnoNotaMayorTest() {
			
		List<Nota> notas = listaNotasParaMedia();
		alumno.setLista(notas);
		assertEquals(new Nota("lengua",9),alumno.notaMayor());
		
		
	}
	
	
	@Test
	void alumnosNotasSuspensas() {
			
		List<Nota> notas = listaNotasParaMedia();
		alumno.setLista(notas);
		List<Nota> notasSuspensas=alumno.suspensos();
		notasSuspensas.forEach((nota)->assertTrue(nota.getValor()<5));
		
		
	}
	
	
	/***************************/
	
	private List<Nota> listaNotasParaMedia() {
		Nota nota=new Nota("matematias",2);
		Nota nota2= new Nota("lengua",9);
		Nota nota3= new Nota("lengua",7);
		List<Nota> notas= new ArrayList<Nota>();
	
		Collections.addAll(notas, nota,nota2,nota3);
		return notas;
	}

	private List<Nota> listaNotasInicial() {
		notas= new ArrayList<Nota>();
		Nota nota=new Nota("matematias",2);
		Nota nota2= new Nota("lengua",3);
		Nota nota3= new Nota("lengua",0);
		Collections.addAll(notas, nota,nota2,nota3);
		return notas;
	}
}

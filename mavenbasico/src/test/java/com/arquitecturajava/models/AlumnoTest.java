package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
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
		alumno.setNotas(getListaNotasBasica());
		
	}
	@Test
	void alumnoAddNotaTest() {
		
		Nota nota= new Nota("matematicas",2);
		assertFalse(alumno.getNotas().contains(nota));
		alumno.addNota(nota);
		assertTrue(alumno.getNotas().contains(nota));
		
	}
	
	@Test
	void alumnosNotasSuspensas() {
			
		List<Nota> notas = getListaNotasBasica();
		alumno.setNotas(notas);
		List<Nota> notasSuspensas=alumno.getNotasSuspensos();
		notasSuspensas.stream()
		.map(Nota::getValor)
		.map((nota)->nota<5).forEach(Assertions::assertTrue);
		
	}
	
	
	@Test
	void alumnoGetNumeroSobreSalientes() {
			
		
		List<Nota> lista = new ArrayList<Nota>();
		
		Nota nota1Mock= mock(Nota.class);
		when(nota1Mock.getCalificacion()).thenReturn("SobreSaliente");
		
		
		Nota nota2Mock= mock(Nota.class);
		when(nota2Mock.getCalificacion()).thenReturn("SobreSaliente");
		
	
		lista.add(nota1Mock);
		lista.add(nota2Mock);
		
		alumno.setNotas(lista);
		
		assertEquals(2,alumno.getNumeroSobreSalientes());
		
		
		
	}
	
	
	@Test
	void alumnoRemoveNotaTest() {
			
		Nota nota=new Nota("matematias",2);
		alumno.removeNota(nota);
		assertFalse(alumno.getNotas().contains(nota));
		
		
	}
	
	
	
	/**********************************/
	@Test
	void alumnoNotaMayorTest() {
			
		List<Nota> lista = new ArrayList<Nota>();
		addNotaLista(lista, "matematicas",3);
		addNotaLista(lista, "lengua",4);
		addNotaLista(lista, "ingles",7);
		addNotaLista(lista, "fisica",8);
		alumno.setNotas(lista);
		assertEquals(new Nota("fisica",8),alumno.getNotaMayor());
		
		
	}
	@Test
	void alumnoCursoAptoTest() {
			
		List<Nota> lista = new ArrayList<Nota>();
		addNotaLista(lista, "matematicas",6);
		addNotaLista(lista, "lengua",4);
		addNotaLista(lista, "ingles",7);
		addNotaLista(lista, "fisica",10);
		alumno.setNotas(lista);
		assertTrue(alumno.apruebaElCurso());	
		
	}
	
	@Test
	void alumnoCursoNoEsAptoTest() {
			
		List<Nota> lista = new ArrayList<Nota>();
		addNotaLista(lista, "matematicas",2);
		addNotaLista(lista, "lengua",4);
		addNotaLista(lista, "ingles",7);
		addNotaLista(lista, "fisica",2);
		alumno.setNotas(lista);
		assertFalse(alumno.apruebaElCurso());
		
		
	}
	
	private static void addNotaLista(List<Nota> lista, String asignatura,double valor) {
		
		lista.add( new Nota (asignatura,valor));
	}
	


	private List<Nota> getListaNotasBasica() {
		notas= new ArrayList<Nota>();
		Nota nota=new Nota("matematias",2);
		Nota nota2= new Nota("lengua",3);
		Nota nota3= new Nota("lengua",0);
		Nota nota4=new Nota("matematias",7);
		Nota nota5= new Nota("ingles",8);
		Nota nota6= new Nota("fisica",4);
		
		Collections.addAll(notas, nota,nota2,nota3,nota4,nota5,nota6);
		return notas;
	}
}

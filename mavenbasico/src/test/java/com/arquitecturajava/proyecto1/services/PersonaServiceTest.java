package com.arquitecturajava.proyecto1.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.proyecto1.models.Persona;
import com.arquitecturajava.proyecto1.repositories.PersonaRepository;

public class PersonaServiceTest {

	PersonaService service;
	PersonaRepository repository;
	
	@BeforeEach
	public void setUp() {
		
		repository= mock(PersonaRepository.class);
		service= new PersonaService(repository);
	}
	
	@Test
	public void buscarTodasLasPersonasTest() {
	
		List<Persona> datosMock= Arrays.asList(new Persona("juan",20),new Persona("ana",30));
		when(repository.buscarTodos()).thenReturn(datosMock);
	
		List<Persona> lista=service.buscarTodosLasPersonas();
		
		assertNotNull(lista);
		assertTrue(lista.contains(new Persona("juan",20)));
		assertTrue(lista.contains(new Persona("ana",30)));
		
		
	}
	
	@Test
	public void insertarPersonaTest() {
		
	
		service.insertarPersona(new Persona("juan",30));
		
		//verifico la delegacion en el otro objeto que es lo que implementa el servicoi
		//y nada mas
		verify(repository).insertar(any(Persona.class));
	}
	
	
	@Test
	public void borrarPersonaTest() {
		
		
		service.borrarPersona(new Persona("juan"));
		
		//verifico la delegacion en el otro objeto que es lo que implementa el servicoi
		//y nada mas
		verify(repository).borrar(any(Persona.class));
	}
	
}

package com.arquitecturajava.proyecto1.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.proyecto1.models.Persona;
import com.arquitecturajava.proyecto1.repositories.PersonaRepository;

public class PersonaServiceTest {

	
	
	@Test
	public void buscarTodasLasPersonasTest() {
		//repositorio
		PersonaRepository repo= mock(PersonaRepository.class);
		List<Persona> datosMock= Arrays.asList(new Persona("juan",20),new Persona("ana",30));
		when(repo.buscarTodos()).thenReturn(datosMock);
	
		
		PersonaService servicio= new PersonaService(repo);
		List<Persona> lista=servicio.buscarTodosLasPersonas();
		assertNotNull(lista);
		assertTrue(lista.contains(new Persona("juan",20)));
		assertTrue(lista.contains(new Persona("ana",30)));
		
		
	}
	
	@Test
	public void insertarPersonaTest() {
		
		PersonaRepository repo= mock(PersonaRepository.class);
		PersonaService servicio= new PersonaService(repo);
		servicio.insertarPersona(new Persona("juan",30));
		//verifico la delegacion en el otro objeto que es lo que implementa el servicoi
		//y nada mas
		verify(repo).insertar(any(Persona.class));
	}
	
}

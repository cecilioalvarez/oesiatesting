package com.arquitecturajava.proyecto1.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.proyecto1.models.Persona;
import com.arquitecturajava.proyecto1.repositories.PersonaRepository;
import com.arquitecturajava.proyecto1.repositories.memory.PersonaRepositoryMemory;

public class PersonaServiceTest {

	
	
	@Test
	public void buscarTodasLasPersonasTest() {
		//repositorio
		PersonaRepository repo= new PersonaRepositoryMemory();
		PersonaService servicio= new PersonaService(repo);
		List<Persona> lista=servicio.buscarTodosLasPersonas();
		assertNotNull(lista);
		assertTrue(lista.size()>1);
		
		
	}
}

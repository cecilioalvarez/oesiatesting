package com.arquitecturajava.proyecto1.models.repositories.memory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.proyecto1.models.Persona;
import com.arquitecturajava.proyecto1.repositories.PersonaRepository;
import com.arquitecturajava.proyecto1.repositories.memory.PersonaRepositoryMemory;

public class PersonaRepositoryMemoryTest {

	PersonaRepository repo;
	
	
	@BeforeEach
	public void setUp() {
		
		repo= new PersonaRepositoryMemory();
	}
	
	@Test
	public void buscarTodosTest() {
		
		List<Persona> lista= repo.buscarTodos();
		assertNotNull(lista);
		assertTrue(lista.size()>1);
		
	}
	
	@Test
	public void insertarPersonaTest() {
		Persona p= new Persona("juan",20);
		repo.insertar(p);
		List<Persona> lista2= repo.buscarTodos();
		assertTrue(lista2.contains(p));
	}
	
}

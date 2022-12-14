package com.arquitecturajava.proyecto1.repositories.memory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.proyecto1.models.Persona;
import com.arquitecturajava.proyecto1.repositories.PersonaRepository;

public class PersonaRepositoryMemoryTest {

	PersonaRepository repo;
	List<Persona> listaInicial;
	@BeforeEach
	public void setUp() {
		
		listaInicial = new ArrayList<Persona>();
		listaInicial.add(new Persona("pepe",20));
		listaInicial.add(new Persona("ana1",40));
		listaInicial.add(new Persona("maria1",30));
		
		repo = new PersonaRepositoryMemory(listaInicial);
	}

	@Test
	public void buscarTodosTest() {

		List<Persona> lista = repo.buscarTodos();
		assertNotNull(lista);
		assertArrayEquals(listaInicial.toArray(), lista.toArray());
		

	}

	@Test
	public void insertarPersonaTest() {
		Persona p = new Persona("juan", 20);
		repo.insertar(p);
		assertTrue(listaInicial.contains(p));
	}

	@Test
	public void buscarUnoTest() {

		Optional<Persona> oPersona = repo.buscarUno("pepe");
		assertTrue(oPersona.isPresent());
		if (oPersona.isPresent()) {
			Persona p = oPersona.get();
			assertEquals(new Persona("pepe", 20), p);
		}

		Optional<Persona> oPersona2 = repo.buscarUno("mario");
		assertFalse(oPersona2.isPresent());

	}

	@Test
	public void borrarUnoTest() {

		repo.borrar(new Persona("pepe"));	
		assertFalse(listaInicial.contains(new Persona("pepe")));
	

	}

}

package com.arquitecturajava.proyecto1.services;

import java.util.List;
import java.util.Optional;

import com.arquitecturajava.proyecto1.models.Persona;
import com.arquitecturajava.proyecto1.repositories.PersonaRepository;

public class PersonaService {

	private PersonaRepository repositorio;

	public PersonaService(PersonaRepository repositorio) {
		super();
		this.repositorio = repositorio;
	}

	public List<Persona> buscarTodosLasPersonas() {
		return repositorio.buscarTodos();
	}

	public void insertarPersona(Persona persona) {
		repositorio.insertar(persona);
	}

	public void borrarPersona(Persona persona) {
		repositorio.borrar(persona);
	}

	public Optional<Persona> buscarUnoPersona(String nombre) {
		return repositorio.buscarUno(nombre);
	}
	
	
	
}

package com.arquitecturajava.proyecto1.repositories;

import java.util.List;
import java.util.Optional;

import com.arquitecturajava.proyecto1.models.Persona;

public interface PersonaRepository {

	List<Persona> buscarTodos();
	void insertar(Persona persona);
	void borrar(Persona persona);
	Optional<Persona> buscarUno(String nombre);
}

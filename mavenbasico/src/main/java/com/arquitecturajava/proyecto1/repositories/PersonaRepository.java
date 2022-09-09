package com.arquitecturajava.proyecto1.repositories;

import java.util.List;

import com.arquitecturajava.proyecto1.models.Persona;

public interface PersonaRepository {

	List<Persona> buscarTodos();
}

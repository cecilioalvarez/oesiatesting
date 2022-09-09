package com.arquitecturajava.proyecto1.repositories.memory;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.proyecto1.models.Persona;
import com.arquitecturajava.proyecto1.repositories.PersonaRepository;

public class PersonaRepositoryMemory implements PersonaRepository {

	private static List<Persona> lista= new ArrayList<Persona>();
	static  {
		
		lista.add(new Persona("pepe",20));
		lista.add(new Persona("ana",40));
		lista.add(new Persona("maria",30));
	}
	
	
	
	
	@Override
	public List<Persona> buscarTodos() {
		return lista;

	}

}

package com.arquitecturajava.proyecto4;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre;
	private List<Nota> notas = new ArrayList<Nota>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	public synchronized void addNota(Nota nota) {

		this.notas.add(nota);
	}

	public boolean tieneSobreSaliente() {
		
		for (Nota n:notas) {
			
			if (n.esSobreSaliente()) {
				return true;
			}
		}
			return false;
	}

}

package com.arquitecturajava.models;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre;
	private List<Nota> lista = new ArrayList<Nota>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	public void addNota(Nota nota) {

		lista.add(nota);
	}

	public void removeNota(Nota nota) {

		lista.remove(nota);
	}

	public boolean apruebaElCurso() {

		double total = 0;

		for (Nota n : lista) {

			total += n.getValor();
		}
		return total / lista.size() >= 5;

	}
	
	
	public Nota getNotaMayor() {

		Nota notaMayor= lista.get(0);
		

		for (Nota n : lista) {

			if (notaMayor.getValor()<n.getValor()) {
				
				
				notaMayor=n;
			}
		}
		return notaMayor;

	}
	
	
	public List<Nota> getNotasSuspensos() {

		List<Nota> suspensos=new ArrayList<Nota>();
		

		for (Nota n : lista) {

			if (n.getValor()<5) {
				
				
				suspensos.add(n);
			}
		}
		return suspensos;

	}
	
}

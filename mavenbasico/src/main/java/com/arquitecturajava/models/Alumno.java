package com.arquitecturajava.models;

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

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> lista) {
		this.notas = lista;
	}

	public void addNota(Nota nota) {

		notas.add(nota);
	}

	public void removeNota(Nota nota) {

		notas.remove(nota);
	}

	public boolean apruebaElCurso() {

		double total = 0;

		for (Nota n : notas) {

			total += n.getValor();
		}
		return total / notas.size() >= 5;

	}
	
	
	public Nota getNotaMayor() {

		Nota notaMayor= notas.get(0);
		

		for (Nota n : notas) {

			if (notaMayor.getValor()<n.getValor()) {
				
				
				notaMayor=n;
			}
		}
		return notaMayor;

	}
	
	
	public List<Nota> getNotasSuspensos() {

		List<Nota> suspensos=new ArrayList<Nota>();
		

		for (Nota n : notas) {

			if (n.getValor()<5) {
				
				
				suspensos.add(n);
			}
		}
		return suspensos;

	}
	
	public double getNumeroSobreSalientes() {
		
		int total=0;
		
		for (Nota n : notas) {

			if (n.getCalificacion().equals("SobreSaliente")) {
				
				
				total++;
			}
		}
		
		return total;
		
	}
	
}

package com.arquitecturajava.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorFichero {

	private List<String> lineas = new ArrayList<String>();

	private String nombreFichero;

	public GestorFichero(String nombreFichero) throws IOException {
		super();
		this.nombreFichero = nombreFichero;

		BufferedReader br = new BufferedReader(new FileReader(nombreFichero));

		String st;
		while ((st = br.readLine()) != null) {

			lineas.add(st);
		}
	}

	public String getNombreFichero() {
		return nombreFichero;
	}

	public int getNumeroLineas() {
		return lineas.size();
	}

	public String getLinea(int posicion) {
		return lineas.get(posicion);
	}
	
	public boolean contieneTexto(String texto) {
		
		for (String linea : lineas) {
			
			if (linea.contains(texto)) {
				return true;
			}
		}
		return false;
		
	}

}

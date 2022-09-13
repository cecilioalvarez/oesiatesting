package com.arquitecturajava.proyecto2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Principal6 {

	public static void main(String[] args) {
		
		Path inicio = Paths.get("inicio/hola.txt");
	    Path destino =  Paths.get("fin/fin.txt");
	    try {
			Files.copy(inicio, destino,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

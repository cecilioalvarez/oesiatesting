package com.arquitecturajava.proyecto2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TareaBorrar implements Runnable {

	private Thread tareaAnterior;
	
	
	
	public TareaBorrar(Thread tareaAnterior) {
		super();
		this.tareaAnterior = tareaAnterior;
		try {
			tareaAnterior.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	@Override
	public void run() {
		
		  String fileName = "inicio/hola.txt";
	        try {
	            Files.delete(Paths.get(fileName));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

		
	}

}

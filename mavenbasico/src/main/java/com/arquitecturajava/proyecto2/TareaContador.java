package com.arquitecturajava.proyecto2;

public class TareaContador implements Runnable{

	private Contador c;
	
	
	
	public TareaContador(Contador c) {
		super();
		this.c = c;
	}



	@Override
	public void run() {
		
		for (int i=0;i<10;i++) {
			
			c.incrementar();
		}
		
	}

}

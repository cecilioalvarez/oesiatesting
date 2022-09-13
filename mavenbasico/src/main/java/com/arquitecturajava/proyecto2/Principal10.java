package com.arquitecturajava.proyecto2;

public class Principal10 {

	public static void main(String[] args) {
		long t1= System.currentTimeMillis();
		Contador c= new Contador();
		
		Thread t = new Thread (new TareaContador(c));
		t.start();
		
		Thread t2 = new Thread (new TareaContador(c));
		t2.start();
		
		Thread t3 = new Thread (new TareaContador(c));
		t3.start();
		
		Thread t4 = new Thread (new TareaContador(c));
		t4.start();
		
		
		
		

	}

}

package com.arquitecturajava.proyecto2;

public class Principal3 {

	public static void main(String[] args) {
		
		
		Thread t= new Thread(new Tarea());
		Thread t2= new Thread(new Tarea());
		Thread t3= new Thread(new Tarea());
		t.setName("hilo1");
		t.start();
		t2.start();
		t3.start();
	}

}

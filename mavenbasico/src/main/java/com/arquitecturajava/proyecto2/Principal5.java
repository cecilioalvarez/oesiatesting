package com.arquitecturajava.proyecto2;

public class Principal5 {

	public static void main(String[] args) {

		Thread t = new Thread(new Tarea());
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finalizado");
		
		
	}

}

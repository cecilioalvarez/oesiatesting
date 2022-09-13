package com.arquitecturajava.proyecto2;

public class Principal8 {

	public static void main(String[] args) {
		
		
		Thread t= new Thread(new TareaCopiar());
		Thread t2= new Thread(new Thread(new TareaBorrar(t)));
		t.start();
		t2.start();

	}

}

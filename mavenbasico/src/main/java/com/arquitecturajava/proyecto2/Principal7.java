package com.arquitecturajava.proyecto2;

public class Principal7 {

	public static void main(String[] args) {
		
		
		Thread t= new Thread(new TareaCopiar());
		t.start();

	}

}

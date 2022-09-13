package com.arquitecturajava.proyecto2;

public class Principal8 {

	public static void main(String[] args) {
		
		
		Thread t= new Thread(new TareaCopiar());
		Thread t2= new Thread(new TareaBorrar(t));
		t.start();
		t2.start();
		
		for( int i=0;i<10;i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hola");
		}

	}

}

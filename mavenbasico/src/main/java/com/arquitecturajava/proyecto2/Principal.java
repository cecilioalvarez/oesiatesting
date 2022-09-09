package com.arquitecturajava.proyecto2;

public class Principal {

	public static void main(String[] args) {
		
		HiloBasico hilo=new HiloBasico();
		hilo.start();
		for (int i=0;i<10;i++) {
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}

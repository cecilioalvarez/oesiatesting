package com.arquitecturajava.proyecto2;

public class Principal {

	public static void main(String[] args) {
		
		HiloBasico hilo=new HiloBasico();
		System.out.println(hilo.getState());
		
		
		hilo.start();
		
		
		System.out.println(hilo.getState());
		
		
		
		for (int i=0;i<10;i++) {
			
			System.out.println(i);
			System.out.println(Thread.currentThread().getState());
			try {
				Thread.sleep(2000);
				System.out.println(hilo.getState());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}

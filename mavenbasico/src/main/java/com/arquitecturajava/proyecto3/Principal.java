package com.arquitecturajava.proyecto3;

public class Principal {

	public static void main(String[] args) {
		
		long t1= System.currentTimeMillis();
		Gastos gastos= new Gastos();
		GestorCompra gestor= new GestorCompra(gastos);
		GestorEmergencias gestorEmergencias= new GestorEmergencias(gastos);
		
		Thread hilo= new Thread(gestor);
		Thread hilo2= new Thread(gestorEmergencias);
		hilo.start();
		hilo2.start();
		try {
			hilo.join();
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(gastos.getGastosTotales());
		long t2= System.currentTimeMillis();
		
		System.out.println(t2-t1);
	}

}

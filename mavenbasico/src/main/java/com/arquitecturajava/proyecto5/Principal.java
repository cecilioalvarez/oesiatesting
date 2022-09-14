package com.arquitecturajava.proyecto5;

public class Principal {

	public static void main(String[] args) {
		
		Hilo hilo= new Hilo();
		Thread t= new Thread(hilo);
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hilo.stop();
	}
}

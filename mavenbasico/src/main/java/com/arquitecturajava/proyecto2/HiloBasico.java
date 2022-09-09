package com.arquitecturajava.proyecto2;

public class HiloBasico extends Thread{

	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			
			System.out.println("hilo"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

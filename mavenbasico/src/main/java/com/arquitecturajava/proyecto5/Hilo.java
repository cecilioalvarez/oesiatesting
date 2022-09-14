package com.arquitecturajava.proyecto5;

public class Hilo  implements Runnable{

	private boolean estaVivo=true;
	
	@Override
	public void run() {
	
		while(estaVivo) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("estoy vivo");
		}
	}

	public void stop() {
		estaVivo=false;
	}
}

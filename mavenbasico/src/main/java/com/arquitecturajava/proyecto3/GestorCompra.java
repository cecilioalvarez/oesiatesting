package com.arquitecturajava.proyecto3;

public class GestorCompra  implements Runnable{
	private Gastos gastos;

	public GestorCompra(Gastos gastos) {
		super();
		this.gastos = gastos;
	}

	@Override
	public void run() {
		// esto sería el metodo que se encarga
		// de rellenar el array de gastos
		for (int i=0;i<10;i++) {
			
			try {
				//System.out.println("duermo 1 s");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (gastos) {
				gastos.addGasto(100);
				//System.out.println("vamos a notificar");
				gastos.notify();
			}
			
		}
		
	}
	
	

}

package com.arquitecturajava.proyecto3;

public class GestorEmergencias implements Runnable {

	private Gastos gastos;

	public GestorEmergencias(Gastos gastos) {
		super();
		this.gastos = gastos;
	}

	@Override
	public void run() {

		synchronized (gastos) {

			while (gastos.getGastosTotales() < 300) {

				try {
					System.out.println(" vas bien " +gastos.getGastosTotales());
					gastos.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("te has pasado de gastos" + gastos.getGastosTotales());

		}

	}

}

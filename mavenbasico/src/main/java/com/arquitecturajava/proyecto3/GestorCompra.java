package com.arquitecturajava.proyecto3;

import java.util.List;

public class GestorCompra  implements Runnable{
	private List<Double> gastos;

	public GestorCompra(List<Double> gastos) {
		super();
		this.gastos = gastos;
	}

	@Override
	public void run() {
		
		for (int i=0;i<10;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			gastos.add(Math.random()*100);
		}
		
	}
	
	

}

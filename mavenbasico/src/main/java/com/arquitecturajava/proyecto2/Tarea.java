package com.arquitecturajava.proyecto2;

public class Tarea  implements Runnable{

	@Override
	public void run() {
		
		
		for (int i=0;i<10;i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}

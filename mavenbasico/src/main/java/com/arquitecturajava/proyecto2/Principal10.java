package com.arquitecturajava.proyecto2;

public class Principal10 {

	public static void main(String[] args) {
		long tiempo1 = System.currentTimeMillis();
		Contador c = new Contador();

		Thread t = new Thread(new TareaContador(c));
		

		Thread t2 = new Thread(new TareaContador(c));
		

		Thread t3 = new Thread(new TareaContador(c));
	

		Thread t4 = new Thread(new TareaContador(c));
		
		try {
			t.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.start();
		t2.start();
		t3.start();
		t4.start();

		
		for (int i = 0; i < 40; i++) {

			System.out.println(t.getName() + " " + t.getState());
			System.out.println(t2.getName() + " " + t2.getState());
			System.out.println(t3.getName() + " " + t3.getState());
			System.out.println(t4.getName() + " " + t4.getState());
			try {
				
				synchronized (c) {
					c.notify();
				}
				Thread.sleep(10);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		long tiempo2 = System.currentTimeMillis();

		System.out.println(tiempo2 - tiempo1);

	}

}

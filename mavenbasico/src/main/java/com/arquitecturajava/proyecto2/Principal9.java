package com.arquitecturajava.proyecto2;

public class Principal9 {

	public static void main(String[] args) {
		
		Contador c= new Contador();
		
		Thread t = new Thread (new TareaContador(c));
		t.start();
		
		Thread t2 = new Thread (new TareaContador(c));
		t2.start();
		
		Thread t3 = new Thread (new TareaContador(c));
		t3.start();
		
		Thread t4 = new Thread (new TareaContador(c));
		t4.start();
		
		for (int i=0;i<20;i++) {
			
			System.out.println(t.getName()+ " "+ t.getState());
			System.out.println(t2.getName()+ " "+ t2.getState());
			System.out.println(t3.getName()+ " "+ t3.getState());
			System.out.println(t4.getName()+ " "+ t4.getState());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}

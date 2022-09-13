package com.arquitecturajava.proyecto2;

public class Principal4 {

	public static void main(String[] args) {

		Thread t = new Thread(new Tarea());
		Thread t2 = new Thread(new Tarea());
		Thread t3 = new Thread(new Tarea());
		Thread t4 = new Thread(new Tarea());
		Thread t5 = new Thread(new Tarea());
		Thread t6 = new Thread(new Tarea());
		Thread t7 = new Thread(new Tarea());
		Thread t8 = new Thread(new Tarea());
		Thread t9 = new Thread(new Tarea());
		Thread t10 = new Thread(new Tarea());
		t.setPriority(1);
		t2.setPriority(1);
		t3.setPriority(1);
		t4.setPriority(1);
		t5.setPriority(1);
		t6.setPriority(1);
		t7.setPriority(1);
		t8.setPriority(1);
		t9.setPriority(10);
		t10.setPriority(10);
		t.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	
		
		
		for (int i = 0; i < 20; i++) {

			System.out.println(t.getName() + ": " + t.getState());
			System.out.println(t2.getName() + ": " + t2.getState());
			System.out.println(t3.getName() + ": " + t3.getState());
			System.out.println(t4.getName() + ": " + t4.getState());
			System.out.println(t5.getName() + ": " + t5.getState());
			System.out.println(t6.getName() + ": " + t6.getState());
			System.out.println(t7.getName() + ": " + t7.getState());
			System.out.println(t8.getName() + ": " + t8.getState());
			System.out.println(t9.getName() + ": " + t9.getState());
			
			System.out.println(t10.getName() + ": " + t10.getState());
			
			
			
			
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

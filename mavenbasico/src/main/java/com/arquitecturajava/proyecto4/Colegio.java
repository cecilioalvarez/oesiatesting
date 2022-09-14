package com.arquitecturajava.proyecto4;

public class Colegio implements Runnable {

	
	private Alumno alumno;

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public void run() {
		
		
		for (int i=0;i<20;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		double valor=Math.random()*10;
		System.out.println("añadiendo nota"+ valor);
		alumno.addNota( new Nota (valor));
		}
	}
	
	
}

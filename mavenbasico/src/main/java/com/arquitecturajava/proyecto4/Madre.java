package com.arquitecturajava.proyecto4;

public class Madre implements Runnable {
	private Alumno alumno;

	public Alumno getAlumno() {
		return alumno;
	}

	public Madre(Alumno alumno) {
		super();
		this.alumno = alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public void run() {
		
		for (int i=0;i<50;i++) {
			
			try {
				
				synchronized (alumno) {
					
					
					alumno.wait();
					if (alumno.tieneSobreSaliente()) {
						System.out.println("un sobresaliente vamos al cine!!!");
					}
					
					
				}
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			
			}
		}
		
		
	}
	
	
}

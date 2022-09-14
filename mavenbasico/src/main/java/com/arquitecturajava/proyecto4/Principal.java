package com.arquitecturajava.proyecto4;

public class Principal {

	public static void main(String[] args) {
		
		
		Alumno alumno= new Alumno("pedro");
		
		Colegio c = new Colegio();
		c.setAlumno(alumno);
		
		Thread t= new Thread(c);
		Madre m= new Madre(alumno);
		Thread t2 = new Thread(m);
		
		t.start();
		t2.start();

	}

}

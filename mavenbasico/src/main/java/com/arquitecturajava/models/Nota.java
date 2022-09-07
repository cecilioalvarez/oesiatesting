package com.arquitecturajava.models;

public class Nota {

	private String asignatura;
	private double valor;
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double nota) {
		this.valor = nota;
	}
	public Nota(String asignatura, double valor) {
		super();
		this.asignatura = asignatura;
		this.valor = valor;
	}
	
	public String getCalificacion() {
		
		if (valor>0 && valor<3) {
			
			return "MuyDeficiente";
		}else if (valor>=3 && valor<5) {
			
			return "Insuficiente";
		}else if (valor>=5 && valor<6) {
			return "Suficiente";
		}else if (valor>=6 && valor<7) {
			
			return "Bien";
		}else if (valor>=7 && valor<9) {
			
			return "Notable";
		}else return "SobreSaliente";
		
		
	}
	
}

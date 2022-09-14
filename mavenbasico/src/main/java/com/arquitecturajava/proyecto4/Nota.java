package com.arquitecturajava.proyecto4;

public class Nota {

	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Nota(double valor) {
		super();
		this.valor = valor;
	}
	
	public boolean esSobreSaliente()  {
		
		return valor>=9;
	}
	
	
}

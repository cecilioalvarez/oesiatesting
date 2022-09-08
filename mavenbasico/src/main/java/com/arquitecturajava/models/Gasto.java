package com.arquitecturajava.models;

public class Gasto {

	private double importe;
	private int cuotas;

	public Gasto(double importe, int cuotas) {
		super();
		this.importe = importe;
		this.cuotas = cuotas;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public int getCuotas() {
		return cuotas;
	}
	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}
	
	public double getImporte2Cuotas() {
		return importe/2;
	}
	public double getImporte4Cuotas() {
		return importe/4*1.20;
	}
	
}

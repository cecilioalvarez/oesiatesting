package com.arquitecturajava.models;

public class Gasto {

	private double importe;

	public Gasto(double importe) {
		super();
		this.importe = importe;

	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getImporte2Cuotas() {
		return importe / 2;
	}

	public double getImporte4Cuotas() {
		return importe / 4 * 1.20;
	}

	public double getImporteCuotas(int cuotas) {

		if (cuotas < 5) {

			return importe / cuotas;
		} else if (cuotas >= 5 && cuotas < 10) {

			return importe / cuotas + 2;
		} else
			return importe / cuotas + 10;

	}

}

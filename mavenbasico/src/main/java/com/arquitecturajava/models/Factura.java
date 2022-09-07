package com.arquitecturajava.models;

public class Factura {

	private int numero;
	private String concepto;
	private double importe;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Factura(int numero, String concepto, double importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}

	public double getImporteConIVA() {

		return getImporte() * 1.21;
	}

	public double getImporteRetencion() {

		return getImporte() * 0.15;
	}

	public double getImporteConDescuento() {

		return getImporte() * 0.85;

	}

}

package com.arquitecturajava.proyecto3;

import java.util.ArrayList;
import java.util.List;

public class Gastos {

	private List<Double> importes= new ArrayList<Double>();
	
	
	public void addGasto(double importe) {
		
		importes.add(importe);
	}
	
	public double getGastosTotales() {
		double total=0;
		
		for (double importe: importes) {
			
			total+= importe;
		}
		return total;
		
	}
}

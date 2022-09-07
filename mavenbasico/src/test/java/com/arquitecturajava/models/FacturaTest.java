package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FacturaTest {

	@Test
	@DisplayName(" calcula el importe con iva de la factura")
	public void calcularImporteIVA() {
		
		Factura f= new Factura(1,"ordenador",200);
		assertEquals(242,f.getImporteConIVA());
		
	}
	@Test
	@DisplayName("calcula retencion de la factura")
	void calcularRetencionFactura() {
		
		Factura f= new Factura(1,"ordenador",200);
		assertEquals(30,f.getImporteRetencion());
		
	}
	
	@Test
	@DisplayName("calcula importe con descuento")
	void calcularImporteConDescuentoFactura() {
		
		Factura f= new Factura(1,"ordenador",200);
		assertEquals(170,f.getImporteConDescuento());
		
	}

}

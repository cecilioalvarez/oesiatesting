package com.arquitecturajava.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FacturaTest {

	
	Factura f;
	
	@BeforeEach
	public void setUp() {
		
		f= new Factura(1,"ordenador",200);
	}
	
	@Test
	@DisplayName("prueba de setters")
	public void setterTest() {
		
		f.setConcepto("tablet");
		f.setNumero(1);
		f.setImporte(100);
		
		assertEquals("tablet",f.getConcepto());
		assertEquals(1,f.getNumero());
		assertEquals(100,f.getImporte());
		
	}
	
	@Test
	@DisplayName(" calcula el importe con iva de la factura")
	public void calcularImporteIVA() {
		
		assertEquals(242,f.getImporteConIVA());
		
	}
	@Test
	@DisplayName("calcula retencion de la factura")
	void calcularRetencionFactura() {
		
		assertEquals(30,f.getImporteRetencion());
		
	}
	
	@Test
	@DisplayName("calcula importe con descuento")
	void calcularImporteConDescuentoFactura() {
		
		assertEquals(170,f.getImporteConDescuento());
		
	}

	@AfterEach
	public void end() {
		
		f=null;
	}
}

package com.arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void sumaCalculadoratest() {
		//AAA (Arrange, Act , Assert)
		
		// arrange preparar el codido
		int numero1=3;
		int numero2=4;
		//Act actuar o ejecutar el codigo
		Calculadora c= new Calculadora();
		//Assert validar el codigo con la prueba unitaria
		double resultado=c.sumar(numero1, numero2);
		assertEquals (7,resultado);
		
		
	}

}

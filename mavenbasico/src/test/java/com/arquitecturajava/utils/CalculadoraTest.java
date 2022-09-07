package com.arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Calculadora sumar dos numeros")
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
	
	
	@Test
	@DisplayName("Calculadora restar dos numeros")
	void restaCalculadoratest() {
		
		int numero1=3;
		int numero2=4;
	
		Calculadora c= new Calculadora();
		
		double resultado=c.restar(numero1, numero2);
		assertEquals (-1,resultado);
		
		
	}
	@Test
	@DisplayName("Calculadora multiplicar dos numeros")
	void multiplicarCalculadoratest() {
		
		int numero1=3;
		int numero2=4;
	
		Calculadora c= new Calculadora();
		
		double resultado=c.multiplicar(numero1, numero2);
		assertEquals (12,resultado);
		
		
	}
	@Test
	
	@DisplayName("Calculadora dividir dos numeros")
	void dividirCalculadoratest() {
		
		int numero1=4;
		int numero2=2;
	
		Calculadora c= new Calculadora();
		
		double resultado=c.dividir(numero1, numero2);
		assertEquals (2,resultado);
		
		
	}
	
	

}

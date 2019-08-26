package com.db1.db1start;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	@Before 
	public void setUp() {
		calculadora = new Calculadora(20, 10);
	}
	
	@Test
	public void deveSomarDoisValores() { 								
		//Testando a soma de dois valores
		int soma = calculadora.somar();
		Assert.assertEquals(30, soma); 
	}
	
	@Test
	public void deveSubtrairDoisNumeros() { 							
		//Testando a subtracao de dois valores
		int subtracao = calculadora.subtrair();
		Assert.assertEquals(10, subtracao); 
	}
	
	@Test
	public void deveMultiplicarDoisNumeros() { 							
		//Testando a multiplicacao de dois valores
		int multiplicacao = calculadora.multiplicar();
		Assert.assertEquals(200, multiplicacao); 
	}
	
	@Test
	public void deveDividirDoisNumeros() { 								
		//Testando a divisao de dois valores
		int divisao = calculadora.dividir();
		Assert.assertEquals(2, divisao); 
	}
	
	@Test 
	public void deveRetornarNumeroPar() { 								
		//Testando se o numero e par
		int numeroPar = calculadora.numeroPar();
		Assert.assertEquals(20, numeroPar); 
	}
	
	@Test
	public void deveRetornarMaiorValor() { 								
		//Testando se o numero e maior que o outro numero
		int maiorValor = calculadora.maiorValor();
		Assert.assertEquals(20, maiorValor); 
	}
	
	@Test
	public void deveRetornarQuantidadeDeNumerosImpares() {				
		//Testando quantidade de numeros impares
		int quantidadeDeImpares = calculadora.quantidadeDeImpares();
		Assert.assertEquals(40, quantidadeDeImpares); 
	}
	
	@Test
	public void deveRetornarMenorValorEntreDoisValores() {				
		//Testando menor valor entre dois valores
		Double menorValor = calculadora.menorValorEntreDoisValores(25.5, 80.5);
		Assert.assertEquals(25.5, menorValor, 00.5); 
	}
	
	@Test
	public void deveRetornarMenorValorEntreTresValores() {				
		//Testando menor valor entre tres valores
		Double menorValor = calculadora.menorValorEntreTresValores(25.5, 80.5, 45.6);
		Assert.assertEquals(25.5, menorValor, 00.1); 
	}
	
	@Test
	public void deveRetornarMediaDeTresNumeros() { 						
		//Testando media de tres numeros
		Double media = calculadora.mediaDeTresNumeros(25.5, 80.5, 45.6);
		Assert.assertEquals(50.53, media, 00.5); 						
	}
	
	@Test
	public void deveCalcularAreaDeUmTriangulo() { 						
		//Testando calculo da area de um triangulo
		Double area = calculadora.areaDeUmTriangulo(38.6, 50.8);
		Assert.assertEquals(980.44, area, 000.4); 
	}
}

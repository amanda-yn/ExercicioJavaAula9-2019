package com.db1.db1start;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTeste {
	
	private Calculadora calculadora;
	
	@Before 
	public void setUp() {
		calculadora = new Calculadora(10, 20);
	}
	
	@Test
	public void deveSomarDoisValores() { //Testando a soma de dois valores
		int somar = calculadora.somar();
		Assert.assertEquals(25, somar); 
	}
	
	@Test
	public void deveSubtrairDoisNumeros() { //Testando a subtracao de dois valores
		int subtrair = calculadora.subtrair();
		Assert.assertEquals(6, subtrair); 
	}
	
	@Test
	public void deveMultiplicarDoisNumeros() { //Testando a multiplicacao de dois valores
		int multiplicar = calculadora.multiplicar();
		Assert.assertEquals(6, multiplicar); 
	}
	
	@Test
	public void deveDividirDoisNumeros() { //Testando a divisao de dois valores
		int dividir = calculadora.dividir();
		Assert.assertEquals(6, dividir); 
	}
	
	@Test 
	public void numeroDeveSerPar() { //Testando se o numero e par
		int numeroPar = calculadora.numeroPar();
		Assert.assertEquals(6, numeroPar); 
	}
	
	@Test
	public void deveReceberMaiorValor() { //Testando se o numero e maior que o outro numero
		int maiorValor = calculadora.maiorValor();
		Assert.assertEquals(6, maiorValor); 
	}
	
	@Test
	public void deveMostrarQuantidadeNumerosImpares() { //Testando se o numero e maior que o outro numero
		int quantidadeDeImpares = calculadora.quantidadeDeImpares();
		Assert.assertEquals(6, quantidadeDeImpares); 
	}
	
}

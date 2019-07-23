package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class TextoTeste {
	
	private static final String DB1START_SEM_ESPACO = "DB1START";
	private static final String DB1START_COM_ESPACO = " DB1START ";

	@Test
	public void deveRetornarLetrasMaiusculas() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String letrasMaiusculas = texto.letrasMaiusculas();
		Assert.assertEquals("AMANDA YUKIMI NARIMATSU", letrasMaiusculas); 
	}
	
	@Test
	public void deveRetornarLetrasMinusculas() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String letrasMinusculas = texto.letrasMinusculas();
		Assert.assertEquals("amanda yukimi narimatsu", letrasMinusculas); 
	}
	
	@Test
	public void deveRetornarQuantidadeDeLetras() {
		Texto texto = new Texto(DB1START_SEM_ESPACO);
		int quantidadeDeLetras = texto.quantidadeDeLetras();
		Assert.assertEquals(8, quantidadeDeLetras); 
	}
	
	@Test
	public void deveRetornarQuantidadeDeLetrasComEspacos() {
		Texto texto = new Texto(DB1START_COM_ESPACO);
		int quantidadeDeLetras = texto.quantidadeDeLetrasComEspacos();
		Assert.assertEquals(10, quantidadeDeLetras); 
	}
	
	@Test
	public void deveRetornarMesmaQuantidadeDeLetras() {
		Texto texto = new Texto(DB1START_COM_ESPACO);
		int textoTemp2 = texto.mesmaQuantidadeDeLetras(DB1START_SEM_ESPACO, DB1START_COM_ESPACO);
		Assert.assertEquals(DB1START_SEM_ESPACO.length(), textoTemp2);
	}
	
	@Test
	public void deveExibirSomenteQuatroPrimeirasLetrasDoNome() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String quatroPrimeirasLetrasDoNome = texto.quatroPrimeirasLetrasDoNome();
		Assert.assertEquals("Aman", quatroPrimeirasLetrasDoNome); 
	}
	
	@Test
	public void deveExibirPartirDaTerceiraLetraDoNome() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String terceiraLetraDoNome = texto.partirDaterceiraLetraDoNome();
		Assert.assertEquals("nda Yukimi Narimatsu", terceiraLetraDoNome); 
	}
	
	@Test
	public void deveExibirAsQuatroUltimasLetras() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String quatroUltimasLetras = texto.quatroUltimasLetrasDoNome();
		Assert.assertEquals("atsu", quatroUltimasLetras); 
	}
	
	@Test
	public void deveSubstituirPrimeiroNome() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String substituir = texto.substituirPrimeiroNome();
		Assert.assertEquals("ALUNA Yukimi Narimatsu", substituir); 
	}
	
	@Test
	public void deveExibirTextoSeparadamente() {
		Texto texto = new Texto("banana maça melancia");
		String[] separaString = texto.separandoTexto();
		String[] textoEsperado = {"banana", "maça", "melancia"};
		Assert.assertArrayEquals(textoEsperado, separaString); 
	}
	
	@Test
	public void exibirQuantidadeDeVogais() {
		Texto texto = new Texto("Curso DB1 Start");
		int quantidadeDeVogais = texto.quantidadeDeVogais();
		Assert.assertEquals(3, quantidadeDeVogais); 
	}
	
	@Test
	public void exibirTextoInvertido() {
		Texto texto = new Texto("Curso DB1 Start");
		String textoInvertido = texto.textoInvertido();
		Assert.assertEquals("tratS 1BD osruC", textoInvertido); 
	}
}

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
	public void deveRetornarQuantidadeDeLetrasSemEspacos() {
		Texto texto = new Texto(DB1START_SEM_ESPACO);
		int quantidadeDeLetras = texto.quantidadeDeLetras();
		Assert.assertEquals(8, quantidadeDeLetras); 
	}
	
	@Test
	public void deveRetornarQuantidadeDeLetrasComEspacos() {
		Texto textoComEspacos = new Texto(DB1START_COM_ESPACO);
		int quantidadeDeLetras = textoComEspacos.quantidadeDeLetrasComEspacos();
		Assert.assertEquals(10, quantidadeDeLetras); 
	}
	
	@Test
	public void deveRetornarMesmaQuantidadeDeLetrasDoTextoSemEspacos() {
		Texto texto = new Texto(DB1START_COM_ESPACO);
		int quantidadeDeLetras = texto.mesmaQuantidadeDeLetrasDoTextoSemEspacos(DB1START_SEM_ESPACO, DB1START_COM_ESPACO);
		Assert.assertEquals(DB1START_SEM_ESPACO.length(), quantidadeDeLetras);
	}
	
	@Test
	public void deveRetornarSomenteAsQuatroPrimeirasLetrasDoNome() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String quatroPrimeirasLetrasDoNome = texto.exibirAsQuatroPrimeirasLetrasDoNome();
		Assert.assertEquals("Aman", quatroPrimeirasLetrasDoNome); 
	}
	
	@Test
	public void deveRetornarNomePartirDaTerceiraLetra() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String NomePartirDaTerceiraLetra = texto.exibirNomePartirDaterceiraLetra();
		Assert.assertEquals("nda Yukimi Narimatsu", NomePartirDaTerceiraLetra); 
	}
	
	@Test
	public void deveExibirAsQuatroUltimasLetras() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String quatroUltimasLetras = texto.exibirAsQuatroUltimasLetrasDoNome();
		Assert.assertEquals("atsu", quatroUltimasLetras); 
	}
	
	@Test
	public void deveSubstituirPrimeiroNomePorAlunaOuAluno() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String primeiroNomeSubstituido = texto.substituirPrimeiroNomePorAlunaOuAluno();
		Assert.assertEquals("ALUNA Yukimi Narimatsu", primeiroNomeSubstituido); 
	}
	
	@Test
	public void deveExibirTextoSeparado() {
		Texto texto = new Texto("banana maca melancia");
		String[] textoSeparado = texto.separarTexto();
		String[] textoEsperado = {"banana", "maca", "melancia"};
		Assert.assertArrayEquals(textoEsperado, textoSeparado); 
	}
	
	@Test
	public void deveExibirQuantidadeDeVogais() {
		Texto texto = new Texto("Curso DB1 Start");
		int quantidadeDeVogais = texto.quantidadeDeVogaisDoTexto();
		Assert.assertEquals(3, quantidadeDeVogais); 
	}
	
	@Test
	public void deveRetornarTextoInvertido() {
		Texto texto = new Texto("Curso DB1 Start");
		String textoInvertido = texto.inverterTexto();
		Assert.assertEquals("tratS 1BD osruC", textoInvertido); 
	}
}

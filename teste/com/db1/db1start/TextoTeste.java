package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class TextoTeste {
	
	@Test
	public void deveRetornarLetrasMaiusculas() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String letrasMaiusculas = texto.letrasMaiusculas();
		Assert.assertEquals("AMANDA YUKIMI NARIMATSU", letrasMaiusculas); 
	}
	
	@Test
	public void deveRetornarLetrasMinusculas() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String letrasMinusculas = texto.letrasMaiusculas();
		Assert.assertEquals("amanda yukimi narimatsu", letrasMinusculas); 
	}
	
	@Test
	public void deveRetornarQuantidadeDeLetras() {
		Texto texto = new Texto("DB1START");
		int quantidadeDeLetras = texto.quantidadeDeLetras();
		Assert.assertEquals(9, quantidadeDeLetras); 
	}
	
	@Test
	public void deveExibirSomenteQuatroPrimeirasLetrasDoNome() {
		Texto texto = new Texto("Amanda Yukimi Narimatsu");
		String quatroPrimeirasLetrasDoNome = texto.quatroPrimeirasLetrasDoNome();
		Assert.assertEquals("Aman", quatroPrimeirasLetrasDoNome); 
	}
	
}

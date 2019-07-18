package com.db1.db1start;

public class Texto {
	
	private String texto1;
	
	public Texto (String texto1) {
		this.texto1 = texto1;
	}
	
	public String letrasMaiusculas() {
		return texto1.toUpperCase();
	}
	
	public String letrasMinusculas() {
		return texto1.toLowerCase();
	}
	
	public String quantidadeDeLetras() {
		return texto1.length();
	}
	
	public String quatroPrimeirasLetrasDoNome() {
		return ;
	}
}

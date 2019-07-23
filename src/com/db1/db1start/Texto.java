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
	
	public int quantidadeDeLetras() {		                         // "\\s" significa espaço e o "+" significa um ou mais
		String textoTemporario = texto1.replaceAll("\\s", "");    // "^" significa começo da string e "$" fim da string
		return textoTemporario.length();
	}
	
	public int quantidadeDeLetrasComEspacos() {
		String textoTemporario2 = texto1;
		return textoTemporario2.length();
	}
	
	public int mesmaQuantidadeDeLetras(String textoTemporario, String textoTemporario2) {
		if(textoTemporario.length() != textoTemporario2.length()) {
			return textoTemporario2.replaceAll("\\s", "").length();
		}
			return 0; 
	}
	
	public String quatroPrimeirasLetrasDoNome() {
		return texto1.substring(0, 4);              //Exibir a partir da posição 0 até a 4
	}
	
	public String partirDaterceiraLetraDoNome() {
		return texto1.substring(3);                 //Exibir a partir da terceira posição
	}
	
	public String quatroUltimasLetrasDoNome() {
		return texto1.substring(19);                 //Exibir a partir da 19° posição
	}
	
	public String substituirPrimeiroNome() {
		String[] separaString = texto1.split(" ");
		return texto1.replace(separaString[0], "ALUNA");
	}
	
	public String[] separandoTexto() {               				//verificar
		String[] separaString = texto1.split("\\s");
		return separaString;
	}
	
	public int quantidadeDeVogais() {
		String consoantes = texto1.replaceAll("[AEIOUaeiou]", "");
		int vogais = texto1.length() - consoantes.length();
		return vogais;
	}
	
	public String textoInvertido() {
		String invertido = new StringBuilder(texto1).reverse().toString(); //verificar
		return invertido;
	}
}

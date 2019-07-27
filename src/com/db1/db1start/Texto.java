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
	
	public int quantidadeDeLetras() {		                        // "\\s" significa espaço e o "+" significa um ou mais
		String textoTemporario = texto1.replaceAll("\\s", "");    	// "^" significa começo da string e "$" fim da string
		return textoTemporario.length();
	}
	
	public int quantidadeDeLetrasComEspacos() {
		String textoTemporario2 = texto1;
		return textoTemporario2.length();
	}
	
	public int mesmaQuantidadeDeLetrasDoTextoSemEspacos(String textoTemporario, String textoTemporario2) {
		if(textoTemporario.length() != textoTemporario2.length()) {
			return textoTemporario2.replaceAll("\\s", "").length();
		}
			return 0; 
	}
	
	public String exibirAsQuatroPrimeirasLetrasDoNome() {
		System.out.println(texto1.substring(0, 4));
		return texto1.substring(0, 4);              	//Exibir a partir da posição 0 até a 4
	}
	
	public String exibirNomePartirDaterceiraLetra() {
		System.out.println(texto1.substring(3));
		return texto1.substring(3);                 	//Exibir a partir da terceira posição
	}
	
	public String exibirAsQuatroUltimasLetrasDoNome() {
		System.out.println(texto1.substring(19));
		return texto1.substring(19);                 	//Exibir a partir da 19° posição
	}
	
	public String substituirPrimeiroNomePorAlunaOuAluno() {
		String[] separaString = texto1.split(" ");
		return texto1.replace(separaString[0], "ALUNA");
	}
	
	public String[] separarTexto() {   
		String[] separaString = texto1.split(" ");
		System.out.println(separaString[0] + "\n" + separaString[1] + "\n" + separaString[2] + "\n");
		return separaString;
	}
	
	public int quantidadeDeVogaisDoTexto() {
		String consoantes = texto1.replaceAll("[AEIOUaeiou]", "");
		int vogais = texto1.length() - consoantes.length();
		System.out.println(vogais);
		return vogais;
	}
	
	public String inverterTexto() {
		String invertido = new StringBuilder(texto1).reverse().toString();
		return invertido;
	}
}

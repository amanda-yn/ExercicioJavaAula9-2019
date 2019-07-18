package com.db1.db1start;

public class App {
	
	public static void main(String[] args) {
		int tamanhoDoNome = Nome.quantidadeDeCaracteres("Amanda");
		
		System.out.println("O resultado da soma e: " + NumeroInteiro.operacaoSoma(30, 50) + "\n" +
		"O resultado da subtracao e: " + NumeroInteiro.operacaoSubtracao(54, 20));
		
		System.out.println("O menor valor entre dois valores e: " + 
		NumeroReal.menorValor2(70.6, 50.4) + "\nO menor valor entre tres valores e: " + 
		NumeroReal.menorValor3(20.2, 10.1, 80.5));
		
		System.out.println("\nTexto maiusculo: " + Texto.letrasMaiusculas("Aula de JAVA DB1 start 2019") + "\n" + 
		"Texto minusculo: " + Texto.letrasMinusculas("Aula de SQLlte DB1 Start 2019"));
		System.out.println("\nTamanho do nome: " + tamanhoDoNome);
	}
}

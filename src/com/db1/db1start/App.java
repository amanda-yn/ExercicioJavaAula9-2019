package com.db1.db1start;

public class App {
	
	public static void main(String[] args) {
		//int tamanhoDoNome = Nome.quantidadeDeCaracteres("Amanda");
		
		//Estanciando um objeto; Referenciando a outra classe; Chamando a classe.
		Calculadora calculadora = new Calculadora(10, 20); 
		//Calculadora calculadora1 = new Calculadora(20, 14);
		
		System.out.println(calculadora.somar());
		System.out.println(calculadora.subtrair());
		System.out.println(calculadora.multiplicar());
		System.out.println(calculadora.dividir());
		System.out.println(calculadora.numeroPar());
		System.out.println(calculadora.maiorValor());
		System.out.println(calculadora.quantidadeDeImpares());
		
		/*
		System.out.println("O resultado da soma e: " + NumeroInteiro.operacaoSoma(30, 50) + "\n" +
		"O resultado da subtração e: " + NumeroInteiro.operacaoSubtracao(54, 20));
		
		System.out.println("O menor valor entre dois valores e: " + 
		NumeroReal.menorValor2(70.6, 50.4) + "\nO menor valor entre tres valores e: " + 
		NumeroReal.menorValor3(20.2, 10.1, 80.5));
		
		System.out.println("\nTexto maiusculo: " + Texto.letrasMaiusculas("Aula de JAVA DB1 start 2019") + "\n" + 
		"Texto minusculo: " + Texto.letrasMinusculas("Aula de SQLlte DB1 Start 2019"));
		System.out.println("\nTamanho do nome: " + tamanhoDoNome);
		*/
	}
}

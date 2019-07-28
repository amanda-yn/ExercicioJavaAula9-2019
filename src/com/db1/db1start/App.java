package com.db1.db1start;

public class App {
	
	public static void main(String[] args) {
		//Teste no console - rascunho

		//Estanciando um objeto; Referenciando a outra classe; Chamando a classe.
		Calculadora calculadora = new Calculadora(20, 10); 
		
		System.out.println(calculadora.somar());
		System.out.println(calculadora.subtrair());
		System.out.println(calculadora.multiplicar());
		System.out.println(calculadora.dividir());
		System.out.println(calculadora.numeroPar());
		System.out.println(calculadora.maiorValor());
		System.out.println(calculadora.quantidadeDeImpares());
		System.out.println(calculadora.menorValorEntreDoisValores(25.5, 80.5));
		System.out.println(calculadora.menorValorEntreTresValores(25.5, 80.5, 45.6));
		System.out.println(calculadora.mediaDeTresNumeros(25.5, 80.5, 45.6));
		System.out.println(calculadora.areaDeUmTriangulo(25.5, 80.5));
		
		Texto texto = new Texto(" DB1 START ");
		System.out.println(texto.mesmaQuantidadeDeLetrasDoTextoSemEspacos("DB1START", " DB1START "));
	}
}

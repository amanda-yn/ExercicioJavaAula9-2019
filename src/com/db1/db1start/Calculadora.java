package com.db1.db1start;

public class Calculadora {
	
	private int numero1, numero2;
	
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1; // O this estancia/referencia as variaveis da classe Calculadora (classe acima).
		this.numero2 = numero2; // Os valores dos parâmetros serão passados para as variaveis da classe.
	}
	
	//MÉTODO ESTANCIADO
	public int somar() {
		return (numero1 + numero2);
	}
	
	public int subtrair() {
		return (numero1 - numero2);
	}
	
	public int multiplicar() {
		return (numero1 * numero2);
	}
	
	public int dividir() {
		return (numero1 / numero2);
	}
	
	public int numeroPar() {
		if((numero1 % 2) == 0) {
			System.out.println("O numero " + numero1 + " e par");
			return numero1;
		}
		else {
			System.out.println("O numero " + numero1 + " nao e par");
			return 0;
		}
	}
	
	public int maiorValor() {
		if (numero1 > numero2) {
			return numero1;
		}
		else {
			return numero2;	
		}
	}
	
	public int quantidadeDeImpares() { 			
		int contador = 0;
		for(int i = numero1; i<=100 ; i++) {
			if((i % 2) != 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public double menorValorEntreDoisValores(Double numero1, Double numero2) {
		if (numero1 < numero2) {
			return numero1;
		}
		else {
			return numero2;
		}
	}
	
	public double menorValorEntreTresValores(Double numero1, Double numero2, Double numero3) {
		if (numero1 < numero2 && numero1 < numero2) {
			return numero1;
		}
		else if (numero2 < numero1 && numero2 < numero3) {
			return numero2;
		}
		else if (numero3 < numero1 && numero3 < numero2) {
			return numero3;
		}
			return 0;
	}
	
	public double mediaDeTresNumeros(Double numero1, Double numero2, Double numero3) {
		Double media = ((numero1 + numero2 + numero3)/3);
		return media;
	}
		
	public double areaDeUmTriangulo(Double altura, Double base) {
		Double area = (base * altura)/2;
		return area;
	}
}

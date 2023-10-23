package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preço atual do dólar?: ");
		double precoDolar = sc.nextDouble();
		
		System.out.println("Quantos dólares serão comprados?: ");
		double dolarComprado =sc.nextDouble();
		
		double pagamentoReais= CurrencyConverter.conversor(precoDolar, dolarComprado);
		System.out.printf("Quantidade a ser paga em reais: R$ %.2f%n ", pagamentoReais);
		
		
		sc.close();

	}

}

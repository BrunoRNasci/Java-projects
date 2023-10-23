package application;

import java.util.Scanner;

import entities.Product;

public class Programm2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as informações do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Product produto = new Product(nome, preco, quantidade);
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos para ser adicionado no estoque: ");
		quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados do produto atualizado: " + produto);
		
		
		System.out.println();
		System.out.println("Entre com o número de produtos para serem retirados no estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados do produto atualizado: " + produto);
		
		sc.close();

	}

}

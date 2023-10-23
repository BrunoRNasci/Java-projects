package exercicio1;

import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e a altura do ret�ngulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		double area = retangulo.area();
		double perimetro = retangulo.perimetro();
		double diagonal = retangulo.diagonal();
		
		System.out.println();
		System.out.print("�rea: " + area);
		
		System.out.println();
		System.out.print("Per�metro: " + perimetro);
		
		System.out.println();
		System.out.print("Diagonal: " + diagonal);
		
		sc.close();
	

	}

}

package exercicio2;

import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario func;
		func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.next();
		
		System.out.println();
		System.out.print("Salário: ");
		
		func.salarioBruto = sc.nextDouble();
		
		System.out.println();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + func);
		

		System.out.println();
		System.out.print("Qual a porcentagem do aumento do salário?: ");
		double porcenatem = sc.nextDouble();
		func.aumentoSalario(porcenatem);
		
		System.out.println("Dados atualizados: " + func);
		
		sc.close();

	}

}

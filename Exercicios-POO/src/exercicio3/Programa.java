package exercicio3;

import java.util.Scanner;

import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno;
		aluno = new Aluno();
		
		System.out.print("Informe seu nome:");
		aluno.nome = sc.next();
		
		System.out.println();
		System.out.print("Informe suas notas:");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();

		System.out.printf("Nota Final: %.2f%n", aluno.media());
		
		if(aluno.media()<60) {
			System.out.println("Reprovado");
			System.out.printf("Nota restante necessária: %.2f%n", aluno.notaRestante());
		}
		else {
			System.out.println("Aprovado");
		}
		
		
		
		sc.close();
	}

}

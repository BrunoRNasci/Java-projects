import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int peca1 = sc.nextInt();
		int numPeca1 = sc.nextInt();
		double precoUni1 = sc.nextDouble();
		int peca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();
		double precoUni2 = sc.nextDouble();
		double total = (numPeca1 * precoUni1 + numPeca2 * precoUni2);
		
		System.out.println("Código produtos: " + peca1 + ", " + peca2 );
		System.out.printf("Total a pagar: R$ %.2f%n", total);
		
		sc.close();
	}

}

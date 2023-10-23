import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double discont;
		
		if (salario <=2000) {
			discont = 0.0;
		}
		else if (salario<=3000.00) {
			discont = (salario - 2000) * 0.08;
			
		}
		else if (salario <=4500.0) {
			discont = (salario - 3000.0) * 0.18 +1000 * 0.08;
		}
		else {
			discont = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.8;
		}
		
		if (discont==0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", discont);
		}
		sc.close();
	}

}

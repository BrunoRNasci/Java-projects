import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc = sc.nextInt();
		int horas = sc.nextInt();
		double salarioHora = sc.nextDouble();
		double salario = horas * salarioHora;
		
		System.out.println("Número Funcionário: " + numFunc);
		System.out.printf("Salário: R$ %.2f%n  ", salario);
		
		sc.close();
	}

}

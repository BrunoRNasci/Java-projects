import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int senha = 2002;
		System.out.println("Insira a senha: ");
		int input = sc.nextInt();
		
		while (input != senha) {
			input = sc.nextInt();
			System.out.println("Senha inválida");
			
		}
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int clienteAlc = 0;
		int clienteGas = 0;
		int clienteDiesel = 0;
		
		while (input != 0) {
			if (input == 1) {
				clienteAlc += input;
				System.out.println("Álcool : " + clienteAlc);
				
			}
			else if (input == 2) {
				clienteGas += input / 2;
				System.out.println("Gasolina : " + clienteGas);
			
			}
			else if(input == 3) {
				clienteDiesel += input / 3;
				System.out.println("Diesel : " + clienteDiesel);
				
			}
			else if (input == 4) {
				System.out.println("Muito Obrigado " );
				System.out.println("Álcool: " + clienteAlc);
				System.out.println("Gasolina :" + clienteGas);
				System.out.println("Diesel : " + clienteDiesel);
			}
			input = sc.nextInt();
		}
		sc.close();
	
	}

}

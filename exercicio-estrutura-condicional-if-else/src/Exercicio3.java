import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		
		
		if( N1 % N2 == 0 || N2 % N1 == 0) {
			System.out.println("S�o M�ltiplos");
		}
		else {
			System.out.println("N�o M�ltiplos");
		}
		
		sc.close();
	}

}

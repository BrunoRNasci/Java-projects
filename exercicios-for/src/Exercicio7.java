import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			int a = i*i;
			int b =  i*i*i;
			
			System.out.println(i + ", " + a + ", " + b);
			
		}
		sc.close();
	}

}

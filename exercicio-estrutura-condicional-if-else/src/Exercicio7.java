import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x==0 && y ==0) {
			System.out.println("Ponto de origem");
		}
		else if (x > 0 && x <=5 && y >0 && y<=5) {
			System.out.println("Q1");
		}
		else if (x >=-5 && x <=-0.1 && y >0 && y<=5) {
			System.out.println("Q2");
		}
		else if (x >=-5 && x <=-0.1 && y >=-5 && y<=0.1) {
			System.out.println("Q3");
		}
		else if (x > 0 && x <=5 && y >=-5 && y<=-0.1) {
			System.out.println("Q4");
		}
		else if (x==0) {
			System.out.println("Eixo Y");
		}
		else if (y==0) {
			System.out.println("Eixo X");
		}
	
		sc.close();
	}

}

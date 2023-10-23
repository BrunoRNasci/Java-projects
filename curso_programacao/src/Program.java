import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Digite as medidas do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite as medidas do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();

		
		double areaY = y.area();
		System.out.printf("Area do tri�ngulo X: %.4f%n", areaX);
		System.out.printf("Area do tri�ngulo Y: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Maior �rea: X");
		} else {
			System.out.println("Maior �rea: Y");
		}

		sc.close();	}

}

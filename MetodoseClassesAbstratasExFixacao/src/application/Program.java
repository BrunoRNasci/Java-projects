package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitities.Company;
import entitities.Individual;
import entitities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)?: ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual Income: ");
			double annualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenses = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenses));
			}else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
			
		}
		
		System.out.println("TAXES PAYED: ");
		for(TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
		}
		
		double sum = 0.0;
		for(TaxPayer taxPayer : list) {
			sum += taxPayer.tax();
		}
		
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}

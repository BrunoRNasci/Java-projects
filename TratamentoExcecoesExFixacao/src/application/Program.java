package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinnesException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.print("Enter the amount for withdraw: ");
		double  withdraw = sc.nextDouble();
		
		
		
		try {
			acc.withdrawn(withdraw);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		}
		catch(BusinnesException e){
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		
		
		sc.close();
	}

}

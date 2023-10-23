import java.util.Locale;

public class Exercicio_fixacao {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Service Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.printf("Record: " + age + " years old, code " + code + " and gender: " + 		gender + "%n");
		System.out.printf("Measure with 8 decimal places: " + measure + "%n" + "Rouded (three 		decimal places): " + "%.3f%n", 		measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: " + measure);

	}

}

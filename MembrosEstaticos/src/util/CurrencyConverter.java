package util;

public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double conversor(double dolarComprado, double precoDolar) {
		return  dolarComprado * precoDolar * (1.0 + IOF) ;
	}
}

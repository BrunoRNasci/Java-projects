package entidades;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double area() {
		double a = largura * altura;
		return a;
	}
	
	public double perimetro() {
		double p = 2*(largura+altura);
		return p;
	}
	
	public double diagonal() {
		return  Math.sqrt( Math.pow(altura, 2) + Math.pow(largura, 2));
		
	}
		
}

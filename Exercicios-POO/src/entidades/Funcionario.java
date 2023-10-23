package entidades;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentoSalario (double porcentegem) {
		salarioBruto += salarioBruto * porcentegem / 100.0;
	}
	
	public String toString() {
		return nome + ", $" + String.format("%.2f", salarioLiquido()); 
	}
}


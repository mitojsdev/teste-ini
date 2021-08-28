package entities;

public class ContaBancaria {

	private int numero;
	private String nome;
	private double saldoInicial;
	
	
	
	public ContaBancaria(int numero, String nome, double saldoInicial) {
	
		this.numero = numero;
		this.nome = nome;
		this.saldoInicial = saldoInicial;
	}

	public ContaBancaria(int numero, String nome) {
	
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	
	
	public double saque(double valor) {
		return saldoInicial = saldoInicial - valor - 5.00;
	}
	
	public double deposito (double deposito) {
		return saldoInicial += deposito;
	}
	
	public String toString() {
		return "Número: " 
				+ numero
				+ ", Titular: "
				+ nome
				+ ", Saldo: $ "
				+ String.format("%.2f%n", saldoInicial);
	}
	
	
	
}

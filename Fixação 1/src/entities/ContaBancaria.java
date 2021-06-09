package entities;

public class ContaBancaria {

	private long numero;
	private String nome;
	private double saldo;
	private final double TAXA = 5.0;

	public ContaBancaria(long numero, String nome, double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public ContaBancaria(long numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getNumero() {
		return numero;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
		this.saldo -= (valor + this.TAXA);
	}
	
	public String toString() {
		return "N�mero: " + this.getNumero() + "\nNome: " + this.getNome() + "\nSaldo: " + String.format("%.2f%n", this.saldo);
	}

}

package jooapaulonovaes;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;

	
	public int getNumero() {
		return this.numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
	public double getSaldo() {
		return this.saldo;	
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Seu saldo é insuficiente! Saldo total: " + this.saldo) ;
		}
		this.saldo = saldo - valor;
		
	}
	public void depositar(double valor) {
		this.saldo = saldo + valor;
	
	}
	public double checarSaldo() {
		return this.saldo;
	}
	public void transferir(double valorTransferido, Conta destino) {
		if(this.saldo < valorTransferido) {
			System.out.println("Você não possue saldo o suficiente para realizar a transferencia!");
		}else	{		
		destino.saldo = destino.saldo + valorTransferido;
		System.out.println("Transferencia feita com sucesso!");
		
		}
	}
}
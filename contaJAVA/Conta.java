package contaJAVA;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;

	public Conta (int numero, String titular) {
	
	this.numero = numero;
	this.titular = titular;
	this.setSaldo(0);
	
	}
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
	private void setSaldo(double saldo) {
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
	public void transferir(double valorTransferido, Conta destino) {
		if(this.saldo < valorTransferido) {
		System.out.println("Você não possue saldo o suficiente para realizar a transferencia!");
		}else	{	
		this.saldo = saldo - valorTransferido;	
		destino.saldo = destino.saldo + valorTransferido;
		System.out.println("O valor de R$"+ valorTransferido + " foi transferido com sucesso!");
		
		}
	}
}
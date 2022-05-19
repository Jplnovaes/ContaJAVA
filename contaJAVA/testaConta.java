package contaJAVA;

public class testaConta {

	public static void main(String[] args) {
		
		Conta joao = new Conta(450, "João");
		
		
		Conta paulo = new Conta(451, "Pedro");
		
		paulo.depositar(5000.00);
		joao.depositar(5000.00);
		
		System.out.println("================================");
		
		System.out.println(paulo.getTitular() + ": seu saldo é de: R$" + paulo.getSaldo());
		System.out.println(joao.getTitular() + ": seu saldo é de: R$" + joao.getSaldo());
		
		System.out.println("================================");
				
		paulo.transferir(2000, joao);
		
		System.out.println("================================");
		System.out.println(paulo.getTitular() + ": seu saldo é de: R$" + paulo.getSaldo());
		System.out.println(joao.getTitular() + ": seu saldo é de: R$" + joao.getSaldo());
		System.out.println("================================");
	}

}

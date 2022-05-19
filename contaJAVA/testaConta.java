package jooapaulonovaes;

public class testaConta {

	public static void main(String[] args) {
		
		Conta joao = new Conta();
		joao.setNumero(15);
		joao.setTitular("João");
		joao.setSaldo(5000.0);
		
		Conta paulo = new Conta();
		paulo.setNumero(30);
		paulo.setTitular("Paulo");
		paulo.setSaldo(25000.0);
		
		System.out.println("======================");
		System.out.println("Seu saldo é de : " + paulo.getSaldo());
		System.out.println("======================");
		paulo.transferir(1000, joao);
		System.out.println("======================");
		System.out.println(paulo.getTitular() + ": seu saldo é de : " + paulo.getSaldo());
		System.out.println(joao.getTitular() + ": seu saldo é de : " + joao.getSaldo());
		System.out.println("======================");
	}

}

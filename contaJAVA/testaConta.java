package jooapaulonovaes;

public class testaConta {

	public static void main(String[] args) {
		
		Conta joao = new Conta();
		joao.setNumero(15);
		joao.setTitular("Jo�o");
		joao.setSaldo(5000.0);
		
		Conta paulo = new Conta();
		paulo.setNumero(30);
		paulo.setTitular("Paulo");
		paulo.setSaldo(25000.0);
		
		System.out.println("======================");
		System.out.println("Seu saldo � de : " + paulo.getSaldo());
		System.out.println("======================");
		paulo.transferir(1000, joao);
		System.out.println("======================");
		System.out.println(paulo.getTitular() + ": seu saldo � de : " + paulo.getSaldo());
		System.out.println(joao.getTitular() + ": seu saldo � de : " + joao.getSaldo());
		System.out.println("======================");
	}

}

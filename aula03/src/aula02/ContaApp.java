package aula02;

public class ContaApp {

	public static void main(String[] args) {
		double saldotemp;
		
		Conta conta01 = new Conta(); // Criando um objeto
		
		conta01.setNumero(1);
		conta01.getNumero();
		conta01.setNome("Ruth");
		
		Conta conta1 = new Conta(1, "Angelo", 100, 1000);
		
		Conta conta2 = new Conta(2, "Ruth", 3000);
		conta2.setNome("Ruth Menegel");
		
		conta2.limite = 33000;
		
		conta1.saldo = 3;
		conta1.saca(1); // saldo = 2
		saldotemp = conta1.saca(1, 10); // saldo = 3

		System.out.println("Saldo do objeto - saca: " + conta1.saldo);
		System.out.println("Saldo temporario - saca: " + saldotemp);

	}

}

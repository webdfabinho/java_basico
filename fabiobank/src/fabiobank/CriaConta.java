package fabiobank;

public class CriaConta {
	public static void main(String[] args) {
		conta primeiraConta = new conta();
		primeiraConta.saldo = 500;
		
		System.out.println( "Saldo anterior da Primeira conta:");
		System.out.println( "R$ " + primeiraConta.saldo);
		
		System.out.println( " ");
		System.out.println( "Deposito de R$ 300,00 efetuado.");
		primeiraConta.saldo += 300;
		System.out.println( "R$ " + primeiraConta.saldo);
		
		conta segundaConta = new conta();
		segundaConta.saldo = 120;
		
		System.out.println( " ");
		System.out.println( "Primeira conta tem Saldo de: R$ " + primeiraConta.saldo);
		System.out.println( "Segunda conta tem Saldo de: R$ " + segundaConta.saldo);
		
		System.out.println( " ");
		System.out.println( "Primeira Conta ");
		System.out.println( "Agencia " + primeiraConta.agencia);
		System.out.println( "Conta " + primeiraConta.numero);
		
		segundaConta.agencia = 455;//Aqui demos um valor a referencia segundaConta.
		System.out.println( " ");
		System.out.println( "Segunda Conta ");
		System.out.println( "Agencia " + segundaConta.agencia);
		System.out.println( "Conta " + segundaConta.numero);
		
		if (primeiraConta == segundaConta) {
			System.out.println( " ");
			System.out.println( "Mesma Conta!");
		} else {
			System.out.println( " ");
			System.out.println( "Contas Diferentes!");//abaixo esta a representação do porque do resultado contas diferentes. 
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}

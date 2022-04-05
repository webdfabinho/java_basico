package fabiobank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		conta primeiraConta = new conta();
		primeiraConta.saldo = 800;
		System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
		
		conta segundaConta = primeiraConta;
		System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 200;
		System.out.println("Novo Saldo da Segunda Conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo); //O resultado ser� igual a segunda conta, pois ambas est�o referenciando para o mesmo objeto (conta)
		
		if(primeiraConta == segundaConta) {
			System.out.println("S�o a mesma coisa ou referenciam para o mesmo Objeto.");
		}
	}
}

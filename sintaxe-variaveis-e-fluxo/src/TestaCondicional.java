
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println ("Testando Condicionais");
		
		int idade = 16;
		int quantidadeDePessoas = 3;
		
		if (idade >= 18) {
			System.out.println ("Você tem 18 anos ou mais.");
			System.out.println ("Seja Bem Vindo!!!");
		}
		else {
			if (quantidadeDePessoas >= 2) {
				System.out.println ("Você não tem 18 anos, como esta acompnhado, pode entrar!");
			} else {
				System.out.println  ("Desculpe, infelizmente você não pode entrar!");
			}
		}
	}
}

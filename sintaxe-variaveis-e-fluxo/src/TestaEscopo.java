
public class TestaEscopo {
	
	public static void main(String[] args) {
		System.out.println ("Testando Condicionais");
		
		boolean acompanhado;
		int idade = 206;
		int quantidadeDePessoas = 3;
		//boolean acompanhado = quantidadeDePessoas >= 2; 
		
		if (quantidadeDePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
			
		System.out.println("O Valor de Acompanhado = " + acompanhado); 
		
		if (idade >= 18 && acompanhado) {
			System.out.println ("Seja Bem Vindo!!!"); 
		}
		else {
			System.out.println  ("Desculpe, infelizmente você não pode entrar!");
		}
	}

}

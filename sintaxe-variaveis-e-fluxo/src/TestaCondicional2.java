
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println ("Testando Condicionais");
		
		int idade = 206;
		int quantidadeDePessoas = 3;
		boolean acompanhado = quantidadeDePessoas >= 2; 
		
		int idade2 = 68;
		boolean ehIdoso = idade2 >= 65;
		
		System.out.println(ehIdoso);// Confirma valor booleano 
		
		//if (idade >= 18 && quantidadeDePessoas >= 2) (  condicional e.
		
		//if (idade >= 18 || quantidadeDePessoas >= 2) { condicional ou
		
		System.out.println("O Valor de Acompanhado = " + acompanhado); // Confirma valor booleano 
		
		if (idade >= 18 && acompanhado) {
			System.out.println ("Seja Bem Vindo!!!"); //Valor Boleano que só aceita true ou false. 
		}
		else {
			System.out.println  ("Desculpe, infelizmente você não pode entrar!");
		}
	}
}
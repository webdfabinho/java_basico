
public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);//Para caracteres colocamos aspas simples.
		
		char valor = 66;
		System.out.println(valor);//Chama o valor de um caracter.
		
		valor = (char) (valor +1);
		System.out.println(valor);//Chama um valor de um caracter + 1.
		
		String frase = "Estou Aprendendo Java!";
		System.out.println(frase);
		
		frase = frase + 2022;
		System.out.println (frase);
		
		String parcela1 = "10";
		String parcela2 = "20";
		
		System.out.println(parcela1 + parcela2);// Exemplo de concatenação

	}

}

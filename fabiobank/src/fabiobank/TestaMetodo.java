package fabiobank;

public class TestaMetodo {
	public static void main(String[] args) {
		conta contaDoFabio = new conta();
		contaDoFabio.saldo = 1900;
		contaDoFabio.deposita(50);
		System.out.println( "R$ " + contaDoFabio.saldo);
		
	}
}

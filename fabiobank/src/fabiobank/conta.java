package fabiobank;

public class conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
}

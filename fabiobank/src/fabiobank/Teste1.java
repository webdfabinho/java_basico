package fabiobank;

public class Teste1 {
	public static void main(String [] args) {
        conta minhaConta = new conta();
        minhaConta.saldo = 500.0;
        conta outraConta = minhaConta;
        outraConta.saldo += 1000.0;// neste ponto ele adiciona 1000 ao objeto conta.
        System.out.println( "R$ " + minhaConta.saldo);
    }
}

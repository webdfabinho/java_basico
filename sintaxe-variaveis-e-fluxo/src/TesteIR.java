
public class TesteIR {

    public static void main(String[] args) {

        double salario = 4500.0;

        if(salario < 2500.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350");
        } else {
            System.out.println("A sua aliquota é de 22,5%");
            System.out.println("Você pode deduzir até R$ 636");
        }
    }    
}
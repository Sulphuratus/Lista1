import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float dolar, cotacao, real;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a cotação vigente do Dólar: ");
        cotacao = leia.nextFloat();

        System.out.println("Qual valor em reais deseja converter? ");
        real = leia.nextFloat();

        dolar = real/cotacao;

        System.out.println("O valor corresponde a " + dolar + " dólares.");
    }
}

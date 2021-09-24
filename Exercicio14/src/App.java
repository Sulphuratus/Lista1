import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        float numero;
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        numero = leia.nextFloat();

        if (numero > 0){
            System.out.println("\nO quadrado de " + numero + " é " + df.format(Math.pow(numero,2)));
            System.out.println("\nA raiz quadrada de " + numero + " é " + df.format(Math.sqrt(numero)));
        } else {
            System.out.println("\nO número não é positivo!\n");
        }
        
    }
}

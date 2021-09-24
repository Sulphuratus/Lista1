import java.util.Scanner;

// EXERCICIO 08: PROGRAMA QUE CALCULA A ÁREA DE UM CÍCULO 

public class App {
    public static void main(String[] args) throws Exception {
        double area, raio;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");

        raio = leia.nextDouble();

        area = Math.PI * Math.pow(raio, 2);
        
        System.out.println("A área do círculo é: " + area);
    }
}

import java.util.Scanner;

// EXERCICIO 04: PROGRAMA QUE LÊ A VELOCIDADE EM KM/H E 
// CONVERTE EM M/S

public class App {
    public static void main(String[] args) throws Exception {
        float k,m;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a velocidade em km/h: ");
        k = leia.nextFloat();

        m = k/36;
          
        System.out.println("A velocidade em m/s é de: " + m);
    }
}

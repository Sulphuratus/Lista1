import java.util.Scanner;

// PROGRAMA QUE LÊ TEMPERATURA EM GRAUS CÉLSIUS 
// E CONVERTE PARA GRAUS FAHRENHEITS

public class App {
    public static void main(String[] args) throws Exception {
        float c, f;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Célsius: ");
        c = leia.nextFloat();

        f = c*9/5 + 32;
        
        System.out.println("A temperatura de " + c + " graus Célsius corresponde a " + f + " graus Fahrenheits.");
    }
}

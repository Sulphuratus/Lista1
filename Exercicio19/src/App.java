import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int tipo;
        double x, y, z, media;
        DecimalFormat df = new DecimalFormat("#.##");
        
        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite o primeiro número: ");
        x = leia.nextDouble();

        System.out.println("\nDigite o segundo número: ");
        y = leia.nextDouble();

        System.out.println("\nDigite o terceiro número: ");
        z = leia.nextDouble();

        System.out.println("\nDigite o número da média desejada: 1- Geométrica, 2- Ponderada, 3- Aritmética");
        tipo = leia.nextInt();

        if ( tipo == 1 ){
            media = x * y *z;
            System.out.println("\nA média geométrica entre " + x + ", " + y + ", e " + z + " é " + df.format(media));
        }else if ( tipo == 2 ){
            media = (x + 2 * y + 3 * z) / 6;
            System.out.println("\nA média ponderada entre " + x + ", " + y + ", e " + z + " é " + df.format(media));
        }else if ( tipo == 3 ){
            media = (x + y +  z) / 3;
            System.out.println("\nA média aritmética entre " + x + ", " + y + ", e " + z + " é " + df.format(media));
        }else{
            System.out.println("\nOpção inválida: Fim do programa!!");
        }
        
    }
}

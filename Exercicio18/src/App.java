//import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double peso, altura;
        
        Scanner leia = new Scanner(System.in);
//        leia.useLocale(Locale.US);

        System.out.println("\nDigite a altura em metros: ");
        altura = leia.nextDouble()*100;

        System.out.println("\nDigite o peso: ");
        peso = leia.nextDouble();
        
        if (altura < 120 ){
            if( peso <= 60 ){
                System.out.println("\nA pessoa tem classificação A");
            }else if( peso > 60 && peso <= 90 ){
                System.out.println("\nA pessoa tem classificação D");
            }else if( peso > 90 ){
                System.out.println("\nA pessoa tem classificação G");
            }
        }else if ( altura >= 120 && altura <= 170 ){
            if( peso <= 60 ){
                System.out.println("\nA pessoa tem classificação B");
            }else if( peso > 60 && peso <= 90 ){
                System.out.println("\nA pessoa tem classificação E");
            }else if( peso > 90 ){
                System.out.println("\nA pessoa tem classificação H");
            }
        }else if ( altura > 170 ){
            if( peso <= 60 ){
                System.out.println("\nA pessoa tem classificação C");
            }else if( peso > 60 && peso <= 90 ){
                System.out.println("\nA pessoa tem classificação F");
            }else if( peso > 90 ){
                System.out.println("\nA pessoa tem classificação I");
            }
        }
    }
}

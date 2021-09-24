import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int num;
        double divTres, divCinco;

        Scanner leia = new Scanner(System.in);
        
        System.out.println("\nDigite um número inteiro qualquer: ");
        num = leia.nextInt();

        divTres = num % 3;
        divCinco = num % 5;

        /*if ( divTres == 0 || divCinco == 0){
            if ( divCinco != 0 || divTres != 0){
                System.out.println("Este número não é divisível por 3 e 5 simultaneamente!");
            }else{
                System.out.println("Este número é divisível por 3 e por 5 simultaneamente");
            }
        }else{
            System.out.println("Este número não é divisível nem por 3 nem por 5!");
        }*/

        if ( divTres != 0 ){
            if ( divCinco == 0 ){
                System.out.println("\nEste número é divisível por 3 ou 5, mas não pelos dois simultaneamente!");
            }else{
                System.out.println("\nEste número não é divisível nem por 3 nem por 5");
            }
        }else if ( divCinco != 0){
            System.out.println("\nEste número é divisível por 3 ou por 5, mas não pelos dois simultaneamente!");
        }else{
            System.out.println("\nEste número é divisível por 3 e por 5 simultaneamente!");
        }
    }
}

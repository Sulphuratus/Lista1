import java.util.Scanner;

//import org.graalvm.compiler.lir.aarch64.AArch64ControlFlow.StrategySwitchOp.SwitchClosure;

public class App {
    public static void main(String[] args) throws Exception {
        
        int numero;

        Scanner leia = new Scanner(System.in);
        
        System.out.println("\nDigite um número de 1 a 7 para saber o dia da semana: ");
        //numero = leia.nextInt();
        String temp = leia.nextLine();
        numero = Integer.parseInt(temp);

        switch (numero) {
            case 1:
                System.out.println("\nEste número corresponde a Domingo");
                break;

            case 2:
                System.out.println("\nEste número corresponde a Segunda-feira");
                break;

            case 3:
                System.out.println("\nEste número corresponde a Terça-feira");
                break;

            case 4:
                System.out.println("\nEste número corresponde a Quarta-feira");
                break;

            case 5:
                System.out.println("\nEste número corresponde a Quinta-feira");
                break;

            case 6:
                System.out.println("\nEste número corresponde a Sexta-feira");
                break;

            case 7:
                System.out.println("\nEste número corresponde a Sábado");
                break;

            default:
                System.out.println("\nOpção inválida - Fim do programa!");
                break;
        }
    }
}

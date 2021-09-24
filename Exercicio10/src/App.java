import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    //    String operacao = "";
    
        double pNumero, sNumero, soma, subtrai, multiplica, divide;
        int operacao;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número para a operação que deseja realizar: ");
        System.out.println("1 = Soma, 2 = Subtração, 3 = Multiplicação, 4 = Divisão");
        operacao = leia.nextInt();
    

        System.out.println("Digite o primeiro número: ");
        pNumero = leia.nextDouble();

        System.out.println("Digite o segundo número: ");
        sNumero = leia.nextDouble();

        if ( operacao == 1 ){
            soma = pNumero + sNumero;
            System.out.println("A soma de " + pNumero + " com " + sNumero + " é " + soma);
        }else if ( operacao == 2 ){
            subtrai = pNumero - sNumero;
            System.out.println("A diferença entre " + pNumero + " e " + sNumero + " é de " + subtrai);
        }else if ( operacao == 3 ){
            multiplica = pNumero * sNumero;
            System.out.println("O produto de " + pNumero + " com " + sNumero + " é " + multiplica);
        }else if ( operacao == 4 ){
            divide = pNumero / sNumero;
            System.out.println("A razão entre " + pNumero + " e " + sNumero + " é " + divide);
        }else{
            System.out.println("\nOpção inválida!!" + operacao);
        }
        System.out.println("\nFim do programa de calculadora!!");
    }
}

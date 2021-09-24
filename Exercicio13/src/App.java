import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float salario, prestacao, indice;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o salário do trabalhador: ");
        salario = leia.nextFloat();

        System.out.println("Digite o valor da prestação: ");
        prestacao = leia.nextFloat();

        indice = prestacao/salario;
        
        if(indice > 0.2){
            System.out.println("Empréstimo não concedido!");
        }else{
            System.out.println("Empréstimo concedido!");
        }
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float a, b;

        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        a = leia.nextFloat();

        System.out.println("Digite o número que deseja comparar: ");
        b = leia.nextFloat();

        if (a > b){
            System.out.println("O maior número é: " + a);
        }else if(a < b){
            System.out.println("O maior número é:" + b);
        }else{
            System.out.println("Os números são iguais");
        }
    }
}

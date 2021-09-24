import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int idade;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite a idade do nadador: ");
        idade = leia.nextInt();

        if ( idade >= 5 && idade <= 7){
            System.out.println("\nA categoria do nadador é Infantil A");
        }else if ( idade >= 8 && idade <= 10){
            System.out.println("\nA categoria do nadador é Infantil B");
        }else if ( idade >= 11 && idade <= 13){
            System.out.println("\nA categoria do nadador é Juvenil A");
        }else if ( idade >= 14 && idade <= 17){
            System.out.println("\nA categoria do nadador é Juvenil B");
        }else if ( idade >= 18){
            System.out.println("A categoria do nadador é Senior");
        }
        
    }
}

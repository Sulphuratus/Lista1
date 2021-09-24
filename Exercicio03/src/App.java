import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int idade, anoNascimento;
        char aniversario;
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Qual a sua idade (anos completos)? ");
        idade = leitura.nextInt();
        
        System.out.println("Você já fez aniversário este ano? Digite 'S' para SIM ou 'N' para NÃO");
        aniversario = leitura.next().charAt(0);
        
        if (aniversario == 'n' || aniversario == 'N'){
            anoNascimento = anoAtual - idade -1;
            System.out.println("Você nasceu em " + anoNascimento);    
        }else if (aniversario == 'S' || aniversario == 's'){
            anoNascimento = anoAtual - idade;
            System.out.println("Você nasceu em " + anoNascimento);
        }else{
            System.out.println("Opção inválida!!");
        }
        
    }
}

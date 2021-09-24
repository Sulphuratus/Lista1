import java.text.DecimalFormat;
//import java.util.Locale;
import java.util.Scanner;

// EXERC16 - PROGRAMA QUE LÊ O VALOR DE UM PRODUTO E O ESTADO PARA O QUAL 
// ESTÁ SENDO VENDIDO E CALCULA O VALOR FINAL DE ACORDO COM O IMPOSTO DO 
// ESTADO.

public class App {
    public static void main(String[] args) throws Exception {
        
        String estado, limpa;
        double valor, precoFinal;
        DecimalFormat df = new DecimalFormat("#.##");
        
        Scanner leia = new Scanner(System.in);
        //leia.useLocale(Locale.US);
        
        //System.out.println("Para qual estado irá o produto?");
        //estado = leia.nextLine();

        System.out.println("\nDidgite o valor do produto: ");
        valor = leia.nextFloat();
        limpa = leia.nextLine();

        System.out.println("\nPara qual estado irá o produto?");
        estado = leia.nextLine();

        if ( estado.equals("MG") || estado.equals("mg") ){
            precoFinal = valor * 1.07;
            System.out.println("\nO preço final para MG é R$ " + df.format(precoFinal));
        }else if (estado.equals("SP") || estado.equals("sp")){
            precoFinal = valor * 1.12;
            System.out.println("\nO preço final para SP é R$ " + precoFinal);
        }else if (estado.equals("RJ") || estado.equals("rj")){
            precoFinal = valor * 1.15;
            System.out.println("\nO preço final para RJ é R$ " + precoFinal);
        }else if (estado.equals("MS") || estado.equals("ms")){
            precoFinal = valor * 1.08;
            System.out.println("\nO preço final para MS é R$ " + precoFinal);
        }else{
            System.out.println("\nOpção inválida, fim do programa!");
        }

    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

// EXE09: PROGRAMA QUE LÊ OS VALORES DOS CATETOS DE UM TRIÂNGULO 
// RETÂNGULO, CALCULA E RETORNA O VALOR DA HIPOTENUSA

public class App {
    public static void main(String[] args) throws Exception {
        float a, b;
        double h;
        DecimalFormat df = new DecimalFormat("#.##");
/*

        // ENTRADA E SAÍDA PELO CONSOLE
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro cateto: ");
        a = leia.nextFloat();

        System.out.println("Digite o valor do segundo cateto: ");
        b = leia.nextFloat();

        h = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("O Valor da hipotenusa é: " + h);
*/

        // ENTRADA E SAÍDA PELO JOPTION.PANE

        String tempa = JOptionPane.showInputDialog(null, "Digite o valor do primeiro cateto: ", "Cateto 1", JOptionPane.INFORMATION_MESSAGE);
        a = Float.parseFloat(tempa);

        String tempb = JOptionPane.showInputDialog(null, "Digite o valor do segundo cateto: ", "Cateto 2", JOptionPane.INFORMATION_MESSAGE);
        b = Float.parseFloat(tempb);

        h = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        JOptionPane.showMessageDialog(null, "Valor da hipotenusa: " + df.format(h), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
}

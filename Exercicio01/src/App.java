import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        int anterior, posterior;
    // Leitura e impressão pelo console    
    /*    
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        numero = leitura.nextInt();
        
        System.out.println("O antecessor de " + numero + " é " + (numero-1) + " e o sucessor é " + (numero+1));
    */

    // Leitura e impressão pelo JOption Pane
        
        String temp = JOptionPane.showInputDialog(null, "Digite um número inteiro: ", "Entrada do número", JOptionPane.INFORMATION_MESSAGE);
        numero = Integer.parseInt(temp);
        anterior = numero - 1;
        posterior = numero + 1;
        JOptionPane.showMessageDialog(null, "O antecessor de " + numero + " é " + anterior + " e o sucessor é " + posterior, "Resposta", JOptionPane.INFORMATION_MESSAGE);

    }
}

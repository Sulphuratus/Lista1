//import java.util.Scanner;

import javax.swing.JOptionPane;

// EXERC02 - PROGRAMA QUE LÊ TRÊS NÚMEROS INTEIROS E RETORNA A 
// SOMA DESTES NÚMEROS 

public class App {
    public static void main(String[] args) throws Exception {
        int valor1, valor2, valor3, soma;
        // Entrada dos números e apresentação do resultado pelo Console

        /*Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite três números inteiros apertando <ENTER> após cada número: ");
        
        valor1 = leia.nextInt();
        valor2 = leia.nextInt();
        valor3 = leia.nextInt();
        
        soma = valor1 + valor2 + valor3;

        System.out.println("A soma dos três números é : " + soma);
        */

        // Entrada dos números e apresentação do resultadon usando JOptionPane

        String temp1 = JOptionPane.showInputDialog(null, "Digite o primeiro número inteiro da soma: ", "Entrada 1", JOptionPane.INFORMATION_MESSAGE);
        valor1 = Integer.parseInt(temp1);

        String temp2 = JOptionPane.showInputDialog(null, "Digite o segundo número inteiro da soma: ", "Entrada 2", JOptionPane.INFORMATION_MESSAGE);
        valor2 = Integer.parseInt(temp2);

        String temp3 = JOptionPane.showInputDialog(null, "Digite o terceiro número inteiro da soma: ", "Entrada 3", JOptionPane.INFORMATION_MESSAGE);
        valor3 = Integer.parseInt(temp3);

        soma = valor1 + valor2 + valor3;

        JOptionPane.showMessageDialog(null, "A soma dos três números é: " + soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

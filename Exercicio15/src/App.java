import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

// EXERC15 - PROGRAMA QUE LÊ A ALTURA E O SEXO DE UMA PESSOA
// E CALCULA E IMPRIME O PESO IDEAL


public class App {
    public static void main(String[] args) throws Exception {
        
        double altura, peso;
        char sexo;
        DecimalFormat df = new DecimalFormat("#.#");

        // ENTRADA E APRESENTAÇÃO DE DADOS PELO CONSOLE
    /*    Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite a sua altura em metros: ");
        altura = leia.nextFloat();

        System.out.println("\nDigite seu sexo: M = Masculino, F = Feminino ");
        sexo = (leia.next()).charAt(0);

        if ( sexo == 'M' || sexo == 'm' ){
            peso = altura * 72.2 - 58;
            System.out.println("\nSeu peso ideal é: " + df.format(peso) + " kg ");
        }else if ( sexo == 'F' || sexo == 'f' ){
            peso = altura * 62.1 - 44.7;
            System.out.println("\nSeu peso ideal é: " + df.format(peso) + " kg ");
        }else{
            System.out.println("Opção Inválida!!");
        }*/

        // ENTRADA E APRESENTAÇÃO DE DADOS USANDO JOPTION.PANE

        String temp = JOptionPane.showInputDialog(null, "Informe a sua altura: ", "Altura", JOptionPane.INFORMATION_MESSAGE);
        altura = Double.parseDouble(temp);

        temp = JOptionPane.showInputDialog(null, "Informe seu sexo: M = Masculino, F = Feminino", "Sexo", JOptionPane.INFORMATION_MESSAGE);
        sexo = temp.charAt(0);

        if ( sexo == 'M' || sexo == 'm' ){
            peso = altura * 72.2 - 58;
            JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + df.format(peso) + "  kg", "Peso", JOptionPane.INFORMATION_MESSAGE);
        }else if ( sexo == 'F' || sexo == 'f' ){
            peso = altura * 62.1 - 44.7;
            JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + df.format(peso) + " kg ", "Peso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Opção Inválida!!", "Fim do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }        
}

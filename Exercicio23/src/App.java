import java.text.DecimalFormat;
//import java.util.Scanner;

import javax.swing.JOptionPane;

// EXERC23 PROGRAMA QUE LÊ OS COEFICIENTES DE UMA EQUAÇÃO DE 
// SEGUNDO GRAU, CALCULA DELTA E APRESENTA OS VALORES DAS RAÍZES  

public class App {
    public static void main(String[] args) throws Exception {
        
        int a, b, c;
        double delta, primRaiz, segRaiz;
        DecimalFormat df = new DecimalFormat("#.##"); 
        
        // ENTRADA E APRESENTAÇÃO DOS DADOS PELO CONSOLE
        /*Scanner leia = new Scanner(System.in);

        System.out.println("\nSeja a equação de segundo grau no formato (a)*X^2 + (b)*X + (c)");
        System.out.println("\nDigite o coeficiente (a):");
        //a = leia.nextInt();
        String tempa = leia.nextLine();
        a = Integer.parseInt(tempa);

        System.out.println("\nDigite o coeficiente (b):");
        //b = leia.nextInt();
        String tempb = leia.nextLine();
        b = Integer.parseInt(tempb);

        System.out.println("\nDigite o coeficiente (c):");
        //c = leia.nextInt();
        String tempc = leia.nextLine();
        c = Integer.parseInt(tempc);

        delta = Math.pow(b, 2) - 4 * a * c;

        primRaiz = (Math.sqrt(delta) - b) / (2 * a);
        segRaiz = (- Math.sqrt(delta) - b) / (2 * a);

        if ( delta < 0 ){
            System.out.println("\nNão existe raiz!!");
        }else if ( delta > 0 ){
            System.out.println("\nRaiz 1 = " + df.format(primRaiz) + " e Raiz 2 = " + df.format(segRaiz));
        }else{
            System.out.println("\nRaiz 1 = Raiz 2 = " + df.format(primRaiz));
        }*/

        // LEITURA E APRESENTAÇÃO DOS DADOS USANDO JOPTION PANE

        JOptionPane.showMessageDialog(null, "Seja a equação de segundo grau no formato (a)*X^2 + (b)*X + (c)", "Apresentação",JOptionPane.INFORMATION_MESSAGE);
        String tempa = JOptionPane.showInputDialog(null, "Digite o coeficiente (a):", "Coeficiente (a)", JOptionPane.INFORMATION_MESSAGE);
        a = Integer.parseInt(tempa);

        String tempb = JOptionPane.showInputDialog(null, "Digite o coeficiente (b):", "Coeficiente (b)", JOptionPane.INFORMATION_MESSAGE);
        b = Integer.parseInt(tempb);

        String tempc = JOptionPane.showInputDialog(null, "Digite o coeficiente (c):", "Coeficiente (c)", JOptionPane.INFORMATION_MESSAGE);
        c = Integer.parseInt(tempc);

        delta = Math.pow(b, 2) - 4 * a * c;

        primRaiz = (Math.sqrt(delta) - b) / (2 * a);
        segRaiz = (- Math.sqrt(delta) - b) / (2 * a);

        if ( delta < 0 ){
            JOptionPane.showMessageDialog(null, "Não existe raiz!!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }else if ( delta > 0 ){
            JOptionPane.showMessageDialog(null, "Raiz 1 = " + df.format(primRaiz) + " e Raiz 2 = " + df.format(segRaiz), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Raiz 1 = Raiz 2 = " + df.format(primRaiz), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

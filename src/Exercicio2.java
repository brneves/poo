import javax.swing.*;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){

        float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
        String aux;

        try{

            aux = JOptionPane.showInputDialog("Digite a nota 1");
            nota1 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a nota 2");
            nota2 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Digite a nota do trabalho");
            trabalho = Float.parseFloat(aux);

            media = (nota1 + nota2 + trabalho) / 3;

            if(media < 5) {
                JOptionPane.showMessageDialog(null, "Reprovado com média " + media);
            } else {
                JOptionPane.showMessageDialog(null, "Aprovado com média " + media);
            }

//            System.out.println("Entre com a nota 1");
//            Scanner sc = new Scanner(System.in);
//            nota1 = sc.nextFloat();
//
//            System.out.println("Entre com a nota 2");
//            sc = new Scanner(System.in);
//            nota2 = sc.nextFloat();
//
//            System.out.println("Entre com a nota do trabalho");
//            sc = new Scanner(System.in);
//            trabalho = sc.nextFloat();
//            System.out.println("Média: " + media);


        } catch (NumberFormatException erro) {
            System.out.println("Houve erro na conversão, digite apenas caracteres numéricos" + erro.toString());
        }

    }


}

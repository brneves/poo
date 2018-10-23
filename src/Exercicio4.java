import javax.swing.*;
import java.util.Arrays;

public class Exercicio4 {

    public static void main(String[] args){

//        EXIBE A INFORMAÇÃO 10 VEZES
//        int x;
//
//        for(x = 1; x <= 10; x++){
//            System.out.println( x + ": Wyden");
//        }

//        EXIBE OS NÚMEROS PARES
//        int x;
//
//        for(x = 1; x <= 100; x++){
//
//            if(x % 2 == 0){
//                System.out.println("Par " + x);
//            }
//        }

//        SOMA TODOS OS NUMEROS
//        int x, cont = 0;
//        for(x = 1; x <= 10; x++){
//            cont += x;
//            System.out.println("Contagem atual: " + cont);
//        }
//        System.out.println("Contagem total: " + cont);

        //DIZ A QUANTIDADE DE NÚMEROS PARES E ÍMPARES DO INTERVALO
//        int x, contPar = 0, contImpar = 0;
//        for(x = 1; x <= 99; x ++){
//            if(x % 2 == 0) {
//                contPar++;
//            } else {
//                contImpar++;
//            }
//        }
//        System.out.println("Pares: " + contPar + "\nÍmpares: " + contImpar);

        //RECEBE AS TEMPERATURAS, DA A MEDIA, A MAIOR, A MENOR E QUAIS SÃO ABAIXO DE 32º
        int maior, menor, x, soma = 0;
        int[] temp = new int[5];
        String aux;

        //recebe a temperatura 1
        aux = JOptionPane.showInputDialog("Informe a temperatura 1: ");
        temp[0] = Integer.parseInt(aux);

        //recebe a temperatura 2
        aux = JOptionPane.showInputDialog("Informe a temperatura 2: ");
        temp[1] = Integer.parseInt(aux);

        //recebe a temperatura 3
        aux = JOptionPane.showInputDialog("Informe a temperatura 3: ");
        temp[2] = Integer.parseInt(aux);

        //recebe a temperatura 4
        aux = JOptionPane.showInputDialog("Informe a temperatura 4: ");
        temp[3] = Integer.parseInt(aux);

        //recebe a temperatura 5
        aux = JOptionPane.showInputDialog("Informe a temperatura 5: ");
        temp[4] = Integer.parseInt(aux);

        for(x = 0; x < 5; x++){

            if ( temp[x] < 32 ) {

            }

            soma += temp[x];
        }

        Arrays.sort(temp);

        maior = temp[4];
        menor = temp[0];

        JOptionPane.showMessageDialog(null,"Média: " + (soma / 5) + "\nMaior temperatura: " + maior + "\nMenor temperatura: " + menor );
    }

}

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Arrays;

public class ListaExercicios {

    /* EXERCÍCIO 1
    public static void main(String[] args){

        int valor;
        String aux;

        aux = JOptionPane.showInputDialog("Informe o valor");
        valor = Integer.parseInt(aux);

        if(valor > 10){
            JOptionPane.showMessageDialog(null, "É maior que 10");
        } else {
            JOptionPane.showMessageDialog(null, "Não é maior que 10");
        }

    }
    */

    /* EXERCÍCIO 2
    public static void main(String[] args){

        int valor;
        String aux;

        aux = JOptionPane.showInputDialog("Informe o valor");
        valor = Integer.parseInt(aux);

        if(valor == 0){
            JOptionPane.showMessageDialog(null, "É Positivo");
        } else {
            JOptionPane.showMessageDialog(null, "É Negativo");
        }

    }
    */

    /* EXERCÍCIO 3
    public static void main(String[] args){

        int v1, v2;
        String aux;

        aux = JOptionPane.showInputDialog("Informe o valor 1");
        v1 = Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog("Informe o valor 2");
        v2 = Integer.parseInt(aux);

        if(v1 > v2){
            JOptionPane.showMessageDialog(null, v1);
        } else {
            JOptionPane.showMessageDialog(null, v2);
        }

    }
    */

    /* EXERCÍCIO 4
    public static void main(String[] args){

        int v1, v2;
        String aux;

        aux = JOptionPane.showInputDialog("Informe o valor 1");
        v1 = Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog("Informe o valor 2");
        v2 = Integer.parseInt(aux);

        if(v1 > v2){
            JOptionPane.showMessageDialog(null, v1 + "\n" + v2);
        } else {
            JOptionPane.showMessageDialog(null, v2 + "\n" + v1);
        }

    }
    */

    /* EXERCÍCIO 5
    public static void main(String[] args){

        float altura;
        Double pesoIdeal;
        String nome, sexo, aux;

        nome = JOptionPane.showInputDialog("Informe o nome");
        sexo = JOptionPane.showInputDialog("Informe o sexo");
        aux = JOptionPane.showInputDialog("Informe a altura");
        altura = Float.parseFloat(aux);

        if(sexo.equals("M")){
            pesoIdeal = (72.7 * altura) - 58;

            JOptionPane.showMessageDialog(null, nome + ", seu peso ideal como homem é: " + pesoIdeal);
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
            JOptionPane.showMessageDialog(null, nome + ", o seu peso ideal como mulher é: " + pesoIdeal);
        }

    }
    */

    /* EXERCÍCIO 6
    public static void main(String[] args) {
        int i;

        for(i = 10; i >= 1; i--){
            JOptionPane.showMessageDialog(null, i);
        }
    }
    */

    /* EXERCÍCIO 7
    public static void main(String[] args){

        int n, i;
        String aux;

        aux = JOptionPane.showInputDialog("Informe N");
        n = Integer.parseInt(aux);

        for(i = 1; i <= n; i++){
            JOptionPane.showMessageDialog(null, i);
        }
    }
    */

    /* EXERCÍCIO 8
    public static void main(String[] args){

        int n;

        for(n = 1; n <= 10; n++){
            JOptionPane.showMessageDialog(null, "8 x " + n + " = " + (8 * n) );
        }

    }
    */

    /* EXERCÍCIO 9
    public static void main(String[] args){
        int n, i;
        String aux;

        aux = JOptionPane.showInputDialog("Informe o número");
        n = Integer.parseInt(aux);

        if(n > 10){
            JOptionPane.showMessageDialog(null, "O número informado deve estar entre 1 e 10");
            aux = JOptionPane.showInputDialog("Informe o número");
            n = Integer.parseInt(aux);
        }

        for(i = 1; i <= 10; i++){
            JOptionPane.showMessageDialog(null, n + " x " + i + " = " + (n * i) );
//            System.out.println(n + " x " + i + " = " + (n * i) );
        }

    }
    */

    public static void main(String[] args) {

        int soma = 0, i;
        int[] n = new int[10];
        String aux;

        for(i = 0; i < 10; i++) {
            aux = JOptionPane.showInputDialog("Informe o numero " + ( i + 1 ));
            n[i] = Integer.parseInt(aux);

            if(n[i] < 40) {
                soma += n[i];
            }
        }

        JOptionPane.showMessageDialog(null, soma);

//        aux = JOptionPane.showInputDialog("Informe o número 1: ");
//        n[0] = Integer.parseInt(aux);
//
//        aux = JOptionPane.showInputDialog("Informe o número 2: ");
//        n[1] = Integer.parseInt(aux);
//
//        aux = JOptionPane.showInputDialog("Informe o número 3: ");
//        n[2] = Integer.parseInt(aux);
//
//        aux = JOptionPane.showInputDialog("Informe o número 4: ");
//        n[3] = Integer.parseInt(aux);
//
//        aux = JOptionPane.showInputDialog("Informe o número 5: ");
//        n[4] = Integer.parseInt(aux);
//
//        aux = JOptionPane.showInputDialog("Informe o número 6: ");
//        n[5] = Integer.parseInt(aux);
//
//        aux = JOptionPane.showInputDialog("Informe o número 7: ");
//        n[6] = Integer.parseInt(aux);
//
//        aux = JOptionPane.showInputDialog("Informe o número 8: ");
//        n[7] = Integer.parseInt(aux);
//
//        aux = JOptionPane.showInputDialog("Informe o número 9: ");
//        n[8] = Integer.parseInt(aux);
//
//        aux = JOptionPane.showInputDialog("Informe o número 10: ");
//        n[9] = Integer.parseInt(aux);
//
//        for (i = 0; i < 10; i++) {
//            if(n[i] < 40) {
//                soma += n[i];
//            }
//        }
//
//        JOptionPane.showMessageDialog(null, soma);
        
    }

}

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Exercicios0111 {

    public static void main(String[] args) {

        //QUESTÃO 11
        /*
        String comprasV = 0, comprasP = 0, codigo, aux;
        Float valor;
        int  i;

        for (i = 1; i <= 5; i++) {

            codigo = JOptionPane.showInputDialog("Informe o código da " + i + "ª compra");
            aux = JOptionPane.showInputDialog("Informe o valor da " + i + "ª compra");
            valor = Float.parseFloat(aux);
            if (codigo.equals("V") || codigo.equals("v")) {
                comprasV += valor;
            } else if (codigo.equals("P") || codigo.equals("p")) {
                comprasP += valor;
            } else {
                JOptionPane.showMessageDialog(null, "O código informado é inválido!");
                i--;
            }

        }

        JOptionPane.showMessageDialog(null,
                "O valor total das compras  à vista é: " + comprasV +
                        "\n O valor total das compras a prazo é: " + comprasP +
                        "\n O valor total das compras é: " + (comprasP + comprasV) +
                        "\n O valor da primeira prestação das compras a prazo é: " + comprasP / 3);

        */

        //QUESTÃO 12
        /*
        String aux;
        Float altura, peso, mediaAlt = null, percent, qtdPeso = null;
//        Double altura, peso, mediaAlt = null, percent, qtdPeso;
        int i, idade, qtd = 0, qtdAlt = 0;

        for(i = 1; i <= 10; i++) {

            aux = JOptionPane.showInputDialog("Informe a idade da pessoa " + i);
            idade = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Infoema a altura da pessoa " + i);
            altura = Float.parseFloat(aux);
//            altura = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog("Informe o peso da pessoa " + i);
            peso = Float.parseFloat(aux);
//            peso = Double.parseDouble(aux);

            if(idade > 50){
                qtd++;
            }

            if (idade > 10 && idade < 20){
                mediaAlt += altura;
                qtdAlt++;
            }

            if(peso < 40){
                qtdPeso += qtdPeso + peso;
            }
        }

        mediaAlt /= qtdAlt;
        percent = (qtdPeso / 10) * 100;

        JOptionPane.showMessageDialog(null, "A quantidade de pessoas com idade superior a 50 anos é: " + qtd + "\n A média das alturas das pessoas com idade entre 10 e 20 anos é: " + mediaAlt + "\n A percentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas é: " + percent);

        */

        //QUESTÃO 13
        /*
        int i, idade = 0, qtdPeso = 0;
        String aux;
        Float peso, media;

        for (i = 1; i <= 7; i++) {
            aux = JOptionPane.showInputDialog("Informe a idade da " + i + "ª pessoa");
            idade = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Informe o peso da " + i + "ª pessoa");
            peso = Float.parseFloat(aux);

            if(peso > 90){
                qtdPeso++;
            }

            idade += idade;

        }

        JOptionPane.showMessageDialog(null,
                "A quantidade de pessoas com mais de 90 quilos é: " + qtdPeso +
                        "\n A média das idades é: " + (idade / 7));
        */

        //QUESTÃO 14
        String aux, olhos, cabelos;
        int i, idade, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
        float peso = 0, altura = 0, mediaIdade = 0;

        for (i = 1; i <= 3; i++) {
            aux = JOptionPane.showInputDialog("Informe a idade da " + i + "ª pessoa");
            idade = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Informe o peso da " + i + "ª pessoa");
            peso = Float.parseFloat(aux);
            aux = JOptionPane.showInputDialog("Informe a altura da " + i + "ª pessoa");
            altura = Float.parseFloat(aux);
            olhos = JOptionPane.showInputDialog("Informe a cor dos olhos (A - azul, P - preto, V - verde, C - castanho)");
            cabelos = JOptionPane.showInputDialog("Informe a cor dos cabeços (P - preto, C - castanho, L - louro, R - ruivo)");

            if (idade > 50 && peso < 60) {
                cont1++;
            }

            if (altura < 1.5) {
                mediaIdade += idade;
                cont2++;
            }

            if (olhos.equals("A")) {
                cont3++;
            }

            if (cabelos.equals("R") && olhos != "A") {
                cont4++;
            }

        }

        JOptionPane.showMessageDialog(null,
                "A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos é: " + cont1 +
                        "\n A média das idades das pessoas com altura inferior a 1,50 é: " + (mediaIdade / cont2) +
                        "\n A percentagem de pessoas com olhos azuis entre todas as pessoas analisadas é: " + (cont3 / 3) * 100 +
                        "\n A quantidade de pessoas ruivas e que não possuem olhos azuis é: " + cont4);

    }

}

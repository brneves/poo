import javax.swing.*;

public class Exercicio3 {

    public static void main(String[] args) {

        float lado1, lado2, lado3;
        String aux;

        aux = JOptionPane.showInputDialog("Informe o lado 1");
        lado1 = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog("Informe o lado 2");
        lado2 = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog("Informe o lado 3");
        lado3 = Float.parseFloat(aux);

        if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
        } else if (lado1 == lado2 && lado2 != lado3) {
            JOptionPane.showMessageDialog(null, "Triângulo Isóceles");
        } else if (lado1 == lado3 && lado1 != lado2) {
            JOptionPane.showMessageDialog(null, "Triângulo Isóceles");
        } else if (lado1 != lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "Triângulo Isóceles");
        } else {
            JOptionPane.showMessageDialog(null, "Triângulo Escaleno");
        }


    }

}

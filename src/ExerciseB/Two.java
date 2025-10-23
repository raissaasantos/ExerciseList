package ExerciseB;

import javax.swing.*;

public class Two {
    public static void main(String[] args) {
        String nValue = JOptionPane.showInputDialog("Digite um valor: ");
        double num = Double.parseDouble(nValue);

        if (num < 0 && num % 2 == 0){
            JOptionPane.showMessageDialog(null,"Negativo e par");
        }
        else if(num < 0  && num % 2 != 0){
            JOptionPane.showMessageDialog(null, "Negativo e impar");
        }
        else if (num >= 0  && num % 2 == 0){
            JOptionPane.showMessageDialog(null, "Positivo e par");
        }
        else {
            JOptionPane.showMessageDialog(null, "Positivo e impar");
        }
    }
}

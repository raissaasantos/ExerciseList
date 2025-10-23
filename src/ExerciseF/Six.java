package ExerciseF;

import javax.swing.*;

public class Six {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Enter a value: ");
        double nValue = Double.parseDouble(value);
        double discount = 0.05;

        nValue *= (1 - discount);

        JOptionPane.showMessageDialog(null, "With 5% discount: R$ "+nValue);

    }
}

package ExerciseE;

import javax.swing.*;

public class Five {
    public static void main(String[] args) {
        double minimumWage = 1293.20;

        String nValue = JOptionPane.showInputDialog("Salary: ");
        double salary = Double.parseDouble(nValue);

        double amount = salary / minimumWage;

        JOptionPane.showMessageDialog(null, String.format("You receive %.2f", amount));
    }
}

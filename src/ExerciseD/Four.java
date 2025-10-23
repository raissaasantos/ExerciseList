package ExerciseD;

import javax.swing.*;

public class Four {
    public static void main(String[] args) {
        String nValue = JOptionPane.showInputDialog("Enter an integer: ");
        int num = Integer.parseInt(nValue);
        int before = num - 1;
        int after = num + 1;

        JOptionPane.showMessageDialog(null,"Before: "+before+"\nAfter: "+after);
    }
}

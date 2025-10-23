package ExerciseC;

import javax.swing.*;

public class Three {
    public static void main(String[] args) {
        int A = 2;
        int B = 2;

        if (A == B){
            int sum = A + B;
            JOptionPane.showMessageDialog(null, "Soma: "+sum);
        }
        else {
            int mult = A * B;
            JOptionPane.showMessageDialog(null, "Multiplication: "+mult);
        }
    }
}

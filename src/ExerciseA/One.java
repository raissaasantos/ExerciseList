package ExerciseA;

import javax.swing.JOptionPane;

public class One {
    public static void main(String[] args) {
        String aValue = JOptionPane.showInputDialog("Digite um inteiro para o valor de A:");
        int A = Integer.parseInt(aValue);

        String bValue = JOptionPane.showInputDialog("Digite um inteiro para o valor de B:");
        int B = Integer.parseInt(bValue);

        String cValue = JOptionPane.showInputDialog("Digite um inteiro para o valor de C:");
        int C = Integer.parseInt(cValue);

        int sum = A + B;

        if (sum < C) {
            JOptionPane.showMessageDialog(null, "A soma entre A e B é: " +sum+", soma menor que C");
        } else {
            JOptionPane.showMessageDialog(null, "A soma entre A e B é: "+sum+",Soma maior que C");
        }
    }
}

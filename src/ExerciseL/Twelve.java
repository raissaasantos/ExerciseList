package ExerciseL;

import java.util.Locale;
import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the product's price: ");
        double price = sc.nextDouble();

        System.out.println("============================================\nSelect the payment method: " +
                "\n1. Cash or Pix (15% discount)\n" +
                "2. One-time credit card payment (10% discount)\n" +
                "3. Two installments by credit card (no interest)\n" +
                "4. Three or more installments by credit card (10% interest)\n" +
                "============================================\n");
        int paymentMethod = sc.nextInt();

        switch (paymentMethod){
            case 1:
                double cashDiscount = price - (price * 0.15);
                System.out.printf("Total: %.2f%n", cashDiscount);
            break;
            case 2:
                double oneTimeCreditCardDiscount = price - (price * 0.10);
                System.out.printf("Total: %.2f%n", oneTimeCreditCardDiscount);
            break;
            case 3:
                System.out.printf("Total: %.2f%n", price);
            break;
            case 4:
                double threeTimesCreditCard = price + (price * 0.10);
                System.out.printf("Total: %.2f%n", threeTimesCreditCard);
            break;
            default:
                System.out.println("Invalid option");
        }

        sc.close();
    }
}

package absoft;

import java.util.Arrays;
import java.util.Scanner;

public class Test13_Second {

    public static void calculateTotal() {


        String productName;
        double price;
        int qty;

        String[] productsArray = new String[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Input name for " + (i + 1) + " product: ");
            String nameOfProduct = new Scanner(System.in).nextLine();

            System.out.print("Input price for " + (i + 1) + " product: ");
            Double priceOfProduct = new Scanner(System.in).nextDouble();

            System.out.print("Input qty for " + (i + 1) + " product: ");
            int qtyOfProduct = new Scanner(System.in).nextInt();

            if (priceOfProduct == 0) {
                System.out.println();
                System.out.println("Price must be over 0");
                System.exit(0);
            }

            if (qtyOfProduct == 0) {
                System.out.println();
                System.out.println("Qty must be over 0");
                System.exit(0);
            }

            productsArray[i] = nameOfProduct + " | " + (priceOfProduct * qtyOfProduct);
        }
        System.out.println();
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println(productsArray[i]);
        }

    }
}
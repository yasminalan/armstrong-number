package exercises;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        /* TASK:
       Take the quantity and list price of a product from the user. Ask the user
       if they have a customer card.

       If the user has a customer card and buys more than 10 products, apply a 20% discount,
       otherwise apply a 15% discount.

       If the user does not have a customer card and buys more than 10 products, apply a 15% discount,
       and if they buy 10 or fewer products, apply a 10% discount.
    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantity of the product: ");
        int quantity = scanner.nextInt();

        System.out.print("The list price of the product: ");
        double listPrice = scanner.nextDouble();

        System.out.println("Do you have a customer card? Please answer 'yes' or 'no'.");
        String answer = scanner.next();

        double price = quantity * listPrice;

        if (answer.equalsIgnoreCase("yes") && quantity > 10) {
            price = price - (price * 20) / 100;
        } else if (answer.equalsIgnoreCase("no") && quantity > 10) {
            price = price - (price * 15) / 100;
        } else {
            price = price - (price * 10) / 100;
        }

        System.out.println("Total price after discount: " + price);
    }
}

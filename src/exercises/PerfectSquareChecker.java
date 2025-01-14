package exercises;

import java.util.Scanner;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        /* TASK:
       Find whether a given positive number is a perfect square or not.
       If it's a perfect square, print true; otherwise, print false.
       Note: Do not use functions like sqrt.

       Example 1:
       Input: 16
       Output: true
       Note: This number is a perfect square because 4*4 = 16

       Example 2:
       Input: 25
       Output: true
       Note: This number is a perfect square because 5*5 = 25

       Example 3:
       Input: 14
       Output: false
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        boolean perfectSquareChecker = false;

        int i = 1;
        while (i * i <= number) {
            if (i * i == number) {
               perfectSquareChecker = true;
                System.out.println("This number is a perfect square because " + i + "*" + i + " = " + i * i);
                break;
            }
            i++;
        }
        if (!perfectSquareChecker) {
            System.out.println("This number is not a perfect square.");
        }
    }
}

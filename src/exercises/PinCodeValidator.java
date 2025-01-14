package exercises;

import java.util.Scanner;

public class PinCodeValidator {
    public static void main(String[] args) {
        /* TASK:
       Write a program that verifies a PIN code (as a string) and gives the user
       3 attempts to enter the correct PIN. If the user fails to enter the correct
       PIN after 3 attempts, the program should terminate.
    */

        boolean pinCodeValidator = false;
        String correctPin = "pwd123";
        int attempts = 3;


        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your PIN. You have " + attempts + " attempts.");
            String enteredPin = scanner.next();
             attempts--;

            if (enteredPin.equals(correctPin)) {
                System.out.println("Access granted. Loading...");
                pinCodeValidator = true;
                break;
            }
        } while (attempts != 0);

        if (!pinCodeValidator) {
            System.out.println("Incorrect PIN. No attempts left. Access denied.");
        }
    }
}

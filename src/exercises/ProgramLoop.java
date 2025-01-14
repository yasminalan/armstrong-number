package exercises;

import java.util.Scanner;

public class ProgramLoop {
    public static void main(String[] args) {
        /* TASK:
          Write a program that continuously prints "Program is running"
          until the user enters "x". When the user enters "x", the program
          should display "Program ended".

*/
        String stop;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Program is running...");
            System.out.print("Enter x to end the program: ");
            stop = scanner.next();
        } while (!stop.equalsIgnoreCase("x"));
        System.out.println("Program ended.");
    }
}

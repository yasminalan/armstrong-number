package exercises;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        /*   Get 2 numbers from the user.
         1st number: Base
         2nd number: Exponent
         Create a code that calculates the power of the 1st number raised to the 2nd number.
         Example: 3, 3  Result = 27
                  2, 3  = 2*2*2 = 8
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base number");
        int base = scanner.nextInt();

        System.out.println("Enter the exponent");
        int exponent = scanner.nextInt();

        int i = 0;
        int result = 1;

        while(i < exponent) {
            result *= base;
            i++;
        }
        System.out.println("The result is: " + result);
    }
}

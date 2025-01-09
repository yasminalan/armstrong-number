package exercises;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /* TASK:
       Create a code that checks whether a given number is an Armstrong number or not.
       An Armstrong number is a number equal to the sum of the cubes of its digits.
       For example:
       153 = (1*1*1) + (5*5*5) + (3*3*3)
        */

        int original = 153;
        int digits = String.valueOf(original).length();
        int number = original;
        int sum = 0;

        while (number > 0) {
            sum = sum + (int) Math.pow(number % 10, digits);
            number /= 10;
        }
        if (sum == original) {
            System.out.println("This is an Armstrong number.");
        } else {
            System.out.println("This is not an Armstrong number.");
        }
    }
}

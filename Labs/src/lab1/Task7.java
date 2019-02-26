package lab1;

import java.util.Scanner;

/**
 * Write a program which prompts user for the number "X", reads it from the
 * keyboard, and saves it in an int variable called "x".
 * • Then prints "One", "Two",... , "Nine" if the int variable "x" is 1, 2,... , 9 and
 * "Other" if “x” >9, respectively.
 * • Use (a) a "nested-if" statement;
 * • (b) a "switch-case" statement.
 * • The output shall look like (user input – in green):
 * • -Enter number x: 1 -Enter number x: 12
 * • -One - Other
 */
public class Task7 {
    public static void main(String[] args) {
        String[] numbers = new String[]{"one", "Two", "Three", "four", "five", "six", "Seven", "Eight", "Nine"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A:");
        int x = scanner.nextInt();
        if (x <= 9) {
            if (x > 0) {
                System.out.println(numbers[x - 1]);
            } else {
                System.out.println("other");
            }
        } else {
            System.out.println("other");
        }

    }

}

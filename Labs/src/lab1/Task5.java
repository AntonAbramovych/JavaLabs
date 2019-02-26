package lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a console program that prints result of Ternary operator for integer variable
 * initialization
 */
public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = scanner.nextInt();
        int b = a > 10 ? 5 : 7;
        System.out.println("B =" + b);
        System.out.println("Wrong input");


    }

}

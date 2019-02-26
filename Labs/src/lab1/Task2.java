package lab1;

/**
 * Write a console program that prints result of each of arithmetic operations (+,-,/,*,%) for
 * two variables of primitive data types.
 **/
public class Task2 {

    public static void arithmeticOperations() {
        int a = 10;
        int b = 2;
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a%b=" + (a % b));
    }

    public static void main(String[] args) {
        arithmeticOperations();
    }
}

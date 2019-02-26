package lab1;

/**
 * Write a console program that prints result of increment and decrement in prefix and
 * postfix mode for integer variable.
 */
public class Task4 {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("postfix increment " + (a++));
        System.out.println("postfix decrement " + (a--));
        System.out.println("prefix decrement " + (--a));
        System.out.println("prefix increment " + (++a));

    }
}

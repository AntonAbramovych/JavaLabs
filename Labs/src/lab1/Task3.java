package lab1;

/**
 * Write a console program that prints result of each of arithmetic logical
 * (AND,OR,NOT,XOR) for two variables of boolean data type.
 */
public class Task3 {
    public static void arithmeticLogical() {
        boolean a = true;
        boolean b = false;
        System.out.println("a AND b=" + (a & b));
        System.out.println("a OR b=" + (a | b));
        System.out.println("!a=" + (!a));
        System.out.println("a XOR b=" + (a ^ b));


    }

    public static void main(String[] args) {
        arithmeticLogical();
    }

}

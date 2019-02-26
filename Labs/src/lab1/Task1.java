package lab1;

/**
 * Write a console program prints on console each of the primitive data types
 * (byte,short,int,long,float,double,char,boolean).
 */
public class Task1 {
    public static void print() {
        byte _byte = 1;
        System.out.println("byte " + _byte);
        short _short = 2;
        System.out.println("short " + _short);
        int _int = Integer.MAX_VALUE;
        System.out.println("int " + _int);
        long _long = 10000L;
        System.out.println("long " + _long);
        float _float = Float.MAX_VALUE;
        System.out.println("float " + _float);
        double _double = Double.MAX_VALUE;
        System.out.println("double " + _double);
        char _char = 'H';
        System.out.println("char " + _char);
        boolean _boolean = true;
        System.out.println("boolean " + _boolean);
    }

    public static void main(String[] args) {
        print();

    }
}

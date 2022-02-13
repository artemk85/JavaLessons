package ru.artemk;

public class Test3 {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;

        result = i2/d1 + d2%i1 - l;
        System.out.println("Result = " + result);

        int a = 5;
        int b = 8;

        a = a-- - --a + ++a + a++ + a; // 5 - 3 + 4 + 4 + 5
        b = ++b - b++ + ++b - --b; // 9 - 9 + 11 - 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

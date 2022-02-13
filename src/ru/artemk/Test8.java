package ru.artemk;

class staticTest {

    public static int proizvedenie(int a, int b, int c) {
        return a *b * c;
    }

    public static void delenie(int a, int b) {
        System.out.println("Частное = " + (a/b) + "; Остаток = " + (a%b));
    }
}


class staticTest2 {
    public static final double Pi = 3.14;

    double ariaOfCircle(double r){
        return Pi * r * r;
    }

    static double lengthOfCircle(double r) {
        return 2 * Pi * r;
    }

    public void showInfo(double radius) {
        System.out.println(String.format("Радиус = %.2f", radius));
        System.out.println(String.format("Площадь круга с радиусом %.2f = %.2f", radius, ariaOfCircle(radius)));
        System.out.println(String.format("Длина круга с радиусом %.2f = %.2f", radius, lengthOfCircle(radius)));
    }
}

public class Test8 {
    public static void main(String[] args) {
        System.out.println("Произведение чисел равно : " + staticTest.proizvedenie(1,2,3));
        System.out.println("Произведение чисел равно : " + staticTest.proizvedenie(2,2,2));

        staticTest.delenie(2,2);
        staticTest.delenie(5,2);

        System.out.println("-----------------------------");
        staticTest2 st = new staticTest2();
        st.showInfo(3);
    }
}

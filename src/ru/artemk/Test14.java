package ru.artemk;

public class Test14 {

    static void time(){
        OUTER: for (int h=0; h<=6; h++) {
            MIDDLE: for (int m=0; m<=59; m++) {
                if (h > 1 && (m%10 == 0)) break OUTER;
                for (int s=0; s<=59; s++) {
                    if (s * h > m) {
                        continue MIDDLE;
                    }
                    System.out.println(String.format("%d:%d:%d", h, m, s));
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}

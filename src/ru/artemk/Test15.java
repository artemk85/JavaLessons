package ru.artemk;

public class Test15 {

    static void time(){
        int h = 0;
        OUTER: while (h<=6) {
            int m = -1;
            MIDDLE: do {
                int s = 0;
                m++;
                if (h > 1 && (m%10 == 0)) break OUTER;
                INNER: while(s < 60) {
                    if (s * h > m) continue MIDDLE;
                    System.out.println(String.format("%d:%d:%d", h, m, s));
                    s++;
                }
            } while(m < 59);
            h++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}
